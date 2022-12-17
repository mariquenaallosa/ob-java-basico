package com.ejercicio;

/**
 * Para este primer ejercicio tendréis que realizar lo siguiente:
 1- Crea un proyecto de Java desde 0
 2- Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
 3- Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
 * Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
 */
public class Tipo {
    public static void main(String[] args) {
        // 1- numéricos

        // 1.1- enteros
        byte variable1 = 4;
        short variable2 = 10;
        int variable3 = 30;
        long variable4 = 200;

        // 1.2- decimales
        float variable5 = 5.5f;
        double variable6 = 10.5d;

        // 2- booleanos
        boolean variable7 = true;
        boolean variable8 = false;

        // 3- texto
        char variable9 = 'a';
        String variable10 = "Esto es un texto";


        System.out.println("1-Numéricos");
        System.out.println("1.1-Enteros");

        System.out.println("byte = " + variable1);
        System.out.println("short = " + variable2);
        System.out.println("int = " + variable3);
        System.out.println("long = " +variable4);

        System.out.println("1.2-Decimales");

        System.out.println("float = " +variable5);
        System.out.println("double = " +variable6);

        System.out.println("2-Booleanos");

        System.out.println("boolean = " + variable7);
        System.out.println("boolean = " + variable8);

        System.out.println("3-Texto");

        System.out.println("char = " + variable9);
        System.out.println("String = " + variable10);
    }


}
