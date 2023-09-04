package com.example.planetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv ;
    ArrayList<planet> al ;

    private static my_custom_adapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //1 -adapterview
        lv = findViewById(R.id.listview);

        //2- creating data source
        al = new ArrayList<planet>();

        planet p1 = new planet("Mercury","0 Moons",R.drawable.mercury);
        planet p2 = new planet("Venus","0 Moons",R.drawable.venus);
        planet p3 = new planet("Earth","1 Moons",R.drawable.earth);
        planet p4 = new planet("Mars","2 Moons",R.drawable.mars);
        planet p5 = new planet("Jupiter","79 Moons",R.drawable.jupiter);
        planet p6 = new planet("Saturn","83 Moons",R.drawable.saturn);
        planet p7 = new planet("Uranus","27 Moons",R.drawable.uranus);
        planet p8 = new planet("Neptune","14 Moons",R.drawable.neptune);

        al.add(p1);
        al.add(p2);
        al.add(p3);
        al.add(p4);
        al.add(p5);
        al.add(p6);
        al.add(p7);
        al.add(p8);


        //Adapter
        adapter  = new my_custom_adapter(getApplicationContext() , al);

        lv.setAdapter(adapter);

        //handling the click view
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, "Planet: "+adapter.getItem(i).getPlanet(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}