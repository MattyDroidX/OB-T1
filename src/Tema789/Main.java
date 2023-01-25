package Tema789;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        String texto = "Hola mundo";

        System.out.println(texto);
        System.out.println(reverse(texto));

        String[] nombres = {"joseph", "Stela", "Mario", "Luis"};

        int[][] numeros = new int[3][3];

//        Generamos vector y valores


        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        //        Generamos arraylist y valores
        ArrayList<String> arreglo = new ArrayList<String>();
        arreglo.add("Bicicleta");
        arreglo.add("Coche");
        arreglo.add("Moto");
        arreglo.add("Tren");
        System.out.println("Verificamos valores del array nombres");
        System.out.println(Arrays.toString(nombres));
        System.out.println("***************************************************");
        System.out.println("Recorremos el array nombres");


        for (String nombre : nombres) {
            System.out.println(nombre);
        }


        System.out.println("***************************************************");
        System.out.println("Recorremos array bidimensional");

        for (int[] numero : numeros) {
            System.out.println(Arrays.toString(numero));
        }
        System.out.println("***************************************************");
        System.out.println("Verificamos valores del vector");
        System.out.println(vector);

        vector.removeElementAt(1);
        vector.removeElementAt(1);
        System.out.println("***************************************************");
        System.out.println("eliminamos el 2do y 3er elemento del vector");
        System.out.println(vector);
        System.out.println("***************************************************");


        System.out.println("pasamos valores de arreglo en nuevo linkedlist de lista");


        LinkedList<String> lista = new LinkedList<String>(arreglo);

        System.out.println(lista);
        System.out.println("***************************************************");


        System.out.println("recorremos valores lista y arreglo respectivamente");

        System.out.println("***************************************************");
        System.out.println("valores de arreglo");

        for (String value : arreglo) {
            System.out.println(value);
        }
        System.out.println("***************************************************");

        System.out.println("valores de lista");

        for (String s : lista) {
            System.out.println(s);
        }

        System.out.println("Creamos un arraylist llenando sus valores con un for");

        ArrayList<Integer>arregloDeEnteros = new ArrayList<Integer>();
        for (int i = 1; i < 11; i++) {
            arregloDeEnteros.add(i);
        }

        System.out.println(arregloDeEnteros);

        System.out.println("eliminamos los valores pares");
        for (int i = 0; i < arregloDeEnteros.size(); i++) {
            if(arregloDeEnteros.get(i) % 2 == 0){
                arregloDeEnteros.remove(i);
                i--;
            }
        }

        System.out.println("el valor final del arreglo de enteros es sin numeros pares es " + arregloDeEnteros);

        try {
            DividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }
        public static String reverse(String texto) {
            return new StringBuilder(texto).reverse().toString();
        }

//    El defecto mas grande de los vectores es que a mayor capacidad a su vez mayor es el procesamiento
//    por lo tanto el proceso se vuelve mas pesado

    public static void DividePorCero() throws ArithmeticException {
        int a = 1;
        int b = 0;
        int resultado = a / b;
    }

    public static void copyFile(String fileIn, String fileOut) {
        try (InputStream in = new FileInputStream(fileIn);
             OutputStream out = new FileOutputStream(fileOut)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
