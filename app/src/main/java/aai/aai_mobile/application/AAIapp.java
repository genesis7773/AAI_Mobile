package aai.aai_mobile.application;

import android.app.Application;
import android.content.res.Configuration;

import mortar.MortarScope;

/**
 * Created by Aladdin on 4/10/2016.
 */
public class AAIapp extends Application {
    private static AAIapp singleton;

    public AAIapp getInstance(){
        return singleton;
    }


    private MortarScope rootScope;

    @Override public Object getSystemService(String name) {
        if (rootScope == null) rootScope = MortarScope.buildRootScope().build(getPackageName());

        return rootScope.hasService(name) ? rootScope.getService(name) : super.getSystemService(name);
    }



    @Override
    public void onCreate(){
        super.onCreate();
        singleton = this;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

    }
}
