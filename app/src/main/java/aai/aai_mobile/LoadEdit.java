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

public class LoadEdit extends AppCompatActivity {

    final Context context = this.getApplicationContext();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadd_edit);
        addListenerOnButton();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_loadd_edit, menu);
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


        Button btnAddAHU = (Button) findViewById(R.id.btnAddAHU);

        btnAddAHU.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AddAHU.class);
                startActivity(intent);

            }


        });


        Button btnEditCFM = (Button) findViewById(R.id.btnEditCFM);

        btnEditCFM.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v){

                Intent intent = new Intent(context,editCfm.class);
                startActivity(intent);


            }
        });

        Button btnEditNamePlate = (Button) findViewById(R.id.btnEditNamePlate);

        btnEditNamePlate.setOnClickListener(new OnClickListener() {

           @Override
           public void onClick(View v){
               Intent intent = new Intent(context, editNamePlate.class);
               startActivity(intent);
           }

        });


    }





    public void btnSetupBuild(View v) {
        finish();
    }
}