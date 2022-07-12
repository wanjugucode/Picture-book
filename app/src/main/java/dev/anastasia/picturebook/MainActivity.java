package dev.anastasia.picturebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText etName,etPassword;
    Button btnGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }
    void login() {
        etPassword = (TextInputEditText) findViewById(R.id.etPassword);
        etName = (TextInputEditText) findViewById(R.id.etName);
        btnGetStarted = (Button) findViewById(R.id.btnGetStarted);
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BootsActivity.class);
                startActivity(intent);
            }
        });



    }
    void validateLogin(){



    }
}