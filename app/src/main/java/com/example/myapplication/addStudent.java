package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;
import com.example.myapplication.student;
import com.example.myapplication.studentDB;
import com.example.myapplication.course;

public class addStudent extends AppCompatActivity {
    ArrayList<EditText> courseViewList = new ArrayList<EditText>();

    protected final String TAG = "Detail Screen";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate() called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        courseViewList.add((EditText) findViewById(R.id.courseid_0_id));
        courseViewList.add((EditText) findViewById(R.id.grade_0_id));
        Button addCourseButton = findViewById(R.id.add_course_button_id);
        addCourseButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        LinearLayout courseid_ll = findViewById(R.id.courseid_ll_id);
                        LinearLayout grade_ll = findViewById(R.id.grade_ll_id);
                        LayoutInflater inflater = LayoutInflater.from(v.getContext());
                        EditText courseid = (EditText) inflater.inflate(R.layout.course_row,
                                courseid_ll, false);
                        EditText grade = (EditText) inflater.inflate(R.layout.course_row,
                                grade_ll, false);
                        courseViewList.add(courseid);
                        courseViewList.add(grade);
                        courseid_ll.addView(courseid);
                        grade_ll.addView(grade);
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionMenu(Menu menu){
        if(actionId == EditorInfo.IME_ACTION_DONE)

        return super.onCreateOptionsMenu(menu);
    }



}
