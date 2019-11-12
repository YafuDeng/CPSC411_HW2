package com.csfu.cpsc41101.personapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.csfu.cpsc41101.personapplication.model.Course;
import com.csfu.cpsc41101.personapplication.model.Person;
import com.csfu.cpsc41101.personapplication.model.PersonDB;
import com.csfu.cpsc41101.personapplication.model.Vehicle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createPersonObjects();
        setContentView(R.layout.person_summary);

        root = findViewById(R.id.person_summary);

        ArrayList<Person> personList = PersonDB.getInstance().getPeople();
        for (int i=0; i<personList.size(); i++) {
            Person p = personList.get(i);
            LayoutInflater inflater = LayoutInflater.from(this);
            View row_view = inflater.inflate(R.layout.person_row, root, false);
            TextView firstNameView = (TextView) row_view.findViewById(R.id.first_name);
            firstNameView.setText(p.getFirstName());
            TextView lastNameView = (TextView) row_view.findViewById(R.id.last_name);
            lastNameView.setText(p.getLastName());
            //
            root.addView(row_view);
        }
        //
        // findViewById(R.id.first_name);
    }

    protected void createPersonObjects() {
        // Create James Person object
        Person p = new Person("Yafu", "Deng", "893517938");
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(new Course("CPSC 411", "A"));
        courses.add(new Course("CPSC 471", "B"));
        courses.add(new Course("CPSC 481", "A"));
        courses.add(new Course("CPSC 483", "C"));
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(p);
        // Create Another Person
        p = new Person("Joe", "Smith", "1827312");
        courses = new ArrayList<Course>();
        courses.add(new Course("CPSC 401", "A"));
        courses.add(new Course("CPSC 353", "B"));
        courses.add(new Course("CPSC 131", "A"));
        courses.add(new Course("CPSC 411", "C"));
        personList.add(p);
        //
        PersonDB.getInstance().setPeople(personList);
    }

}
