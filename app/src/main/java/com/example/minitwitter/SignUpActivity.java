package com.example.minitwitter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSingUp;
    TextView txtLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        //Oculta el  toolBar de la pantalla
        getSupportActionBar().hide();

        btnSingUp = findViewById(R.id.buttonSignUp);
        txtLogin = findViewById(R.id.textViewLogin);

        btnSingUp.setOnClickListener(this);
        txtLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch(id){
            case R.id.buttonSignUp:
                break;
            case R.id.textViewLogin:
                gotoLogin();
                break;
        }
    }

    private void gotoLogin() {
        Intent i = new Intent(SignUpActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}