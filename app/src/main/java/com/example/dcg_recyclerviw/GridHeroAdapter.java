package com.example.dcg_recyclerviw;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class GridHeroAdapter extends RecyclerView.Adapter<GridHeroAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<Hero> listHero;

    public GridHeroAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Hero> getListHero() {
        return listHero;
    }

    public void setListHero(ArrayList<Hero> listHero) {
        this.listHero = listHero;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder gridViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class GridViewHolder extends RecyclerView.ViewHolder{
        public  GridViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
