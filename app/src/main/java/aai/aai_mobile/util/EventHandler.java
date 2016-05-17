package aai.aai_mobile.util;


import android.os.Bundle;
import android.support.annotation.WorkerThread;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import com.squareup.moshi.ToJson;
import com.squareup.moshi.FromJson;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;

import aai.aai_mobile.JSON.AHU;
import aai.aai_mobile.JSON.Chiller;
import aai.aai_mobile.JSON.CoolingTower;
import aai.aai_mobile.JSON.Grill;
import aai.aai_mobile.JSON.projectRecord;
import aai.aai_mobile.ui.Homepage.aaiHomeActivity;


/**
 * Created by Aladdin on 4/1/2016.
 */
public class EventHandler{


    EventBus eventBus = EventBus.getDefault();
    public projectRecord pr;


    @Subscribe
    public void passProjectrecord(projectRecord projectRecord){
        pr = projectRecord;
    }



    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void addAHUtoArrayList(AHU ahu){
        ArrayList<AHU> temp = pr.getAHU();
        temp.add(ahu);
        pr.setAHU(temp);

    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void addGrilltoArrayList(Grill grill){
        ArrayList<Grill> temp = pr.getGrill();
        temp.add(grill);
        pr.setGrill(temp);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void addChillertoArrayList(Chiller chiller){
        ArrayList<Chiller> temp = pr.getChiller();
        temp.add(chiller);
        pr.setChiller(temp);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void addCTtoArrayList(CoolingTower ct){
        ArrayList<CoolingTower> temp  = pr.getCoolingTower();
        temp.add(ct);
        pr.setCoolingTower(temp);
    }



}
