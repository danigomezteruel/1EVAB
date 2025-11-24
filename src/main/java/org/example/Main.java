package org.example;


import java.util.Scanner;
/**
 * @author Dani
 *
 */
public class Main {
    /**
     * Este es el main. Muestra el menú al usuario y sirve para que se mueva por el programa.
     *
     * @param args
     */
    public static void main(String[] args) {

        CumpleRepo repo = new CumpleRepo();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            menu();

            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    case1(repo);
                    break;

                case "2":
                    case2(sc, repo);
                    break;

                case "3":
                    case3(repo, sc);
                    break;

                case "4":
                    case4(sc, repo);
                    break;

                case "5":
                    case5(repo, sc);
                    break;

                case "6":
                    salir = true;
                    break;
            }
        }
    }

    private static void case5(CumpleRepo repo, Scanner sc) {
        System.out.print(Constantes.ELIMINAR_NOMBRE);
        repo.eliminarPorNombre(sc.nextLine());
    }

    private static void case4(Scanner sc, CumpleRepo repo) {
        System.out.print(Constantes.NOMBRE);
        String nombre = sc.nextLine();
        System.out.print(Constantes.DIA);
        int d = Integer.parseInt(sc.nextLine());
        System.out.print(Constantes.MES);
        int m = Integer.parseInt(sc.nextLine());
        repo.addCumple(new CumpleAgenda(nombre, d, m));
    }

    private static void case3(CumpleRepo repo, Scanner sc) {
        System.out.print(Constantes.NOMBRE);
        CumpleAgenda c = repo.buscarPorNombre(sc.nextLine());
        if (c != null) System.out.println(c.getNombre());
    }

    private static void case2(Scanner sc, CumpleRepo repo) {
        System.out.print(Constantes.DIA);
        int dia = Integer.parseInt(sc.nextLine());
        for (CumpleAgenda c : repo.buscarPorDia(dia)) {
            System.out.println(c.getNombre());
        }
    }

    private static void case1(CumpleRepo repo) {
        for (CumpleAgenda c : repo.getLista()) {
            System.out.println(c.getNombre());
        }
    }

    private static void menu() {
        System.out.println(Constantes.AGENDA);
        System.out.println(Constantes.LISTAR);
        System.out.println(Constantes.POR_DIA);
        System.out.println(Constantes.POR_NOMBRE);
        System.out.println(Constantes.AÑADIR);
        System.out.println(Constantes.ELIMINAR);
        System.out.println(Constantes.SALIR);
    }
}
