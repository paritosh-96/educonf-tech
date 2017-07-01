package com.example.educonf.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pd extends AppCompatActivity {

    ListView lvD17;
    String listD17[]={"Personality Development"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pd);

        lvD17=(ListView)findViewById(R.id.listViewD17);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, listD17);
        lvD17.setAdapter(adapter);

        lvD17.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(position==1)
                {

                }

            }
        });

    }
}
