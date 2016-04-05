package aai.aai_mobile.model;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import aai.aai_mobile.R;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Aladdin on 1/17/2016.
 */
public class editCfm extends Fragment {


    //(FPS(Length * Width))/144 = CFM

    private EditText ahuSpecifiedReturnAirCFM, ahuActualReturnCFM, ahuSpecifiedOutsideAirCFM,
            ahuActualOutsideAirCFM, ahuSpecifiedStaticPressure, ahuActualStaticPressure,
            ahuActualInletPressure, ahuActualDischPressure, ahuSpecifiedFanRPM, ahuActualFanRPM;

    @Bind(R.id.ahuSpecifiedCFMFan)
    EditText ahuSpecifiedCFMFan;
    @Bind(R.id.ahuActualCFMFan)
    EditText ahuActualCFMFan;
    @Bind(R.id.ahuSpecifiedCFMOutput)
    EditText ahuSpecifiedCFMOutput;
    @Bind(R.id.ahuActualCFMOutput)
    EditText ahuActualCFMOutput;

    public editCfm() {
        //Empty constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_edit_cfm, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

   @Override
   public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       //addListenerOnButton();


       ahuSpecifiedOutsideAirCFM = (EditText) getView().findViewById(R.id.ahuSpecifiedOutsideAirCFM);
       ahuActualOutsideAirCFM = (EditText) getView().findViewById(R.id.ahuActualOutsideAirCFM);
       ahuSpecifiedStaticPressure = (EditText) getView().findViewById(R.id.ahuSpecifiedStaticPressure);
       ahuActualStaticPressure = (EditText) getView().findViewById(R.id.ahuActualStaticPressure);
       ahuActualInletPressure = (EditText) getView().findViewById(R.id.ahuActualInletPressure);
       ahuActualDischPressure = (EditText) getView().findViewById(R.id.ahuActualDischPressure);
       ahuSpecifiedFanRPM = (EditText) getView().findViewById(R.id.ahuSpecifiedFanRPM);
       ahuActualFanRPM = (EditText) getView().findViewById(R.id.ahuActualFanRPM);


   }


    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


    private String getSpecifiedCFMFan(){

        return ahuSpecifiedCFMFan.getText().toString();

    }

    private int getActualCFMFan() {


        return Integer.parseInt(ahuActualCFMFan.getText().toString());

    }

    private String getSpecifiedCFMOutput(){


        return ahuSpecifiedCFMOutput.getText().toString();

    }

    private int getActualCFMOutput() {


        return Integer.parseInt(ahuActualCFMOutput.getText().toString());

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



    /*private void grabAllData(String file){

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




    }*/



 /*   public void addListenerOnButton() {





        //Constructor
        Button btnAHUSpec = (Button) getView().findViewById(R.id.btnAHUNameplateSpec);

        //Attaches listener, saves data
        btnAHUSpec.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(context, editNamePlate.class);
                //Intent i = getIntent();
               *//* ahuData current = i.getParcelableExtra("ahuData");
                current.setTotalCFMFanSpecified(getSpecifiedCFMFan());
                current.setTotalCFMFanActual(getActualCFMFan());
                current.setTotalCFMOutletSpecified(getActualCFMOutput());
                current.setTotalCFMOutletActual(getActualCFMOutput());
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
                intent.putExtra("ahuData", current);*//*
                //grabAllData("Sample Report.txt");
                //startActivity(intent);
                AHU.getInstance().setCfmFan(getActualCFMFan());
                AHU.getInstance().setCfmOutlet(getActualCFMOutput());
                Fragment fragment = new editNamePlate();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container_body, fragment)
                        .commit();

            }


        });


    }*/
}
