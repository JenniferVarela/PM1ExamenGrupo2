package com.example.pm1examengrupo2.Models;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationProvider;
import android.os.Bundle;
import android.util.Log;

import com.example.pm1examengrupo2.ActivityUsuario;
import com.example.pm1examengrupo2.Models.Usuario;

public class Localizacion implements LocationListener {

    ActivityUsuario usuarioActivity;

    public ActivityUsuario getUsuarioActivity() {
        return usuarioActivity;
    }

    public void setUsuarioActivity(ActivityUsuario usuarioActivity) {
        this.usuarioActivity = usuarioActivity;
    }


    @Override
    public void onLocationChanged(Location loc) {
        // Este metodo se ejecuta cada vez que el GPS recibe nuevas coordenadas
        // debido a la deteccion de un cambio de ubicacion

        loc.getLatitude();
        loc.getLongitude();

        String Text = "Mi ubicacion actual es: " + "\n Lat = "
                + loc.getLatitude() + "\n Long = " + loc.getLongitude();


        //ActivityUsuario.setLatitud(loc.getLatitude()+"");
        //ActivityUsuario.setLongitud(loc.getLongitude()+"");
        Usuario.setLatitud(loc.getLatitude()+"");
        Usuario.setLongitud(loc.getLongitude()+"");
        //txtLat.setText(loc.getLatitude()+"");
       // txtLon.setText(loc.getLongitude()+"");
        //this.usuarioActivity.setLocation(loc);
    }

    @Override
    public void onProviderDisabled(String provider) {
        // Este metodo se ejecuta cuando el GPS es desactivado

    }

    @Override
    public void onProviderEnabled(String provider) {
        // Este metodo se ejecuta cuando el GPS es activado

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        switch (status) {
            case LocationProvider.AVAILABLE:
                Log.d("debug", "LocationProvider.AVAILABLE");
                break;
            case LocationProvider.OUT_OF_SERVICE:
                Log.d("debug", "LocationProvider.OUT_OF_SERVICE");
                break;
            case LocationProvider.TEMPORARILY_UNAVAILABLE:
                Log.d("debug", "LocationProvider.TEMPORARILY_UNAVAILABLE");
                break;
        }
    }
}
