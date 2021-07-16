package com.example.abdulmadproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentRegister extends AppCompatActivity {

    private EditText RegNum,Password,Branch,FullName;
    private Button Registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register);

        RegNum = (EditText) findViewById(R.id.etRegNumber);
        Password = (EditText) findViewById(R.id.etPassword);
        FullName = (EditText) findViewById(R.id.etFullName);
        Branch = (EditText) findViewById(R.id.etBranch);
        Registration = (Button) findViewById(R.id.btnRegister);

        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StudentRegister.this, StudentLogin.class));
            }
        });


    }
}
