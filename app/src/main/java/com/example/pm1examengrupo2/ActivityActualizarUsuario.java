package com.example.pm1examengrupo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.sql.Blob;

public class ActivityActualizarUsuario extends AppCompatActivity {
    //cambio 18-03-2022
    Button btnAtras;
    EditText txtNombre,txtTelefono,txtLat,txtLon;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_usuario);

        String id = getIntent().getStringExtra("id");
        String nombre =getIntent().getStringExtra("nombre");
        String telefono =getIntent().getStringExtra("telefono");
        Double latitud =Double.valueOf(getIntent().getStringExtra("latitud").toString());
        Double longitud =Double.valueOf(getIntent().getStringExtra("longitud").toString());
        String fotoString =getIntent().getStringExtra("foto");

        imageView = (ImageView) findViewById(R.id.imageViewAU);
        btnAtras = (Button) findViewById(R.id.btnAtrasAU);
        txtNombre = (EditText) findViewById(R.id.txtNombreAU);
        txtTelefono = (EditText) findViewById(R.id.txtTelefonoAU);
        txtLat = (EditText) findViewById(R.id.txtLatAU);
        txtLon = (EditText) findViewById(R.id.txtLonAU);

        txtNombre.setText(nombre);
        txtTelefono.setText(telefono);
        txtLat.setText(String.valueOf(latitud));
        txtLon.setText(String.valueOf(longitud));

        mostrarFoto(fotoString);

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ActivityListarContactos.class);
                startActivity(intent);
            }
        });

    }

    public void mostrarFoto(String foto) {
        try {
            String base64String = "data:image/png;base64,"+foto;
            String base64Image = base64String.split(",")[1];
            byte[] decodedString = Base64.decode(base64Image, Base64.DEFAULT);
            Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);

//            Bitmap bitmap = null;
//            byte[] blob = base64Image;
//            ByteArrayInputStream bais = new ByteArrayInputStream(blob);
//            bitmap = BitmapFactory.decodeStream(bais);
            imageView.setImageBitmap(decodedByte);

        }catch (Exception ex){
            ex.toString();
        }
    }
}