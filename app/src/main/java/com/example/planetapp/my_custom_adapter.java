package com.example.planetapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class my_custom_adapter extends ArrayAdapter<planet> {
    //using custom layout --> custom adapter
    //using custom object(model class) --> using arrayadapter<planet>


    public ArrayList<planet> planetArraylist ;
    Context context ;
    public my_custom_adapter(@NonNull Context context, ArrayList<planet> planetArraylist) {
        super(context,R.layout.item_list_layout , planetArraylist);
        this.planetArraylist = planetArraylist;
        this.context = context ;
    }

    private static class MyViewholder{
        TextView planetname ;
        TextView mooncount ;
        ImageView planetImg ;


    }

    //getView()- used to create and return  view for a specific time .


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //1(getting data)-Getting planet object at the sepcific position
        planet p = getItem(position);

        //2(Inflating view)-- check for condition
        MyViewholder mvh ;
        final View result ;
        if(convertView==null){
            //I have to add new layout to this view
            mvh = new MyViewholder();
            LayoutInflater l = LayoutInflater.from(getContext());
            convertView = l.inflate(
                    R.layout.item_list_layout,
                    parent,
                    false
            );
            //Finding view
            mvh.planetImg = (ImageView) convertView.findViewById(R.id.imageView);
            mvh.planetname= (TextView)  convertView.findViewById(R.id.planet);
            mvh.mooncount= (TextView)  convertView.findViewById(R.id.moon);

            result = convertView ;

            convertView.setTag(mvh);
        }

        else{
            //view is recycled
            mvh = (MyViewholder) convertView.getTag();//the primary purpose of get tag is to retrieve previouly assoicated view object
            result = convertView ;
        }

        //Adding data

        mvh.planetname.setText(p.getPlanet());
        mvh.mooncount.setText(p.getMoons());
        mvh.planetImg.setImageResource(p.getPlanetImage());

        return result;







    }
}
