package aai.aai_mobile.ui.PreEngineering;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import aai.aai_mobile.R;
import aai.aai_mobile.ui.LoadEdit;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Aladdin on 1/29/2016.
 *
 * Using Flow, Mortar, Dagger2, etc:
 * Instead of using Activities, we build a CustomView (View), implement the presenter (Presenter), and have the model extend the customview (Model)
 * MVP design! I get it now!
 *TODO: create custom view, implement presenter
 *Flow will handle navigation, butterknife handles the views, mortar handles the lifecycle, dagger for Dependency injection
 * RxJava will replace any Async we need (network calls), Eventbus handles frontend and backend interactions
 */
public class preEngineering extends AppCompatActivity{

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




    private void readCSVFile(String fileName) {


    }

    //Sample of Butterknife listenerBinding
    @OnClick(R.id.btnImportEngineering)
    public void doThis() {

    }


}
