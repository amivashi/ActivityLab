package com.example.avashi_dev.activitylab.activities;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.app.Activity;
        import android.content.Intent;
        import android.util.Log;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.TextView;
        import java.lang.*;
public class ActivityTwo extends AppCompatActivity {


    private static final String RESTART_KEY = "restart";
    private static final String RESUME_KEY = "resume";
    private static final String START_KEY = "start";
    private static final String CREATE_KEY = "create";


    private final static String TAG = "Lab-ActivityTwo";


    private int mCreate,mRestart, mStart, mResume;


    private TextView mTvCreate,mTvRestart, mTvStart, mTvResume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        // TODO: Assign the appropriate TextViews to the TextView variables
        // Hint: Access the TextView by calling Activity's findViewById()
        TextView textView1 = (TextView) findViewById(R.id.create);



        Button closeButton = (Button) findViewById(R.id.bClose);
        closeButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                finish();



            }
        });

        // Has previous state been saved?
        if (savedInstanceState != null) {

            // TODO:
            // Restore value of counters from saved state
            // Only need 4 lines of code, one for every count variable


            mCreate = savedInstanceState.getInt(CREATE_KEY, mCreate);
            mRestart = savedInstanceState.getInt( RESTART_KEY, mRestart);
            mStart = savedInstanceState.getInt(START_KEY, mStart);
            mResume = savedInstanceState.getInt(RESUME_KEY, mResume);

        }

        // Emit LogCat message
        Log.i(TAG, "Entered the onCreate() method");


        mCreate++;
        displayCounts();
        // TODO:
        // Update the appropriate count variable
        // Update the user interface via the displayCounts() method




    }

    @Override
    public void onStart() {
        super.onStart();

        // Emit LogCat message
        Log.i(TAG, "Entered the onStart() method");

        mStart++;
        displayCounts();
        // TODO:
        // Update the appropriate count variable
        // Update the user interface

    }

    @Override
    public void onResume() {
        super.onResume();

        // Emit LogCat message
        Log.i(TAG, "Entered the onResume() method");

        mResume++;
        displayCounts();
        // TODO:
        // Update the appropriate count variable
        // Update the user interface

    }

    @Override
    public void onPause() {
        super.onPause();

        // Emit LogCat message
        Log.i(TAG, "Entered the onPause() method");


    }

    @Override
    public void onStop() {
        super.onStop();

        // Emit LogCat message
        Log.i(TAG, "Entered the onStop() method");
    }

    @Override
    public void onRestart() {
        super.onRestart();

        // Emit LogCat message
        Log.i(TAG, "Entered the onRestart() method");

        mRestart++;
        displayCounts();
        // TODO:
        // Update the appropriate count variable
        // Update the user interface

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // Emit LogCat message
        Log.i(TAG, "Entered the onDestroy() method");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // TODO:
        // Save state information with a collection of key-value pairs
        // 4 lines of code, one for every count variable

        savedInstanceState.putInt(CREATE_KEY, mCreate);
        savedInstanceState.putInt(RESTART_KEY,mRestart);
        savedInstanceState.putInt(RESUME_KEY,mResume);
        savedInstanceState.putInt(START_KEY,mStart);


    }

    public void displayCounts() {

        // TODO - uncomment these lines

        mTvCreate.setText("onCreate() calls: " + mCreate);
        mTvStart.setText("onStart() calls: " + mStart);
        mTvResume.setText("onResume() calls: " + mResume);
        mTvRestart.setText("onRestart() calls: " + mRestart);

    }
}
