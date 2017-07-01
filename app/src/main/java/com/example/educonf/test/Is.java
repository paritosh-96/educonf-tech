package com.example.educonf.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Is extends AppCompatActivity {

    ListView lvD10;
    String listD10[]={"Course Calender","Course Content","Practical List","Project List"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is);

        lvD10=(ListView)findViewById(R.id.listViewD10);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, listD10);
        lvD10.setAdapter(adapter);

        lvD10.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(position==1)
                {

                }
                else if(position==2)
                {

                }
                else if(position==3)
                {

                }
                else if(position==4)
                {

                }

            }
        });

    }
}
