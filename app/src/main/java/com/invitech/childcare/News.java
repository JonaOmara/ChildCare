package com.invitech.childcare;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

public class News extends AppCompatActivity {
    Dialog popdialogue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        // pop up dialogue
        popdialogue = new Dialog(this);




    }



    public void post(View view){
        showpopup();
    }
    public void showpopup (){
        ImageView send_btn;
        popdialogue.setContentView(R.layout.post_card);
        send_btn = (ImageView) popdialogue.findViewById(R.id.send);
        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popdialogue.dismiss();

            }
        });
        popdialogue.show();

    }



}
