package com.example.userlogin2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText txtName ,txtPassword;
    public Login l = new Login();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtName = findViewById(R.id.txtNameRG);
        txtPassword=findViewById(R.id.txtPasswordRG);
        l.setArray(50);
    }

    public void Register(View view)
    {
        String strName = txtName.getText().toString();
        String strPassword =txtPassword.getText().toString();

        if ((strName.length()>0)&&(strPassword.length()>0))
        {
            l.Add(strName,strPassword);
            Toast.makeText(Register.this,"New user added successfully!",
                    Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(Register.this,"You are missing some fields!",
                    Toast.LENGTH_LONG).show();
            txtName.setError("Enter the value here");
            txtPassword.setError("Enter the value here");
        }
    }
    public void LoginPage(View view)
    {
        finish();
    }
}