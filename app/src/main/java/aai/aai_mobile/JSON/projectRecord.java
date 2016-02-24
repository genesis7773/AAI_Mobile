package aai.aai_mobile.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aladdin on 2/22/2016.
 */

//Data set JSON

public class projectRecord {
    public String project_id;
    List<AHU> AHU = new ArrayList<AHU>();
    List<Grill> Grill = new ArrayList<Grill>();
    List<Chiller> Chiller = new ArrayList<Chiller>();
    List<CoolingTower> CoolingTower = new ArrayList<CoolingTower>();
}
