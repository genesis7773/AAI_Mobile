package aai.aai_mobile.util.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import java.util.ArrayList;

import aai.aai_mobile.JSON.projectRecord;

/**
 * Created by Aladdin on 4/12/2016.
 */
public class dbHandler extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "ProjectDatabase.db";
    private static final String TABLE_NAME = "project_table";
    private static final String KEY_ID = "_id";
    private static final String KEY_AHU = "_AHU";
    private static final String KEY_CHILLER = "_Chiller";
    private static final String KEY_COOLING_TOWER = "_CoolingT";
    private static final String KEY_GRILL = "_GRILL";

    String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+" ("+KEY_ID+" STRING PRIMARY KEY,"+KEY_AHU+" TABLE,"+KEY_CHILLER+" TABLE,"+KEY_COOLING_TOWER+" TABLE "+KEY_GRILL+ " TABLE )";
    String DROP_TABLE = "DROP TABLE IF EXISTS "+TABLE_NAME;


    public dbHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }






    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);
    }
}
