package com.example.pm1examengrupo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ActivityUsuario extends AppCompatActivity {

    Button btnSave,btnListarContactos;
    FloatingActionButton btnTomarfoto;
    ImageView Foto;
    EditText txtNombre,txtTelefono,txtLat,txtLon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION,}, 1000);
        } else {

        }

        btnSave = (Button) findViewById(R.id.btnGuardar);
        btnListarContactos = (Button) findViewById(R.id.btnContactos);
        btnTomarfoto = (FloatingActionButton) findViewById(R.id.fbtnTomarFoto);
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtTelefono = (EditText) findViewById(R.id.txtTelefono);
        txtLat = (EditText) findViewById(R.id.txtLat);
        txtLon = (EditText) findViewById(R.id.txtLon);



        

        btnListarContactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ActivityListarContactos.class);
                startActivity(intent);
            }
        });

        btnTomarfoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }









}