package com.example.educonf.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Javal1 extends AppCompatActivity {

    ListView lvD12;
    String listD12[]={"Practical List","Practical Schedule","Project List","Schedule","Content"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javal1);

        lvD12=(ListView)findViewById(R.id.listViewD12);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, listD12);
        lvD12.setAdapter(adapter);

        lvD12.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
