package net.chi6rag.android.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("chi6rag", "onCreate was called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("chi6rag", "onStart was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("chi6rag", "onResume was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("chi6rag", "onPause was called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("chi6rag", "onStop was called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("chi6rag", "onRestart was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("chi6rag", "onDestroy was called");
    }


}