package dev.anastasia.picturebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SneakersActivity extends AppCompatActivity {
Button btnPrevious5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sneakers);
        cast();
    }
    void  cast(){
        btnPrevious5=(Button) findViewById(R.id.btnPrevious5);
        btnPrevious5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SneakersActivity.this,OpenShoesActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}