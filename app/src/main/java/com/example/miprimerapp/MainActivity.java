package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // 3. creo una constante EXTRE_MESSAGE
    public static final String EXTRA_MESSAGE = "com.example.miprimerapp.MESSAGE";

    // 1. código por defecto al crear la app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     // 2. se llama cuando el usuario toca botón Enviar
    public void sendMessage(View view) {
        Intent intent = new Intent(this, SegundaActividad.class);
        EditText editText = (EditText) findViewById(R.id.editText1);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
