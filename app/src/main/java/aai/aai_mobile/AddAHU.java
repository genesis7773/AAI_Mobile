package aai.aai_mobile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

/*


//APACHE POI EXCEL WRITER
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
*/


public class addAHU extends AppCompatActivity {


    private EditText ahuName, ahuLocation, areaServed,equipManu,ahuModel, ahuSerial;
    //private Button next;
    private Context context;
    private static final int AHUDATA_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ahu);
        addListenerOnButton();
        context = this.getApplicationContext();
        ahuName = (EditText) findViewById(R.id.txtAddAHU);
        ahuLocation = (EditText) findViewById(R.id.txtLocation);
        areaServed = (EditText) findViewById(R.id.txtServes);
        equipManu = (EditText) findViewById(R.id.txtManu);
        ahuModel = (EditText) findViewById(R.id.txtModel);
        ahuSerial = (EditText) findViewById(R.id.txtSerial);

          }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_ahu, menu);
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




    //Functions to grab data from text boxes
    private String getAHUName() {


        return ahuName.getText().toString();
    }

    private String getAHULocation() {


        return ahuLocation.getText().toString();
    }

    private String getAreaServed() {


        return areaServed.getText().toString();

    }

    private String getEquipManufacturer() {


        return equipManu.getText().toString();

    }

    private String getAHUModel() {


        return ahuModel.getText().toString();

    }

    private String getSerial() {


        return ahuSerial.getText().toString();

    }

    //grabs all data.
    private void grabAllData(String sfile) {


        String ahuName = "AHU NAME: " + getAHUName() + "/n";
        String ahuLocation ="AHU LOCATION: " + getAHULocation() + "/n";
        String areaServed ="AREA SERVED: " + getAreaServed() + "/n";
        String equipManu = "EQUIPMENT MANUFACTURER: " + getEquipManufacturer() + "/n";
        String ahuModel = "MODEL NUMBER: " + getAHUModel() + "/n";
        String ahuSerial = "SERIAL NUMBER: " + getSerial() + "/n";

        //Prints to text file.

        try {
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + "AAI_Mobile" + "/" + sfile);
            FileOutputStream fOut = new FileOutputStream(file, true);
            fOut.write(ahuName.getBytes());
            fOut.write(ahuLocation.getBytes());
            fOut.write(areaServed.getBytes());
            fOut.write(equipManu.getBytes());
            fOut.write(ahuModel.getBytes());
            fOut.write(ahuSerial.getBytes());
            fOut.flush();
            fOut.close();
            Toast.makeText(getBaseContext(), "file saved", Toast.LENGTH_SHORT).show();
        }

        catch (Exception e) {

            Log.e("AAI_Mobile", "Exception", e);
        }
    }











    private void clearText() {

        EditText addAHU = (EditText) findViewById(R.id.txtAddAHU);
        addAHU.setText("");
    }


    public void addListenerOnButton() {





        //Constructor
        Button btnAHUSpec = (Button) findViewById(R.id.btnAHUSpec);

        //Attaches listener, saves data
        btnAHUSpec.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, editCfm.class);
                ahuData current = new ahuData();
                current.setAhuNameData(getAHUName());
                current.setAhuLocationData(getAHULocation());
                current.setAreaServedData(getAreaServed());
                current.setEquipManuData(getEquipManufacturer());
                current.setAhuModelData(getAHUModel());
                current.setAhuSerialData(getSerial());
                intent.putExtra("ahuData", current);
                grabAllData("Sample Report.txt");
                startActivity(intent);


            }


        });


    }
}

