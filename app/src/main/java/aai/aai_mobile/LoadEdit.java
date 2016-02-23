package aai.aai_mobile;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.Bind;
import butterknife.ButterKnife;


//TODO: Create for loops to dynamically add buttons to create multiple objects
//TODO: We have to make the entire layout create itself when OnCreate() is called, otherwise Butterknife can't bind shit and the program crashes.


public class LoadEdit extends FragmentActivity {

    private Context context = LoadEdit.this;
    @Bind(R.id.load_edit_Recycler)
    RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadd_edit);
        ButterKnife.bind(this);

        Bundle b = getIntent().getExtras();
        int nAHU, nGrills, nChillers, nCT, nNamePlates, nComments, nNotes;
        nAHU = b.getInt("AHUs");
        nGrills = b.getInt("Grills");
        nNamePlates = b.getInt("AHUs");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_loadd_edit, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

