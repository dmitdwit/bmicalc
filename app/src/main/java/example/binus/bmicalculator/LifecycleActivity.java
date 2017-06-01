package example.binus.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifecycleActivity extends AppCompatActivity {

    static final String TAG = "Lifecycle Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.v(TAG,"Masuk onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG,"Masuk onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG,"Masuk onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG,"Masuk onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG,"Masuk onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG,"Masuk onDestroy");
    }
}
