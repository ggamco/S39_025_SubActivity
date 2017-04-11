package com.gmbdesign.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creamos el intent explicito para llamar a la subactividad
        Intent intent = new Intent(this, SubActividad.class);
        //lanzamos la actividad con un codigo propio de petición
        startActivityForResult(intent, 55);

    }

    //sobreescribimos este método para recibir la respuesta
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("TAG", "Codigo de petición: " + requestCode);
        Log.d("TAG", "Codigo de resultado: " + resultCode);
        Log.d("TAG", "Datos recibidos, NOMBRE: " + data.getStringExtra("NOMBRE"));
    }
}
