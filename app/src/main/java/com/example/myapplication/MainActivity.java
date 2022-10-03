package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Connection connection;
    String ConnectionResult="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    SimpleAdapter ad;
    public void GetList(View v)
    {
        ListView listView=(ListView) findViewById(R.id.listView1);
        List<Map<String,String>> Mydatalist=null;
        ListItem MyData = new ListItem();
        Mydatalist = MyData.getlist();

        String[] From={"ID", "Familiya", "Name", "Otchestvo", "Dolzhnost", "Oklad"};
        int[] Tow={R.id.ID, R.id.Familiya, R.id.Name, R.id.Otchestvo, R.id.Dolzhnost, R.id.Oklad};
        ad = new SimpleAdapter(MainActivity.this, Mydatalist, R.layout.listlayout, From, Tow);
        listView.setAdapter(ad);
    }
}