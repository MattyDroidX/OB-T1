package com.example;

public class Tema3Main {
    public static void main(String[] args) {
        String[] nombres = {"Anthony", "Dante", "Pepe", "Juan"};
        StringBuilder NombreConcatenado = new StringBuilder();
        for (String nombre : nombres) {
            NombreConcatenado.append(nombre.concat(" "));
        }
        System.out.println(NombreConcatenado);

    }
}
