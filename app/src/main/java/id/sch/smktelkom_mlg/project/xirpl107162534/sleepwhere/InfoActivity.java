package id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.adapter.InfoAdapter;
import id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere.baru.Info;


import static android.support.v7.recyclerview.R.attr.layoutManager;

public class InfoActivity extends AppCompatActivity {

    ArrayList<Info> iList=new ArrayList<>();
    InfoAdapter iAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        RecyclerView recyclerview = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutmanager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutmanager);
        iAdapter = new InfoAdapter(iList);
        recyclerview.setAdapter(iAdapter);

        isiData();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void isiData() {

        Resources resources = getResources();
        String [] arJudul = resources.getStringArray(R.array.tempat);
        String [] arDeskripsi = resources.getStringArray(R.array.des_tempat);
        TypedArray a = resources.obtainTypedArray(R.array.lokasi_tempat);
        Drawable[] arFoto = new Drawable[a.length()];
        for (int i = 0; i < arFoto.length; i++)
        {
            arFoto[i] = a.getDrawable(i);
        }
        a.recycle();

        for (int i = 0; i < arJudul.length; i++)
        {
            iList.add(new Info(arJudul[i],arDeskripsi[i],arFoto[i]));
        }
        iAdapter.notifyDataSetChanged();
    }
    }

