package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Password;
    private EditText Phone_Number;
    private EditText Confirm_Password;
    private Button login;
    private Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Password = (EditText) findViewById(R.id.editTextTextPassword);
        Password = (EditText) findViewById(R.id.editTextTextPassword2);
        Password = (EditText) findViewById(R.id.editTextTextPassword3);
        Phone_Number = (EditText) findViewById(R.id.editTextPhone);
        Phone_Number = (EditText) findViewById(R.id.editTextPhone2);
        login = (Button) findViewById(R.id.button);
        register = (Button) findViewById(R.id.button);


    }



}