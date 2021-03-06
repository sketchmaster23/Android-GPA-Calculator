package com.processfast.csce492;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Starting activity file for Group Project
 * Members: Brad Stancel, Byron Alleman,
 * Shane Hoover, Vitaliy Zheltov and Stephen Strohier
 * 
 * CSCE 492
 * Beginning date: 1/24/2012
 * 
 */

//This is Brad commenting code from Shane's setup
//Brad Rocks!



public class AndroidGPACalculatorActivity extends Activity {
	private CoursesDataSource coursesSource;
	private AssignmentTypesSource typeSource;
	private GradesDataSource gradeSource;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        /* Starts the home screen activity */
        Intent toHome = new Intent(this, HomeActivity.class);
        this.startActivity(toHome);
        
      /*  
       coursesSource = new CoursesDataSource(this);
        coursesSource.open();
        List<Course> courses = coursesSource.getAllCourses();
        
        int size = courses.size();
        
        for(int i = 0 ; i < size ; i ++ ){
        	System.out.println(courses.get(i).toString());
        	Log.i("General", courses.get(i).toString());
        }
        
        typeSource = new AssignmentTypesSource(this);
        typeSource.open();
        
        AssignmentType t = typeSource.createAssignmentType(5, 100, "Exams");
        gradeSource = new GradesDataSource(this);
        gradeSource.open();
        
        Grade g = gradeSource.createGrade(7, 5, 100, "Final Exam", 95);
        
        int i = 7;
        
        /*
        Course c = coursesSource.createCourse("MATH", "241", "Boltar", 3, 1, 94, 90, 87, 84, 80, 77, 74, 70, 67, 64, 60);
        
        Log.i("Course", c.toString());
        
        coursesSource.deleteCourse(c);*/
    }
}