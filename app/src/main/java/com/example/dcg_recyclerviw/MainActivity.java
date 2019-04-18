package com.example.dcg_recyclerviw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList <Hero> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_categoty);
        rvCategory.setHasFixedSize(true);

        list.addAll(HeroesData.getListData());
        showRecyclerList();
    }

    private  void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter listHeroAdapter = new ListHeroAdapter(this);
        listHeroAdapter.setListHero(list);
        rvCategory.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
//
//    @Override
//    public  boolean onOptionItemSelected (MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.action_list:
//                break;
//
//            case R.id.action_grid:
//                break;
//
//            case R.id.action_cardview:
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
