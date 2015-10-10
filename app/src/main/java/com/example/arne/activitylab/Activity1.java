package com.example.arne.activitylab;

import android.app.ActionBar;
import android.content.ContentValues;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    // parameters voor het bijhouden van de tellers
    private int tellerCreate;
    private int tellerRestart;
    private int tellerStart;
    private int tellerResume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set the user interface layout for this activity
        // the layout file is defined in the project res/layout/main/activity.xml file
        setContentView(R.layout.activity_1);


        //do something

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity1, menu);
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

    @Override
    public void onDestroy() {
        super.onDestroy(); //always call the superclass


        //do something

    }

    @Override
    public void onPause() {
        super.onPause(); //always call the superclass


        //do something

    }

    @Override
    public void onResume() {
        super.onResume(); //always call the superclass


        //do something

    }

    @Override
    public void onStop() {
        super.onStop(); //always call the superclass


        //do something

    }

    @Override
    public void onStart() {
        super.onStart();  //always call the superclass


        //do something

    }

    @Override
    public void onRestart() {
        super.onRestart(); //always call the superclass


        //do something
        //print in console
        Log.i(TAG, "Restarted the activity");
        //update teller en update user interface
        tellerRestart++;
        //displayCounts();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        //do something to backup data
        savedInstanceState.putInt("mCreate", tellerCreate);
        savedInstanceState.putInt("mRestart", tellerRestart);
        savedInstanceState.putInt("mResume", tellerResume);
        savedInstanceState.putInt("mStart", tellerStart);

        super.onSaveInstanceState(savedInstanceState);
    }
}


























