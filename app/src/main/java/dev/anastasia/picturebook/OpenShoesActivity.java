package dev.anastasia.picturebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpenShoesActivity extends AppCompatActivity {
    Button btnNext4, btnPrevious4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_shoes);
        cast();
    }
    void cast(){
        btnNext4=(Button) findViewById(R.id.btnNext4);
        btnPrevious4=(Button) findViewById(R.id.btnPrevious4);
        btnPrevious4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OpenShoesActivity.this,HeelsActivity.class);
                startActivity(intent);
            }
        });
        btnNext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OpenShoesActivity.this,SneakersActivity.class);
                startActivity(intent);
            }
        });
    }
}