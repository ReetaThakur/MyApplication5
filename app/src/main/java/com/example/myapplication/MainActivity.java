package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Student> studentList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intView();
        buildStudentList();
        setRecyclerView();

    }
    private void buildStudentList(){
        Student student=new Student("Anush",22,"EMP123");
        studentList.add(student);
        Student student1=new Student("Reeta",26,"EMP124");
        studentList.add(student1);
        for(int i=0;i<13;i++){
            Student student2=new Student("Reeta"+i,26,"EMP124");
            studentList.add(student);
        }

    }
    private void setRecyclerView(){
        StudentAdapter studentAdapter=new StudentAdapter(studentList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);


    }
    private void intView(){
        recyclerView=findViewById(R.id.recylcerView);
    }
}