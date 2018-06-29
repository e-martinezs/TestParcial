package com.pdm.testparcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pdm.testparcial.adapter.TestAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TestAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
    }

    private void bindViews(){
        recyclerView=findViewById(R.id.recycler_view);
        adapter=new TestAdapter(getList());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private List<String> getList(){
        List<String> newList=new ArrayList<>();
        newList.add("hola");
        newList.add("que");
        newList.add("pedo");
        newList.add("morro");

        return newList;
    }
}
