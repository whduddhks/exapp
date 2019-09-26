package com.cookandroid.project_testactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
    btnNewActivity.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(),
                    SecondActivity.class);
            startActivity(intent);
        }
    })
}
