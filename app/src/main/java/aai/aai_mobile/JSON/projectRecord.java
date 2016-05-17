package aai.aai_mobile.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aladdin on 2/22/2016.
 */

//Data set JSON

public class projectRecord {
    public String project_id;
    ArrayList<AHU> AHU = new ArrayList<AHU>();
    ArrayList<Grill> Grill = new ArrayList<Grill>();
    ArrayList<Chiller> Chiller = new ArrayList<Chiller>();
    ArrayList<CoolingTower> CoolingTower = new ArrayList<CoolingTower>();

    public projectRecord() {

    }

    public projectRecord(String project_ID, ArrayList<AHU> AHU, ArrayList<Grill> Grill, ArrayList<Chiller> chill, ArrayList<CoolingTower> coolingT){
        this.project_id = project_ID;
        this.AHU = AHU;
        this.Chiller = chill;
        this.Grill = Grill;
        this.CoolingTower = coolingT;
    }


    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public ArrayList<aai.aai_mobile.JSON.AHU> getAHU() {
        return AHU;
    }

    public void setAHU(ArrayList<aai.aai_mobile.JSON.AHU> AHU) {
        this.AHU = AHU;
    }

    public ArrayList<aai.aai_mobile.JSON.Grill> getGrill() {
        return Grill;
    }

    public void setGrill(ArrayList<aai.aai_mobile.JSON.Grill> grill) {
        Grill = grill;
    }

    public ArrayList<aai.aai_mobile.JSON.Chiller> getChiller() {
        return Chiller;
    }

    public void setChiller(ArrayList<aai.aai_mobile.JSON.Chiller> chiller) {
        Chiller = chiller;
    }

    public ArrayList<aai.aai_mobile.JSON.CoolingTower> getCoolingTower() {
        return CoolingTower;
    }

    public void setCoolingTower(ArrayList<aai.aai_mobile.JSON.CoolingTower> coolingTower) {
        CoolingTower = coolingTower;
    }




}
