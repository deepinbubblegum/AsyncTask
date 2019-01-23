package com.deepin.asynctask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private ProgressBar mProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.textView);
        mProgressBar = findViewById(R.id.progressBar);
    }


    public void startTask(View view) {
        mTextView.setText("Waiting....");
        new SimpleAsyncTask(mTextView,mProgressBar).execute();
    }
}
