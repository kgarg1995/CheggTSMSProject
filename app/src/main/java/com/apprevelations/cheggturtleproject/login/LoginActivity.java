package com.apprevelations.cheggturtleproject.login;

import com.apprevelations.cheggturtleproject.MainActivity;
import com.apprevelations.cheggturtleproject.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by karangarg on 04/06/17.
 */

public class LoginActivity extends AppCompatActivity {

    private Button signin, fogotpassword, signup;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signin = (Button) findViewById(R.id.signIn);
        fogotpassword = (Button) findViewById(R.id.forgotPassword);
        signup = (Button) findViewById(R.id.signUp);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

    }
}
