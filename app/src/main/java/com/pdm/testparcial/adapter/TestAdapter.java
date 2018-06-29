package com.pdm.testparcial.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pdm.testparcial.R;

import java.util.List;

/**
 * Created by uca on 06-29-18.
 */

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder>{

    private List<String> list;

    public TestAdapter(List<String> list){
        this.list = list;
    }

    @NonNull
    @Override
    public TestAdapter.TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.test_cardview, parent, false);
        return new TestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TestAdapter.TestViewHolder holder, int position) {
        holder.textView.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class TestViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        public TestViewHolder(View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.cardviewTextView);
        }
    }
}
