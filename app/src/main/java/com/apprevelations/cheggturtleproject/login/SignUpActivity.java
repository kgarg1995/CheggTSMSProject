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

public class SignUpActivity extends AppCompatActivity {

    private Button signUp;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signUp = (Button) findViewById(R.id.signUpButton);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
