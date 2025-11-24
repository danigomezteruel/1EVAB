package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CumpleRepo repo = new CumpleRepo();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== AGENDA ===");
            System.out.println("1. Listar");
            System.out.println("2. Buscar por día");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Añadir");
            System.out.println("5. Eliminar");
            System.out.println("6. Salir");

            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    for (CumpleAgenda c : repo.getLista()) {
                        System.out.println(c.getNombre());
                    }
                    break;

                case "2":
                    System.out.print("Día: ");
                    int dia = Integer.parseInt(sc.nextLine());
                    for (CumpleAgenda c : repo.buscarPorDia(dia)) {
                        System.out.println(c.getNombre());
                    }
                    break;

                case "3":
                    System.out.print("Nombre: ");
                    CumpleAgenda c = repo.buscarPorNombre(sc.nextLine());
                    if (c != null) System.out.println(c.getNombre());
                    break;

                case "4":
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Día: ");
                    int d = Integer.parseInt(sc.nextLine());
                    System.out.print("Mes: ");
                    int m = Integer.parseInt(sc.nextLine());
                    repo.addCumple(new CumpleAgenda(nombre, d, m));
                    break;

                case "5":
                    System.out.print("Eliminar nombre: ");
                    repo.eliminarPorNombre(sc.nextLine());
                    break;

                case "6":
                    salir = true;
                    break;
            }
        }
    }
}
