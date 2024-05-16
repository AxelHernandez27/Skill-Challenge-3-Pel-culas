package com.methaporce.modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorPelicula {

    private List<Pelicula> listaPeliculas;

    // Constructor
    public GestorPelicula() {
        listaPeliculas = new ArrayList<>();
    }

    // metodo para agregar pelicula
    public void agregarPelicula(Pelicula pelicula) {
        listaPeliculas.add(pelicula);
    }

    // metodo para eliminar pelicula
    public void eliminarPelicula(int id) {
        listaPeliculas.removeIf(pelicula -> pelicula.getId() == id);
    }

    // metodo para obtener pelicula
    public List<Pelicula> obtenerPeliculas() {
        return listaPeliculas;
    }

    // metodo para obtener pelicula disponible
    public List<Pelicula> obtenerPeliculasDisponible() {
        List<Pelicula> disponibles = new ArrayList<>();
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.isDisponible()) {
                disponibles.add(pelicula);
            }
        }
        return disponibles;
    }

    // metodo para obtener pelicula nos disponible
    public List<Pelicula> obtenerPeliculasNoDisponibles() {
        List<Pelicula> noDisponibles = new ArrayList<>();
        for (Pelicula pelicula : listaPeliculas) {
            if (!pelicula.isDisponible()) {
                noDisponibles.add(pelicula);
            }
        }
        return noDisponibles;
    }

    // metodo para marcar como disponible por id
    public void marcarPeliculaComoDisponible(int id) {
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getId() == id) {
                pelicula.setDisponible(true);
                return;
            }
        }
        System.out.println("No se encontró ninguna película con el ID especificado.");
    }

}