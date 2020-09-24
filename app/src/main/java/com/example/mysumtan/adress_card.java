package com.example.mysumtan;

import android.app.Dialog;
import android.content.Context;

import androidx.annotation.NonNull;


public class adress_card extends Dialog {

    public adress_card(@NonNull Context context) {
        super(context);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.adress_card);
    }
}
