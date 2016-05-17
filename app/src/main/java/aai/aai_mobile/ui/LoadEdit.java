package aai.aai_mobile.ui;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import aai.aai_mobile.R;
import butterknife.Bind;
import butterknife.ButterKnife;


//TODO: Create loops that load number of objects to create views;
//TODO: We have to make the entire layout create itself when OnCreate() is called, otherwise Butterknife can't bind shit and the program crashes.


public class LoadEdit extends Fragment {

    @Bind(R.id.load_edit_Recycler)
    RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLayoutManager = new GridLayoutManager(getActivity().getApplicationContext(), 2);

    }



}

