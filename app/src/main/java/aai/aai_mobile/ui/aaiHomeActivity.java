package aai.aai_mobile.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Pair;
import android.view.MenuItem;
import android.widget.Toast;

import com.aai.aai_mobile.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

import aai.aai_mobile.R;
import butterknife.Bind;
import butterknife.ButterKnife;

// TODO: 1/23/2016 We need a way to load the reports and parse the data to be handled across the app.


public class
        aaiHomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    @Bind(R.id.container)
    Container container;
    @Bind(R.id.main_drawer)
    NavigationView mDrawer;
    private ActionBarDrawerToggle drawerToggle;
    private int mSelectedId;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aai_home);
        ButterKnife.bind(this);
        setToolbar();
        initView();
        drawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout,mToolbar,R.string.drawer_Open,R.string.drawer_close);
        mDrawerLayout.setDrawerListener(drawerToggle);
        drawerToggle.syncState();
        mSelectedId=savedInstanceState ==null ? R.id.navigation_Home: savedInstanceState.getInt("SELECTED_ID");
        itemSelection(mSelectedId);
        //Testing backend
        //new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "You!"));
        //Nav bar, may move to new activity

    }
    //sets toolbar
    private void setToolbar(){
        if(mToolbar != null){
            setSupportActionBar(mToolbar);
        }
    }
    //initiates the view
    private void initView(){
        mDrawer.setNavigationItemSelectedListener(this);
    }
    //returns container
    public Container getContainer(){
        return container;
    }
    //handles back press to exit app
    @Override public void onBackPressed() {
        boolean handled = container.onBackPressed();
        if (!handled) {
            finish();
        }
    }

    private void itemSelection(int mSelectedId) {
    //// TODO: 4/5/2016 : This does jack shit right now. 
        switch(mSelectedId){

            case R.id.navigation_Home:
                mDrawerLayout.closeDrawer(GravityCompat.START);
                break;

            case R.id.navigation_PreEngineering:
                mDrawerLayout.closeDrawer(GravityCompat.START);
                break;

            case R.id.navigation_Setup:
                mDrawerLayout.closeDrawer(GravityCompat.START);
                break;

            case R.id.navigation_Create_Report:
                mDrawerLayout.closeDrawer(GravityCompat.START);
                break;

            case R.id.navigation_Open_Report:
                mDrawerLayout.closeDrawer(GravityCompat.START);
                break;

            case R.id.navigation_Current_Report:
                mDrawerLayout.closeDrawer(GravityCompat.START);
                break;
        }

    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }



    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        item.setChecked(true);
        mSelectedId=item.getItemId();
        itemSelection(mSelectedId);
        return true;
    }


    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        //save selected item so it will remains same even after orientation change
        outState.putInt("SELECTED_ID",mSelectedId);
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
