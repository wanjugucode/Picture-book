package dev.anastasia.picturebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BootsActivity extends AppCompatActivity {
    Button btnPrevious1, btnNext1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boots);
        cast();
    }
     void cast(){
        btnNext1=(Button) findViewById(R.id.btnNext1);
        btnPrevious1=(Button) findViewById(R.id.btnPrevious1);
        btnPrevious1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BootsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BootsActivity.this,ClosedShoesActivity.class);
                startActivity(intent);
            }
        });

    }
}