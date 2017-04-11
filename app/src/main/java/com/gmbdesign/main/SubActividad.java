package com.gmbdesign.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SubActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_actividad);

        //En la subactividad recuperamos el intent que nos llama
        Intent intent = getIntent();
        //Almacenamos los datos solicitados
        intent.putExtra("NOMBRE", "Gustavo Gamboa");
        //enviamos la respuesta a la actividad principal
        setResult(8, intent);
        //finalizamos la actividad
        finish();
    }
}
