package com.example.educonf.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DotNet1 extends AppCompatActivity {

    ListView lvD1;
    String listD1[]={"Practical List","Practical Schedule","Project List","Schedule","Content"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dot_net1);

        lvD1=(ListView)findViewById(R.id.listViewD1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, listD1);
        lvD1.setAdapter(adapter);

        lvD1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
