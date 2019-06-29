package com.example.tinahtinah.miniexercise;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.button_one);
        two=findViewById(R.id.button_two);
        three=findViewById(R.id.button_three);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code here executes on main thread after user presses button

                             launchActivity();

            }

        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code here executes on main thread after user presses button

                launchActivity2();

            }

        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code here executes on main thread after user presses button

                launchActivity3();

            }

        });
    }
    private void launchActivity(){
        Intent intent = new Intent(this,Activity2.class);

        startActivity(intent);
    }
    private void launchActivity2(){
        Intent intent = new Intent(this,Activity3.class);

        startActivity(intent);
    }
    private void launchActivity3(){
        Intent intent = new Intent(this,Activity4.class);

        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
