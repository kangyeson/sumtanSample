package com.example.mysumtan;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;


public class AddressCard extends Dialog {
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.address_card);

        Button carddown = findViewById(R.id.address_card_down);

        carddown.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                dismiss();
            }
        });
    }

    public AddressCard(Context mContext){
        super(mContext);
        this.mContext = mContext;
    }
}
