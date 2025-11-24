package org.example;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Dani
 *
 */
public class CumpleRepo {
    /**
     * Esta clase utiliza los datos que ha puesto el usuario para comprobar si coinciden
     * con los valores de las listas.
     */
    private List<CumpleAgenda> lista = new ArrayList<>();

    public List<CumpleAgenda> getLista() {
        return lista;
    }

    public void addCumple(CumpleAgenda cumple) {
        lista.add(cumple);
    }

    public CumpleAgenda buscarPorNombre(String nombre) {
        for (CumpleAgenda c : lista) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public List<CumpleAgenda> buscarPorDia(int dia) {
        List<CumpleAgenda> resultado = new ArrayList<>();
        for (CumpleAgenda c : lista) {
            if (c.getDia() == dia) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public boolean eliminarPorNombre(String nombre) {
        CumpleAgenda encontrado = buscarPorNombre(nombre);
        if (encontrado != null) {
            lista.remove(encontrado);
            return true;
        }
        return false;
    }
}
