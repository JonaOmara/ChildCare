package com.invitech.childcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class doc_schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_schedule);
    }
    public void doc1_btn(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void doc2_btn(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void sch1_btn(View view){

        Toast.makeText(this,"You will be notified",Toast.LENGTH_SHORT).show();
    }
    public void sch2_btn(View view){
        Toast.makeText(this,"You will be notified",Toast.LENGTH_SHORT).show();
    }
    public void sch3_btn(View view){
        Toast.makeText(this,"You will be notified",Toast.LENGTH_SHORT).show();
    }

}
