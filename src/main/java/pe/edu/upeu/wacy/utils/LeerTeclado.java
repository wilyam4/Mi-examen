package pe.edu.upeu.sys.utils;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

public class LeerTeclado {

    BufferedReader leerT=new BufferedReader(new InputStreamReader(System.in));

    public int leer(int dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=Integer.parseInt(leerT.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }

    public String leer(String mensaje01, String mensaje02){
        try {
            System.out.println(mensaje02);
            mensaje01=leerT.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return mensaje01;
    }
}