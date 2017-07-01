package com.example.educonf.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DotNet2 extends AppCompatActivity {

    ListView lvD2;
    String listD2[]={"Practical List","Practical Schedule","Project List","Schedule","Content"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dot_net2);

        lvD2=(ListView)findViewById(R.id.listViewD2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, listD2);
        lvD2.setAdapter(adapter);

        lvD2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
                else
                if(position==5)
                {

                }
            }
        });
    }
}
