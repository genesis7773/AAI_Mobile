package aai.aai_mobile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;

/**
 * Created by Aladdin on 1/17/2016.
 */
public class editCfm extends AppCompatActivity {


    private EditText ahuSpecifiedCFMFan, ahuActualCFMFan, ahuSpecifiedCFMOutput, ahuActualCFMOutput, ahuSpecifiedReturnAirCFM, ahuActualReturnCFM, ahuSpecifiedOutsideAirCFM, ahuActualOutsideAirCFM, ahuSpecifiedStaticPressure;
    private EditText ahuActualStaticPressure, ahuActualInletPressure, ahuActualDischPressure, ahuSpecifiedFanRPM, ahuActualFanRPM;
    private Context context;



   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_cfm);
        addListenerOnButton();
        context = this.getApplicationContext();

       ahuSpecifiedCFMFan = (EditText) findViewById(R.id.ahuSpecifiedCFMFan);
       ahuActualCFMFan = (EditText) findViewById(R.id.ahuActualCFMFan);
       ahuSpecifiedCFMOutput = (EditText) findViewById(R.id.ahuSpecifiedCFMOutput);
       ahuActualCFMOutput = (EditText) findViewById(R.id.ahuActualCFMOutput);
       ahuSpecifiedReturnAirCFM = (EditText) findViewById(R.id.ahuSpecifiedReturnAirCFM);
       ahuActualReturnCFM = (EditText) findViewById(R.id.ahuActualReturnCFM);
       ahuSpecifiedOutsideAirCFM = (EditText) findViewById(R.id.ahuSpecifiedOutsideAirCFM);
       ahuActualOutsideAirCFM = (EditText) findViewById(R.id.ahuActualOutsideAirCFM);
       ahuSpecifiedStaticPressure = (EditText) findViewById(R.id.ahuSpecifiedStaticPressure);
       ahuActualStaticPressure = (EditText) findViewById(R.id.ahuActualStaticPressure);
       ahuActualInletPressure = (EditText) findViewById(R.id.ahuActualInletPressure);
       ahuActualDischPressure = (EditText) findViewById(R.id.ahuActualDischPressure);
       ahuSpecifiedFanRPM = (EditText) findViewById(R.id.ahuSpecifiedFanRPM);
       ahuActualFanRPM = (EditText) findViewById(R.id.ahuActualFanRPM);





    }


    private String getSpecifiedCFMFan(){

        return ahuSpecifiedCFMFan.getText().toString();

    }

    private String getActualCFMFan(){


        return ahuActualCFMFan.getText().toString();

    }

    private String getSpecifiedCFMOutput(){


        return ahuSpecifiedCFMOutput.getText().toString();

    }

    private String getActualCFMOutput(){


        return ahuActualCFMOutput.getText().toString();

    }

    private String getSpecifiedReturnAirCFM(){


        return ahuSpecifiedReturnAirCFM.getText().toString();


    }

    private String getActualReturnAirCFM(){


        return ahuActualReturnCFM.getText().toString();

    }

    private String getSpecifiedOutsideAirCFM(){


        return ahuSpecifiedOutsideAirCFM.getText().toString();


    }


    private String getActualOutsideAirCFM(){

        return ahuActualOutsideAirCFM.getText().toString();


    }

    private String getSpecifiedStaticPressure(){


        return ahuSpecifiedStaticPressure.getText().toString();

    }

    private String getActualStaticPressure(){


        return ahuActualStaticPressure.getText().toString();


    }

    private String getActualInletPressure(){


        return ahuActualInletPressure.getText().toString();

    }

    private String getActualDischPressure(){


        return ahuActualDischPressure.getText().toString();

    }

    private String getSpecifiedFanRPM(){

        return ahuSpecifiedFanRPM.getText().toString();
    }

    private String getActualFanRPM(){


        return ahuActualFanRPM.getText().toString();

    }



    private void grabAllData(String file){

        String ahuSpecifiedCFM = "Specified CFM: " + getSpecifiedCFMFan() + "/n";
        String ahuSpecifiedOutput = "Specified Output CFM: " + getSpecifiedCFMOutput() + "/n";
        String ahuSpecifiedReturn = "Specified Return Air CFM: " + getSpecifiedReturnAirCFM() + "/n";
        String ahuSpecifiedOutside = "Specified Outside Air CFM: " + getSpecifiedOutsideAirCFM() + "/n";
        String ahuSpecifiedStatic = "Specified Static Pressure: " + getSpecifiedStaticPressure() + "/n";
        String ahuSpecifiedRPM = "Specified Fan RPM: " + getSpecifiedFanRPM() + "/n";
        String ahuActualCFM = "Actual CFM: " + getActualCFMFan() + "/n";
        String ahuActualOutput = "Actual Output CFM: " + getActualCFMOutput() + "/n";
        String ahuActualReturn = "Actual Return Air CFM: " + getActualReturnAirCFM() + "/n";
        String ahuActualOutside = "Actual Outside Air CFM: " + getActualOutsideAirCFM() + "/n";
        String ahuActualStatic = "Actual Static Pressure: " + getActualStaticPressure() + "/n";
        String ahuActualInlet = "Actual Inlet Pressure: " + getActualInletPressure() + "/n";
        String ahuActualDisch = "Actual Discharge Pressure: " + getActualDischPressure() + "/n";
        String ahuActualRPM = "Actual Fan RPM: " + getActualFanRPM() + "/n";

        try {
            FileOutputStream fOut = openFileOutput(file,Context.MODE_APPEND);
            fOut.write(ahuSpecifiedCFM.getBytes());
            fOut.write(ahuActualCFM.getBytes());
            fOut.write(ahuSpecifiedOutput.getBytes());
            fOut.write(ahuActualOutput.getBytes());
            fOut.write(ahuSpecifiedReturn.getBytes());
            fOut.write(ahuActualReturn.getBytes());
            fOut.write(ahuSpecifiedOutside.getBytes());
            fOut.write(ahuActualOutside.getBytes());
            fOut.write(ahuSpecifiedStatic.getBytes());
            fOut.write(ahuActualStatic.getBytes());
            fOut.write(ahuActualInlet.getBytes());
            fOut.write(ahuActualDisch.getBytes());
            fOut.write(ahuSpecifiedRPM.getBytes());
            fOut.write(ahuActualRPM.getBytes());
            fOut.close();
            Toast.makeText(getBaseContext(), "file saved", Toast.LENGTH_SHORT).show();
        }

        catch (Exception e) {
            Log.e("AAI_Mobile", "Exception", e);
            e.printStackTrace();
        }




    }



    public void addListenerOnButton() {





        //Constructor
        Button btnAHUSpec = (Button) findViewById(R.id.btnAHUNameplateSpec);

        //Attaches listener, saves data
        btnAHUSpec.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, editNamePlate.class);
                Intent i = getIntent();
                ahuData current = i.getParcelableExtra("ahuData");
                current.setTotalCFMFanSpecified(getSpecifiedCFMFan());
                current.setTotalCFMFanActual(getActualCFMFan());
                current.setReturnAirSpecified(getSpecifiedReturnAirCFM());
                current.setReturnAirActual(getActualReturnAirCFM());
                current.setOutsideAirSpecified(getSpecifiedOutsideAirCFM());
                current.setOutsideAirActual(getActualOutsideAirCFM());
                current.setStaticPressureSpecified(getSpecifiedStaticPressure());
                current.setStaticPressureActual(getActualStaticPressure());
                current.setInletActual(getActualInletPressure());
                current.setDischActual(getActualDischPressure());
                current.setFanRPMSpecified(getSpecifiedFanRPM());
                current.setFanRPMActual(getActualFanRPM());
                intent.putExtra("ahuData", current);
                grabAllData("Sample Report.txt");
                startActivity(intent);

            }


        });


    }
}
