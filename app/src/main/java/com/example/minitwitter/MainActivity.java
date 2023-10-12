package com.example.minitwitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    TextView txtSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.buttonLogin);
        txtSignUp = findViewById(R.id.textViewGoSignUp);

        btnLogin.setOnClickListener(this);
        txtSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.buttonLogin:

                break;

            case R.id.textViewGoSignUp:
                gotoSignup();
                break;
        }

    }

    private void gotoSignup() {
        Intent i = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(i);
        finish();
    }
}