package com.example.abdulmadproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;

public class StudentLogin extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;
    private EditText Name;
    private EditText Password;
    private TextView Info,forgotPassword;
    private Button Login,Register;
    private int counter = 5;
    private FirebaseAuth mauth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        Name = (EditText) findViewById(R.id.etRegNumber);
        Password = (EditText) findViewById(R.id.etPassword);
        Info = (TextView) findViewById(R.id.tvInfo);
        Login = (Button) findViewById(R.id.btnLogin);
        Register = (Button) findViewById(R.id.btnRegister);
        forgotPassword = (TextView) findViewById(R.id.tvForgotPassword);



        Info.setText("No of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StudentLogin.this, StudentRegister.class));
            }
        });
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StudentLogin.this, ForgetPassowrd.class));
            }
        });
    }
        private void validate(String RegNumber, String Password){
            if((RegNumber.equals("Admin")) && (Password.equals("1234"))){
                Intent intent = new Intent(StudentLogin.this, FeedbackUpload.class);
                startActivity(intent);
            }else{
                counter--;

                Info.setText("No of attempts remaining: " + String.valueOf(counter));

                if(counter == 0){
                    Login.setEnabled(false);
                }
        }

    }}