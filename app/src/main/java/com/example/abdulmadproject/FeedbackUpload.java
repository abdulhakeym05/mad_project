package com.example.abdulmadproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FeedbackUpload extends AppCompatActivity {

    private EditText RegNum,Password,Branch,FullName;
    private Button Registration;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_upload);


        RegNum = (EditText) findViewById(R.id.etRegNumber);
        Password = (EditText) findViewById(R.id.etPassword);
        FullName = (EditText) findViewById(R.id.etFullName);
        Branch = (EditText) findViewById(R.id.etBranch);
        Registration = (Button) findViewById(R.id.btnRegister);


        ref = FirebaseDatabase.getInstance().getReference().child("Member");
        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(FeedbackUpload.this, "data saved", Toast.LENGTH_SHORT);
            }
        });

    }
}