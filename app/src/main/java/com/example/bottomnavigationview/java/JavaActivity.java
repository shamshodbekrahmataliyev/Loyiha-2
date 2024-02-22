package com.example.bottomnavigationview.java;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bottomnavigationview.R;

public class JavaActivity extends AppCompatActivity {

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        myDialog = new Dialog(this);
    }
    public void ShowPopup(View v){
        TextView txtclose;
        Button btnfollow;
        myDialog.setContentView(R.layout.java);
        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        btnfollow = (Button) myDialog.findViewById(R.id.btnfollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }
}