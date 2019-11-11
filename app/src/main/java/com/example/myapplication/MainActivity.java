package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.example.myapplication.R;

import com.example.myapplication.adapter.SummaryLVAdapter;
import com.example.myapplication.studentDB;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    protected LinearLayout root;
    protected ListView mSummaryView;
    protected SummaryLVAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_summary_listview);



        
    }

    protected void createStudentDB(){
        ArrayList<student> students = new ArrayList<student>();

        student s = new student("Yafu", "Deng", "893517938");
        ArrayList<course> courses = new ArrayList<course>();
        courses.add(new course("471", "A"));
        courses.add(new course("481", "A"));
        courses.add(new course("411", "A"));
        courses.add(new course("349", "A"));
        s.setCourses(courses);
        students.add(s);

        s = new student("Tony", "Juan", "121212121");
        courses = new ArrayList<course>();
        courses.add(new course("471", "A"));
        courses.add(new course("481", "A"));
        courses.add(new course("411", "A"));
        courses.add(new course("349", "A"));
        s.setCourses(courses);
        students.add(s);

        s = new student("Louis", "Smith", "212121212");
        courses = new ArrayList<course>();
        courses.add(new course("471", "A"));
        courses.add(new course("481", "A"));
        courses.add(new course("411", "A"));
        courses.add(new course("349", "A"));
        s.setCourses(courses);
        students.add(s);

        studentDB.getInstance().setStudents(students);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.detail_screen_menu, menu);
        menu.findItem(R.id.)
    }
}
