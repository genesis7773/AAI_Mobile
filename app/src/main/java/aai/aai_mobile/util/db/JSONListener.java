package aai.aai_mobile.util.db;

import java.util.ArrayList;

import aai.aai_mobile.JSON.projectRecord;

/**
 * Created by Aladdin on 4/12/2016.
 */
public interface JSONListener {
    public void addProject(projectRecord projectRecord);

    public ArrayList<projectRecord> getAllProjects();

    public  int getProjectCount();



}
