package com.example.abdulmadproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        Name = (EditText)findViewById(R.id.adminusername);
        Password = (EditText)findViewById(R.id.adminpassword);
        Login = (Button)findViewById(R.id.adminlogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void validate(String userName, String userPassword){
        if((userName.equals("Admin")) && (userPassword.equals("Admin"))){
            Intent intent = new Intent(Admin.this, ViewFeedbacks.class);
            startActivity(intent);

        }else{
            Toast.makeText(Admin.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
        }
    }
}

