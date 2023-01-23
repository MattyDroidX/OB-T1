package com.example;

public class Tema2Main {
    public static void main(String[] args) {
        double precio = 25.1;
        double precioFinal = CalculoDeIva(precio);
        double precioFinal1 = CalculoDeIva(31.4);
        System.out.println(precioFinal);
        System.out.println(precioFinal1);
    }

    private static double CalculoDeIva(double precio){
        double ValorIva =  precio*0.21;
        return precio - ValorIva;
    }
}
