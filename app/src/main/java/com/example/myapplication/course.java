package com.example.myapplication;

public class course {
    protected String mCourseID;
    protected String mGrade;

    public course(String courseID, String grade){
        mCourseID = courseID;
        mGrade = grade;
    }

    //set methods
    public void setCourseID(String courseID) {
        mCourseID = courseID;
    }
    public void setGrade(String grade){
        mGrade = grade;
    }

    //get methods
    public String getCourseID(){
        return mCourseID;
    }

    public String getGrade(){
        return mGrade;
    }
}
