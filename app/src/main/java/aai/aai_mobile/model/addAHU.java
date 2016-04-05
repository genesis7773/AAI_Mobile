package aai.aai_mobile.model;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

import aai.aai_mobile.R;
import butterknife.Bind;
import butterknife.ButterKnife;

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


public class addAHU extends Fragment {


    //private Button next;
    private Context context;
    private static final String ARG_POSITION = "position";
    int mCurrentPosition = -1;
    @Bind(R.id.txtAddAHU)
    EditText ahuName;
    @Bind(R.id.txtLocation)
    EditText ahuLocation;
    @Bind(R.id.txtServes)
    EditText areaServed;
    @Bind(R.id.txtManu)
    EditText equipManu;
    @Bind(R.id.txtModel)
    EditText ahuModel;
    @Bind(R.id.txtSerial)
    EditText ahuSerial;
    @Bind(R.id.btnAHUSpec)
    Button btnAHUSpec;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt("position");
        }
        View view = inflater.inflate(R.layout.activity_add_ahu, container, false);
        ButterKnife.bind(this, view);
        addListenerOnButton();
        return view;
    }


    @Override
    public void onStart() {
        super.onStart();
        Bundle args = getArguments();
        /*if (args != null){
            //doooesss noootthhhinnng yet!
        } else if (mCurrentPosition != -1){

        }*/
    }


    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(ARG_POSITION, mCurrentPosition);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

   /* @Override
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
*/


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String userContent, int size, int colorValue);
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
        String ahuLocation = "AHU LOCATION: " + getAHULocation() + "/n";
        String areaServed = "AREA SERVED: " + getAreaServed() + "/n";
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
            Toast.makeText(context, "file saved", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {

            Log.e("AAI_Mobile", "Exception", e);
        }


    }











  /*  private void clearText() {

        EditText addAHU = (EditText) getView().findViewById(R.id.txtAddAHU);
        addAHU.setText("");
    }
*/

    public void addListenerOnButton() {


        //Attaches listener, saves data
        btnAHUSpec.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, editCfm.class);
//                ahuData current = new ahuData();
//                current.setAhuNameData(getAHUName());
//                current.setAhuLocationData(getAHULocation());
//                current.setAreaServedData(getAreaServed());
//                current.setEquipManuData(getEquipManufacturer());
//                current.setAhuModelData(getAHUModel());
//                current.setAhuSerialData(getSerial());
                //    current.setDataForAHU(grabAllData("sample Report.txt"));
                grabAllData("Sample_Report.txt");
//                intent.putExtra("ahuData", current);
                startActivity(intent);


            }


        });


    }
}

