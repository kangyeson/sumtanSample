package com.example.mysumtan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Frag_check_shelter extends Fragment {

    private View view;
    private ArrayList<MainData_check> arrayList;
    private MainAdapter_check mainAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.activity_frag_check_shelter,container,false);

        recyclerView=(RecyclerView)view.findViewById(R.id.rv);
        linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList=new ArrayList<>();

        mainAdapter=new MainAdapter_check(arrayList);
        recyclerView.setAdapter(mainAdapter);

        Button btn_add=(Button)view.findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainData_check mainData=new MainData_check(R.drawable.ic_baseline_bookmark_border_56, R.drawable.input_radius_profile, "조링링", "010-4545-5656");
                arrayList.add(mainData);
                mainAdapter.notifyDataSetChanged();
            }
        });

        return view;
    }
}