package com.example;

import java.util.Scanner;

public class Main {
    public static void holamundo (){
        System.out.println("Mi primer hola mundo en java");
        System.out.println("Hola mundo");
    }

    public static void suma(){
        System.out.println("Ingrese el primer numero");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int n2 = sc.nextInt();
        int result = n1 + n2;
        System.out.println("La suma de los dos numeros que ingresaste es: " + result);
    }

    public static void parImpar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int n1 = sc.nextInt();
        if(n1%2==0){
            System.out.println("El numero que ingresaste es par");
        }{
            System.out.println("El numero que ingresaste es impar");
        }
    }

    public static void factorial (int number) {
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        System.out.println("El factorial de " + number + " es " + result);
    }

    public static void tablaMultiplicar(int number) {
        System.out.println("Tabla de multiplicar del " + number + " (Ascendente):");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        System.out.println("Tabla de multiplicar del " + number + " (Descendente):");
        for (int i = 10; i >= 1; i--) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void encontrarMinMax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una serie de números (ingrese un número negativo para terminar):");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("No se ingresaron números válidos.");
            return;
        }

        int max = number;
        int min = number;

        while (number >= 0) {
            number = sc.nextInt();
            if (number >= 0) {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
        }

        System.out.println("El número más grande es: " + max);
        System.out.println("El número más pequeño es: " + min);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu de ejercicios");
            System.out.println("1. Hola mundo");
            System.out.println("2. Suma");
            System.out.println("3. Par o Impar");
            System.out.println("4. Factorial");
            System.out.println("5. Tabla Multiplicar");
            System.out.println("6. Salir");
            System.out.println("Bonus! Escribe 7 para acceder a esta misteriosa funcion...");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    holamundo();
                    break;
                case 2:
                    suma();
                    break;
                case 3:
                    parImpar();
                    break;
                case 4:
                    System.out.println("Ingrese el numero para calcular su factorial");
                    int factorial = sc.nextInt();
                    factorial(factorial);
                    break;
                case 5:
                    System.out.println("Introduce un número para ver su tabla de multiplicar:");
                    int num = sc.nextInt();
                    tablaMultiplicar(num);
                case 6:
                    System.out.println("Salir");
                    break;
                case 7:
                    encontrarMinMax();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 6);


    }//end main
}