package aai.aai_mobile;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Aladdin on 1/17/2016.
 */
public class ReportOpenHelper extends SQLiteOpenHelper {


    /*SQLite database construct

   These lines of code set up the database we may use eventually.


    */
    private static final int DATABASE_VERSION = 1;
    private static final String REPORT_TABLE_NAME = "Sample Report";
    private static final String REPORT_TABLE_CREATE =
            "CREATE TABLE" + REPORT_TABLE_NAME;

    public ReportOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {


        db.execSQL(REPORT_TABLE_CREATE);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }
}

