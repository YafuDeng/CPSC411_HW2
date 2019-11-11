package com.example.myapplication;


import java.util.ArrayList;

public class student {

    protected String mFirstName;
    protected String mLastName;
    protected String mCWID;
    protected ArrayList<course> mCourses;

    public student(String firstName, String lastName, String CWID){
        mFirstName = firstName;
        mLastName = lastName;
        mCWID = CWID;
    }

    //set methods
    public void setFirstName(String firstName){
        mFirstName = firstName;
    }

    public void setLasName(String lastName){
        mLastName = lastName;
    }

    public void setCWID(String CWID){
        mCWID = CWID;
    }

    public void setCourses(ArrayList<course> courses){
        mCourses = courses;
    }

    //get methods
    public String getFirstName(){
        return mFirstName;
    }

    public String getLastName(){
        return mLastName;
    }

    public String getCWIS() {
        return mCWID;
    }

    public ArrayList<course> getCourses(){
        return mCourses;
    }


}
