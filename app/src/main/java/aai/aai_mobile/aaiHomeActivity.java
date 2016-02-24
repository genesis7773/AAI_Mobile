package aai.aai_mobile;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.aai.aai_mobile.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

import aai.aai_mobile.ui.FragmentDrawer;
import butterknife.Bind;
import butterknife.ButterKnife;

// TODO: 1/23/2016 We need a way to load the reports and parse the data to be handled across the app.


public class aaiHomeActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aai_home);
        ButterKnife.bind(this);
        addListenerOnButton();
        FragmentDrawer fragDraw;
        //Testing backend
        //new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "You!"));
        //Nav bar, may move to new activity
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        fragDraw = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        fragDraw.setUp(R.id.fragment_navigation_drawer, mDrawerLayout, mToolbar);
        fragDraw.setDrawerListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_aai_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onDrawerItemSelected(View view, int position) {

    }




    public void addListenerOnButton() {


        //btnSetupBuild = (btnSetupBuild) findViewById(R.id.btnSetupBuild);
        Button btnSetupBuild = (Button) findViewById(R.id.btnNewBuild);
        Button btnResumeJob = (Button) findViewById(R.id.btnResumeJob);


        btnSetupBuild.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aaiHomeActivity.this, preEngineering.class);
                startActivity(intent);

            }


        });

        btnResumeJob.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aaiHomeActivity.this, resume.class);
                startActivity(intent);

            }


        });

    }


    //Google Cloud Backend
    class EndpointsAsyncTask extends AsyncTask<Pair<Context, String>, Void, String> {
        private MyApi myApiService = null;
        private Context context;

        @Override
        protected String doInBackground(Pair<Context, String>... params) {
            if (myApiService == null) {  // Only do this once
                MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                        new AndroidJsonFactory(), null)
                        // options for running against local devappserver
                        // - 10.0.2.2 is localhost's IP address in Android emulator
                        // - turn off compression when running against local devappserver
                        .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                        .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                            @Override
                            public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                                abstractGoogleClientRequest.setDisableGZipContent(true);
                            }
                        });
                // end options for devappserver

                myApiService = builder.build();
            }

            context = params[0].first;
            String name = params[0].second;

            try {
                return myApiService.sayHi(name).execute().getData();
            } catch (IOException e) {
                return e.getMessage();
            }
        }

        @Override
        protected void onPostExecute(String result) {
            Toast.makeText(context, result, Toast.LENGTH_LONG).show();
        }
    }

}
