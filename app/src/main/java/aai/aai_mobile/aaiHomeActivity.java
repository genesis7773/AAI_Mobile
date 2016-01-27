package aai.aai_mobile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

// TODO: 1/23/2016 We need a way to load the reports and parse the data to be handled across the app. 
public class aaiHomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aai_home);
        addListenerOnButton();
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


    public void addListenerOnButton() {

        final Context context = this;

        //btnSetupBuild = (btnSetupBuild) findViewById(R.id.btnSetupBuild);
        Button btnSetupBuild = (Button) findViewById(R.id.btnNewBuild);
        Button btnResumeJob = (Button) findViewById(R.id.btnResumeJob);


        btnSetupBuild.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, LoadEdit.class);
                startActivity(intent);

            }


        });

        btnResumeJob.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, resume.class);
                startActivity(intent);

            }


        });

    }
}