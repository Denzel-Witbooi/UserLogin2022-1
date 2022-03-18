package com.example.userlogin2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ViewUsers extends AppCompatActivity {


    ListView lsView;
    String[] StudentName = {"Josh","Connor","Jeff","Rob"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_users);

        ArrayAdapter adapter = new ArrayAdapter<String>(
                this,R.layout.listview,StudentName);

        lsView = (ListView) findViewById(R.id.lvOutput);
        lsView.setAdapter(adapter);

    }


    public void NewLayout(View view)
    {
        Login l = new Login();
        DetailsListAdapter adapter =new DetailsListAdapter(this,
                R.layout.listviewmulti,l.returnArray());
        lsView.setAdapter(adapter);
    }
}