package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.myapplication.R;
import com.example.myapplication.student;
import com.example.myapplication.studentDB;
import com.example.myapplication.course;
import com.example.myapplication.adapter.SummaryLVAdapter;

import java.util.ArrayList;


public class Summary_listview extends AppCompatActivity {

    protected ListView mSummaryView;
    protected final String TAG = "Summary Screen";
    protected SummaryLVAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate() called");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_listview);

        mSummaryView = findViewById(R.id.summary_listview_id);
        ad = new SummaryLVAdapter();
        mSummaryView.setAdapter(ad);
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause() called");
        super.onPause();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart() called");
        ad.notifyDataSetChanged();
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop() called");
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume() called");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy() called");
        super.onDestroy();
    }

}
