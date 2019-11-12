package com.csfu.cpsc41101.personapplication.model;

public class Course {
    protected String mCourseID;
    protected String mGrade;


    public Course(String CourseID, String Grade) {
        mCourseID = CourseID;
        mGrade = Grade;

    }

    public String getCourseID() {
        return mCourseID;
    }

    public void setCourseID(String VIN) {
        mCourseID = VIN;
    }

    public String getGrade() {
        return mGrade;
    }


    public void setGrade(String make) {
        mGrade = make;
    }

}
