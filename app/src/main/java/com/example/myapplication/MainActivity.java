package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button goToLogin;
    private Button mSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToLogin = (Button) findViewById(R.id.LoginID);

        goToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });

        mSignUp = (Button) findViewById(R.id.CreateAccountButtonID);
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createAccount = new Intent (MainActivity.this, SignUpPage.class);
                startActivity(createAccount);
            }
        });

    }
}

