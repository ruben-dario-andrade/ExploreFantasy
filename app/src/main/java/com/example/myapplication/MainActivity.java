package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button loginButton;
    EditText usernameText, passwordText;

    String errorMessage = "Username or Password are incorrect";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton = (Button)findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginSuccess();
                // Check credentials from text fields
                // if yes, go to NavActivity
                // if no, display errorMessage in red
            }
        });
    }

    private void loginSuccess(){
        Intent intent = new Intent(this, NavActivity.class);
        startActivity(intent);
    }

}
