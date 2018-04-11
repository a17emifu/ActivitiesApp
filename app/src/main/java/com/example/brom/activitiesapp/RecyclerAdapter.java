package com.example.brom.activitiesapp;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Emiko on 4/10/2018.
 */
//Class för recycleradapter för cardview
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    //Arraylist för cardstitle
    private String[] titles = {
            "Matterhorn","Mont Blanc","Denali"
    };
    //Arraylist för cardsinnehåll
    private String[] details = {"4478m i Alps","4808m i Alps","6190m i Alaska"};
    //Viewholder (kopplar ihop xmls ID och textviews värde)
    class ViewHolder extends RecyclerView.ViewHolder{
        public int currentItem;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView){
            super(itemView);
            itemTitle = (TextView)itemView.findViewById(R.id.textTitle);
            itemDetail = (TextView)itemView.findViewById(R.id.textinnehall);
        }
    }
    //ViewGroup (kopplar ihop vilken layout-fil som används)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_layout,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }
    //Viewholder för att skulle kunna sätta text i titeln och innehåll
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
    }
    //Visar
    @Override
    public int getItemCount(){return titles.length;}
}
