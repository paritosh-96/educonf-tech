package com.example.educonf.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Plc extends AppCompatActivity {

    ListView lvD21;
    String listD21[]={"Course Calender","Course Content","Practical List","Project List"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plc);

        lvD21=(ListView)findViewById(R.id.listViewD21);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, listD21);
        lvD21.setAdapter(adapter);

        lvD21.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
