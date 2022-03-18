package com.example.userlogin2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtName,txtPassword;
    public Login l = new Login();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName =findViewById(R.id.txtName);
        txtPassword=findViewById(R.id.txtPassword);
        l.setArray(50);
    }
    public void Login(View view)
    {
        String strName = txtName.getText().toString();
        String strPassword= txtPassword.getText().toString();

        if (l.Valid(strName,strPassword))
        {
            Toast.makeText(getApplicationContext(),"You are the real "+strName,
                    Toast.LENGTH_LONG).show();
            startActivity(new Intent(MainActivity.this,ViewUsers.class));
        }else
        {
            Toast.makeText(getApplicationContext(),"You not real  "+strName,
                    Toast.LENGTH_LONG).show();
        }
    }
    public void RegPage(View view)
    {


        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }
}