package com.example.classex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static android.R.layout.simple_list_item_1;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        country = getResources().getStringArray(R.array.Countries);
        Spinner spin = findViewById(R.id.spinner);
        ArrayAdapter<String>  adapater = new ArrayAdapter<>(this,simple_list_item_1,country);
        spin.setAdapter(adapater);
        spin.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String itemSelected = parent.getItemAtPosition(position).toString();
        Toast.makeText(this, itemSelected, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
