package com.androidmatters.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Lifecycle";
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = (TextView) findViewById(R.id.txt2);
        textView2.setText(R.string.Msg2);

        Log.i(TAG, "onCreate: onCreate() invoked.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: onStart() invoked.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: onRestart() invoked.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: onResume() invoked.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: onPause() invoked.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: onStop() invoked.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: onDestroy() invoked.");
    }
}