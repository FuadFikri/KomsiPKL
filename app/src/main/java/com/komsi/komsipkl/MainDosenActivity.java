package com.komsi.komsipkl;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainDosenActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KegiatanAdapter adapter;
    private ArrayList<Kegiatan> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dosen);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainDosenActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        }
    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Kegiatan("Analisis", "Buat ERD", "12052018", 1));
        mahasiswaArrayList.add(new Kegiatan("Design", "Database Design", "12052018",1));
        mahasiswaArrayList.add(new Kegiatan("Design", "Wireframe", "12052018",0));
        mahasiswaArrayList.add(new Kegiatan("DEsign", "UI", "12052018",0));
    }
}
