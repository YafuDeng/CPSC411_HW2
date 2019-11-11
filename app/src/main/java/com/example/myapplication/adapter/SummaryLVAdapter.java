package com.example.myapplication.adapter;

import android.widget.BaseAdapter;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.studentDB;
import com.example.myapplication.student;
import com.example.myapplication.R;

public class SummaryLVAdapter extends BaseAdapter {
    @Override
    public int getCount(){
        return studentDB.getInstance().getStudents().size();
    }

    @Override
    public Object getItem(int i){
        return studentDB.getInstance().getStudents().get(i);
    }

    @Override
    public long getItemId(int i){
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent){
        View row_view;

        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            row_view = inflater.inflate(R.layout.student_row, parent, false);
        }
        else
            row_view = convertView;

        student s = studentDB.getInstance().getStudents().get(i);

        TextView firstNameView = (TextView) row_view.findViewById(R.id.first_name_id);
        TextView lastNameView = (TextView) row_view.findViewById(R.id.last_name_id);
        firstNameView.setText(s.getFirstName());
        lastNameView.setText(s.getLastName());
        row_view.setTag(new Integer(i));

        //row_view.setOnClickListener();

        return row_view;
    }
}
