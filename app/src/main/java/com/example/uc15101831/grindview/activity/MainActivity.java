package com.example.uc15101831.grindview.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.example.uc15101831.grindview.R;
import com.example.uc15101831.grindview.adapter.AdapterGrindView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    AdapterGrindView adapter;
    GridView grindView;
    ArrayAdapter arrayAdapter;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arrayNum = {"1","2","3","4"};

        grindView = findViewById(R.id.gvNumeros); // Recupera o GridView
        adapter = new AdapterGrindView(arrayNum, this); // Inicialize seu Adapter
        grindView.setAdapter(adapter);
        grindView.setOnItemClickListener(this); //Quando clicar


//        adapter = new AdapterGrindView(arrayNum);
//
//        grindView = findViewById(R.id.gvNumeros);
//        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayNum);
//        grindView.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String num = (String) adapter.getItem(i);



//        intent = new Intent(this, carroActivity.class);
//        Carro carro = null;
        switch(i) {
            case 0:
                Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);

                break;
            case 1:
                Toast.makeText(this,"blaa 1",Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(this,"blaa 2",Toast.LENGTH_LONG).show();
        }


//        intent.putExtra("objCarro", carro);
//        startActivity(intent);
    }
}
