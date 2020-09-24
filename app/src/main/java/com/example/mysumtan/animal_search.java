package com.example.mysumtan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class animal_search extends AppCompatActivity {

    Button search_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animalsearch_activity);

        search_button = (Button)findViewById(R.id.search_button);

        search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(animal_search.this);
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.round_card, null);
                builder.setView(view);

                final ListView listview1 = (ListView)view.findViewById(R.id.adress1_list);
                final ListView listview2 = (ListView)view.findViewById(R.id.adress2_list);
                final AlertDialog dialog = builder.create();

            }
        });

    }
}