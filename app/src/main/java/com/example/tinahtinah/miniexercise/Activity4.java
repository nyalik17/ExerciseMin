package com.example.tinahtinah.miniexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        button4= (Button) findViewById(R.id.back_button);

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }

        });
    }
    public void finish(){
        Intent i = new Intent(this,MainActivity.class);

        startActivity(i);
    }
}
