package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentVieHolder extends RecyclerView.ViewHolder {
    private TextView mtvName;
    private TextView mtvAge;
    private TextView mtvRollNo;

    public StudentVieHolder(@NonNull  View itemView) {
        super(itemView);
        iniView(itemView);
    }
    private void iniView(View itemView){
        mtvName=itemView.findViewById(R.id.name);
        mtvAge=itemView.findViewById(R.id.age);
        mtvRollNo=itemView.findViewById(R.id.tvRollNo);

    }
    public void setData(Student student){
        mtvName.setText(student.getName());
        mtvAge.setText(student.getAge()+"");
        mtvRollNo.setText(student.getRollna());

    }
}
