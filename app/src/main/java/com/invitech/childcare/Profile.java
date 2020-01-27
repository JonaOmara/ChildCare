package com.invitech.childcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void mother (View view){
        Intent intent = new Intent(this, more.class);
        startActivity(intent);
    }

    public void savep (View view){
        Toast.makeText(this,"Profile Changed",Toast.LENGTH_SHORT).show();
        finish();
    }

}
