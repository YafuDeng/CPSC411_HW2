package com.csfu.cpsc41101.personapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.csfu.cpsc41101.personapplication.model.Course;
import com.csfu.cpsc41101.personapplication.model.Person;
import com.csfu.cpsc41101.personapplication.model.PersonDB;

import java.util.ArrayList;
import java.util.List;

public class PersonDetailActivity extends AppCompatActivity {

    protected Menu detailMenu;
    protected int personIndex;
    protected final String TAG = "Detail Screen";
    public int numberOfLines=1;
    private ArrayList<Course> courseNameList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate() called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_detail);

        personIndex = getIntent().getIntExtra("PersonIndex", 0);
        //TextView tv = findViewById(R.id.display_id);

        //tv.setText("Will display the detail info for Person " + personIndex);

        // 1. Populate the First Name and Last Name
        Person pObj = PersonDB.getInstance().getPeople().get(personIndex);
        EditText fNameView = (EditText) findViewById(R.id.first_name_val_id);
        EditText lNameView = (EditText) findViewById(R.id.last_name_val_id);
        EditText course_id_added = (EditText) findViewById(R.id.course_id_added);
        EditText cwidView = (EditText) findViewById(R.id.cwid_val_id);
        RelativeLayout add_course_layout = (RelativeLayout) findViewById(R.id.add_course_layout);
        add_course_layout.setVisibility(View.INVISIBLE);
        fNameView.setText(pObj.getFirstName());
        lNameView.setText(pObj.getLastName());
        cwidView.setText(pObj.getmCWID());
        fNameView.setEnabled(false);
        lNameView.setEnabled(false);
        cwidView.setEnabled(false);
        // 2. Populate the Vehicle List

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail_screen_menu, menu);
        detailMenu = menu;
        menu.findItem(R.id.action_edit).setVisible(true);
        menu.findItem(R.id.action_done).setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_edit) {
            EditText fNameView = (EditText) findViewById(R.id.first_name_val_id);
            EditText lNameView = (EditText) findViewById(R.id.last_name_val_id);
            EditText cwidView = (EditText) findViewById(R.id.cwid_val_id);
            final EditText course_id_added = (EditText) findViewById(R.id.course_id_added);
            final EditText grade_id_added = (EditText) findViewById(R.id.grade_id_added);
            TextView buttonAddCourse = (TextView) findViewById(R.id.p_add_course);
            final RelativeLayout add_course_layout = (RelativeLayout) findViewById(R.id.add_course_layout);
            fNameView.setEnabled(true);
            lNameView.setEnabled(true);
            cwidView.setEnabled(true);
            buttonAddCourse.setEnabled(true);
            buttonAddCourse.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();

                    numberOfLines++;
                    LayoutInflater layoutInflater =
                            (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    final View addView = layoutInflater.inflate(R.layout.row, null);
                    TextView textOut = (TextView)addView.findViewById(R.id.textout);
                    textOut.setText(course_id_added.getText().toString());
                    Course c = new Course(course_id_added.getText().toString(),grade_id_added.getText().toString() );
                    courseNameList.add(c);
                    course_id_added.setText("");
                    grade_id_added.setText("");
                    /*RelativeLayout ll = (RelativeLayout) findViewById(R.id.add_course_layout);
                    // add edittext
                    EditText et = new EditText(getApplicationContext());
                    LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    et.setLayoutParams(p);
                    et.setText(" ");
                    et.setId(numberOfLines + 1);
                    ll.addView(et);
                    numberOfLines++;
*/
                    add_course_layout.setVisibility(View.VISIBLE);
                }
            });
            detailMenu.findItem(R.id.action_edit).setVisible(false);
            detailMenu.findItem(R.id.action_done).setVisible(true);
        } else if (item.getItemId() == R.id.action_done) {
            EditText fNameView = (EditText) findViewById(R.id.first_name_val_id);
            EditText lNameView = (EditText) findViewById(R.id.last_name_val_id);
            EditText cwidView = (EditText) findViewById(R.id.cwid_val_id);
            TextView buttonAddCourse = (TextView) findViewById(R.id.p_add_course);
            PersonDB.getInstance().getPeople().get(personIndex).setFirstName(fNameView.getText().toString());
            PersonDB.getInstance().getPeople().get(personIndex).setLastName(lNameView.getText().toString());
            PersonDB.getInstance().getPeople().get(personIndex).setCWID(cwidView.getText().toString());
            PersonDB.getInstance().getPeople().get(personIndex).setCourses(courseNameList);
            final RelativeLayout add_course_layout = (RelativeLayout) findViewById(R.id.add_course_layout);
            fNameView.setEnabled(false);
            lNameView.setEnabled(false);
            cwidView.setEnabled(false);
            add_course_layout.setVisibility(View.INVISIBLE);
            buttonAddCourse.setEnabled(false);
            detailMenu.findItem(R.id.action_edit).setVisible(true);
            detailMenu.findItem(R.id.action_done).setVisible(false);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart() called");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause() called");
        super.onPause();
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
