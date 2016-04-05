package aai.aai_mobile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import aai.aai_mobile.R;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Aladdin on 1/29/2016.
 */
public class preEngineering extends Activity {

    @Bind(R.id.numberOfAHU)
    EditText numberOfAHU;
    @Bind(R.id.numberOfGrills)
    EditText numberOfGrills;
    @Bind(R.id.numberOfChillers)
    EditText numberOfChillers;
    @Bind(R.id.numberOfCoolingTowers)
    EditText numberOfCoolingTowers;
    private int nAHU, nGrills, nChillers, nCT; //pumps, cooling towers, condensers, PIU
    private Context context;
    @Bind(R.id.btnImportEngineering)
    Button btnImportEngineering;
    @Bind(R.id.btnToSetupPage)
    Button btnToSetupPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preengineering);
        context = preEngineering.this;
        ButterKnife.bind(this);
        addListenerToButton();
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    private void grabAllData() {
        nAHU = Integer.parseInt(numberOfAHU.getText().toString());
        nGrills = Integer.parseInt(numberOfGrills.getText().toString());
        nChillers = Integer.parseInt(numberOfChillers.getText().toString());
        nCT = Integer.parseInt(numberOfCoolingTowers.getText().toString());
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    private void addListenerToButton() {


        btnToSetupPage.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, LoadEdit.class);
                Bundle b = new Bundle();
                grabAllData();
                b.putInt("AHUs", nAHU);
                b.putInt("Grills", nGrills);
                b.putInt("chillers", nChillers);
                b.putInt("Cooling Tower", nCT);
                intent.putExtra("preData", b);
                startActivity(intent);

            }
        }));
    }


    private void readCSVFile(String fileName) {


    }

    //Sample of Butterknife listenerBinding
    @OnClick(R.id.btnImportEngineering)
    public void doThis() {

    }


}
