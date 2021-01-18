package com.company;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Cubo miCubo = new Cubo();
        pedirInformacion(miCubo);
        menu(miCubo);

    }

    public static void pedirInformacion(Cubo miCubo){
        String material, color;
        Boolean asa;
        int capacidad, capacidadMax;
        System.out.print("¿De que material es el cubo? ");
        miCubo.setMaterial(sc.next());
        System.out.print("¿De que color es el cubo? ");
        miCubo.setColor(sc.next());
        System.out.print("¿Lleva asa el cubo? ");
        miCubo.setAsa(sc.nextBoolean());
        System.out.print("¿Capacidad actual del cubo? ");
        miCubo.setCapacidad(sc.nextInt());
        System.out.print("¿Capacidad maxima del cubo? ");
        miCubo.setCapacidadMax(sc.nextInt());
    }

    private static void menu(Cubo miCubo) {
        int litros=0, opc;
        boolean salir=true;
        while (salir){
            System.out.println("[1].Añadir agua.");
            System.out.println("[2].Vacia cubo.");
            System.out.println("[3].Mostrar cubo.");
            System.out.println("[4].Salir.");
            System.out.print("¿Que opcion vas a elegir? ");
            opc = sc.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.print("¿Cuanta agua deseas añadir? ");
                    litros = sc.nextInt();
                    miCubo.llenarCubo(litros);
                }
                case 2 -> {
                    System.out.print("¿Cuanta agua deseas vaciar? ");
                    litros = sc.nextInt();
                    miCubo.vaciarCubo(litros);
                }
                case 3 -> miCubo.motrarCubo();
                case 4 -> salir=false;
                default -> throw new IllegalStateException("Opcion no valida: " + opc);
            }
        }
    }
}
