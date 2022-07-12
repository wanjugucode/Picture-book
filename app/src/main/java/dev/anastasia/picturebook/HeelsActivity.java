package dev.anastasia.picturebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeelsActivity extends AppCompatActivity {
Button btnPrevious3,btnNext3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heels);
        cast();
    }
    void cast(){
        btnNext3=(Button) findViewById(R.id.btnNext3);
        btnPrevious3=(Button) findViewById(R.id.btnPrevious3);
        btnPrevious3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HeelsActivity.this, ClosedShoesActivity.class);
                startActivity(intent);

            }
        });
        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HeelsActivity.this, OpenShoesActivity.class);
                startActivity(intent);
            }
        });
    }
}