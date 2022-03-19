package com.example.pm1examengrupo2.Models;

public class RestApiMethods {
    private static final String ipaddress = "transportweb2.online";
    public static final String StringHttp = "http://";
    //EndPoint Urls
    private static final String GetEmple = "/APIexam/listacontactos.php";
    private static final String GetBuscar = "/APIexam/listasinglecontacto.php?nombre=";
    private static final String CreateEmple = "/APIexam/crearcontacto.php";

    //metodo get
    public static final String EndPointGetContact = StringHttp + ipaddress + GetEmple;
    public static final String EndPointGetBuscarContact = StringHttp + ipaddress + GetBuscar;
    public static final String EndPointCreateUsuario = StringHttp + ipaddress + CreateEmple;
}


