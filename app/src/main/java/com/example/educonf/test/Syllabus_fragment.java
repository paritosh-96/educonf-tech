package com.example.educonf.test;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



/**
 * A simple {@link Fragment} subclass.
 */
public class Syllabus_fragment extends Fragment  {


    String list[]={"Dot Net-Level 1","Dot Net-Level 2","Android-Level 1","Android-Level 2","C++","CCNP","Embedded Systems and Robotics-Level 1",
            "Embedded Systems and Robotics-Level 2","Embedded Systems and Robotics-Level 3","Information Security","INTERNET REPUTATION AND MARKETING",
            "Java-Level 1","Java-Level 2","Matlab","MSOffice 2010","Networking","Personality Development","PHP-Level 1","PHP-Level 2","PHP-Level 3",
            "PLC Programming"};

    ListView lv;
    public Syllabus_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_syllabus, container, false);
        lv=(ListView)v.findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(v.getContext(), R.layout.activity_listview, list);
        lv.setAdapter(adapter);

        /*lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
               if(position==0)
               {
                   Intent it=new Intent(getActivity(),DotNet1.class);
                   getActivity().startActivity(it);
               }
                else if(position==1)
               {
                   Intent it=new Intent(getActivity(),DotNet2.class);
                   getActivity().startActivity(it);
               }
                else if(position==2)
               {

                   Intent it=new Intent(getActivity(),Androidl1.class);
                   getActivity().startActivity(it);
               }
               else if(position==3)
               {
                   Intent it=new Intent(getActivity(),Androidl2.class);
                   getActivity().startActivity(it);
               }
               else if(position==4)
               {
                   Intent it=new Intent(getActivity(),Cplus.class);
                   getActivity().startActivity(it);
               }
               else if(position==5)
               {
                   Intent it=new Intent(getActivity(),Ccnp.class);
                   getActivity().startActivity(it);
               }
               else if(position==6)
               {
                   Intent it=new Intent(getActivity(),Esrl1.class);
                   getActivity().startActivity(it);
               }
               else if(position==7)
               {
                   Intent it=new Intent(getActivity(),Esrl2.class);
                   getActivity().startActivity(it);
               }
               else if(position==8)
               {
                   Intent it=new Intent(getActivity(),Esrl3.class);
                   getActivity().startActivity(it);
               }
               else if(position==9)
               {
                   Intent it=new Intent(getActivity(),Is.class);
                   getActivity().startActivity(it);
               }
               else if(position==10)
               {
                   Intent it=new Intent(getActivity(),Irm.class);
                   getActivity().startActivity(it);
               }
               else if(position==11)
               {
                   Intent it=new Intent(getActivity(),Javal1.class);
                   getActivity().startActivity(it);
               }
               else if(position==12)
               {
                   Intent it=new Intent(getActivity(),Javal2.class);
                   getActivity().startActivity(it);
               }
               else if(position==13)
               {
                   Intent it=new Intent(getActivity(),Matlab.class);
                   getActivity().startActivity(it);
               }
               else if(position==14)
               {
                   Intent it=new Intent(getActivity(),Msoffice.class);
                   getActivity().startActivity(it);
               }
               else if(position==15)
               {
                   Intent it=new Intent(getActivity(),Networking.class);
                   getActivity().startActivity(it);
               }
               else if(position==16)
               {
                   Intent it=new Intent(getActivity(),Pd.class);
                   getActivity().startActivity(it);
               }
               else if(position==17)
               {
                   Intent it=new Intent(getActivity(),Phpl1.class);
                   getActivity().startActivity(it);
               }
               else if(position==18)
               {
                   Intent it=new Intent(getActivity(),Phpl2.class);
                   getActivity().startActivity(it);
               }
               else if(position==19)
               {
                   Intent it=new Intent(getActivity(),Phpl3.class);
                   getActivity().startActivity(it);
               }
               else if(position==20)
               {
                   Intent it=new Intent(getActivity(),Plc.class);
                   getActivity().startActivity(it);
               }


            }
        });*/
        return v;
    }

}
