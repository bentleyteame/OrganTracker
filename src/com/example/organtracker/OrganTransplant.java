package com.example.organtracker;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class OrganTransplant extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organ_transplant);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present. test
        getMenuInflater().inflate(R.menu.organ_transplant, menu);
        return true;
    }
    
}
