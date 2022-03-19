package com.example.pm1examengrupo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityActualizarUsuario extends AppCompatActivity {

    Button btnAtras;
    EditText txtNombre,txtTelefono,txtLat,txtLon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_usuario);

        String id = getIntent().getStringExtra("id");
        String nombre =getIntent().getStringExtra("nombre");
        String telefono =getIntent().getStringExtra("telefono");
        Double latitud =Double.valueOf(getIntent().getStringExtra("latitud").toString());
        Double longitud =Double.valueOf(getIntent().getStringExtra("longitud").toString());


        btnAtras = (Button) findViewById(R.id.btnAtrasAU);
        txtNombre = (EditText) findViewById(R.id.txtNombreAU);
        txtTelefono = (EditText) findViewById(R.id.txtTelefonoAU);
        txtLat = (EditText) findViewById(R.id.txtLatAU);
        txtLon = (EditText) findViewById(R.id.txtLonAU);

        txtNombre.setText(nombre);
        txtTelefono.setText(telefono);
        txtLat.setText(String.valueOf(latitud));
        txtLon.setText(String.valueOf(longitud));

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ActivityListarContactos.class);
                startActivity(intent);
            }
        });
    }
}