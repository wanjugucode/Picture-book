package dev.anastasia.picturebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClosedShoesActivity extends AppCompatActivity {
   Button btnPrevious2, btnNext2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closed_shoes);
        cast();
    }
    void cast(){
        btnPrevious2=(Button) findViewById(R.id.btnPrevious2);
        btnNext2=(Button) findViewById(R.id.btnNext2);
        btnPrevious2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClosedShoesActivity.this,BootsActivity.class);
                startActivity(intent);
            }
        });
          btnNext2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent=new Intent(ClosedShoesActivity.this,HeelsActivity.class);
                  startActivity(intent);
              }
          });
    }
}