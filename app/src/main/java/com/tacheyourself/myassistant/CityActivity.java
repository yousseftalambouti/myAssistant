package com.tacheyourself.myassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class CityActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView marrakech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        marrakech=findViewById(R.id.marrakech);
        marrakech.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        // pour le traitement des hotels
        if(id==marrakech.getId()){


            startSearchActivity("marrakech");
            return;
        }
    }

    private void startSearchActivity(String name) {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("name",name);

        startActivity(intent);
    }
}