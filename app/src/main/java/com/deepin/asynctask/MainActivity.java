package com.deepin.asynctask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.textView);
    }

    private TextView mTextView;
    public void startTask(View view) {
        mTextView.setText("Waiting....");
        new SimpleAsyncTask(mTextView).execute();
    }
}
