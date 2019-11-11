package com.example.myapplication;

import java.util.ArrayList;

public class studentDB {
    private static final studentDB instance = new studentDB();

    protected ArrayList<student> mStudents;

    static public studentDB getInstance(){
        return instance;
    }

    private studentDB(){}

    public ArrayList<student> getStudents(){
        return mStudents;
    }

    public void setStudents(ArrayList<student> students){
        mStudents = students;
    }

    public void addStudent(student student){
        mStudents.add(student);
    }
}
