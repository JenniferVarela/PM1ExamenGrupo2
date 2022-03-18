package com.example.pm1examengrupo2.Models;

public class Usuario
{
    public int id;
    public String nombre;
    public int telefono;
    public static String Latitud = "";
    public static String Longitud = "";
    public byte[] foto;

    public Usuario(int id, String nombre, int telefono, byte[] foto) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public static String getLatitud() {
        return Latitud;
    }

    public static void setLatitud(String latitud) {
        Latitud = latitud;
    }

    public static String getLongitud() {
        return Longitud;
    }

    public static void setLongitud(String longitud) {
        Longitud = longitud;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
