package com.example.taruc.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Prac3_1 extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;



    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_prac3_1);
            mShowCount = (TextView) findViewById(R.id.show_count);
        }
    }

