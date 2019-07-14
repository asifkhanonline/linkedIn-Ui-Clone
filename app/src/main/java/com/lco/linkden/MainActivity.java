package com.lco.linkden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView courselist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courselist=findViewById(R.id.recyler);
        courselist.setLayoutManager(new GridLayoutManager(this,2));
         int [] images={R.drawable.salman,R.drawable.disha,R.drawable.kabir,R.drawable.profile,R.drawable.salman,R.drawable.disha,R.drawable.kabir,R.drawable.profile,R.drawable.salman,R.drawable.disha,R.drawable.kabir,R.drawable.disha,R.drawable.profile,R.drawable.salman,R.drawable.disha,R.drawable.kabir,R.drawable.profile,R.drawable.salman,R.drawable.disha,R.drawable.kabir,R.drawable.disha,R.drawable.disha,R.drawable.kabir,R.drawable.profile,R.drawable.salman,R.drawable.disha,R.drawable.kabir,R.drawable.disha};

        String course[]={"Salman","Disha","Sahaid","Kobid","Salman","Disha","Sahaid","Kobid","Salman","Disha","Sahaid","Kobid","Salman","Disha","Sahaid","Kobid","Salman","Disha","Sahaid","Kobid","Salman","Disha","Sahaid","Kobid","Salman","Disha","Sahaid","Kobid"};
        courselist.setAdapter(new CourseAdapter(images,course));
    }
    }
