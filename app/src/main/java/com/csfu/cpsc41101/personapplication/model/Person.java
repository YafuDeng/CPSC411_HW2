package com.csfu.cpsc41101.personapplication.model;

import java.util.ArrayList;

public class Person {
    protected String mFirstName;
    protected String mLastName;
    protected String mCWID;
    protected ArrayList<Vehicle> mVehicles;
    protected ArrayList<Course> mCourses;
    public Person(String fName, String lName, String CWID) {
        mFirstName = fName;
        mLastName = lName;
        mCWID = CWID;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public String getmCWID() { return mCWID; }

    public void setCWID(String CWID) { mCWID = CWID; }

    public ArrayList<Vehicle> getVehicles() {
        return mVehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        mVehicles = vehicles;
    }

    public ArrayList<Course> getCourses() { return mCourses; }

    public void setCourses(ArrayList<Course> courses) { mCourses = courses; }
}
