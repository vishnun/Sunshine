package com.example.vishnunarang.sunshine.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;


public class MainActivity extends ActionBarActivity {

    private static final String LOG_TAG = DetailFragment.class.getSimpleName();


    @Override
    public void onStart(){
        Log.v(LOG_TAG, "ON START");
        super.onStart();
    }

    @Override
    public void onResume(){
        Log.v(LOG_TAG, "ON RESUME");
        super.onResume();
    }

    @Override
    public void onDestroy(){
        Log.v(LOG_TAG, "ON DESTROY");
        super.onDestroy();
    }


    @Override
    public void onStop(){
        Log.v(LOG_TAG, "ON STOP");
        super.onStop();
    }


    @Override
    public void onPause(){
        Log.v(LOG_TAG, "ON PAUSE");
        super.onPause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(LOG_TAG, "ON CREATE");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ForecastFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        Log.v(LOG_TAG, String.valueOf(id));
//
//        if (id == R.id.action_settings) {
//            Intent settingsIntent = new Intent(this, SettingsActivity.class);
//            startActivity(settingsIntent);
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
