package com.methaporce.vista;

import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancia del gestor de películas
        GestorPelicula gestor = new GestorPelicula();

        // Crear instancias de películas y agregarlas al gestor
        gestor.agregarPelicula(new Pelicula(1, "Transformers", true));
        gestor.agregarPelicula(new Pelicula(2, "Spiderman", false));
        gestor.agregarPelicula(new Pelicula(3, "War", true));
        gestor.agregarPelicula(new Pelicula(4, "Zombies 2", false));

        //Trae todas las peliculas
        System.out.println("Todas las películas:");
        List<Pelicula> todasLasPeliculas = gestor.obtenerPeliculas();
        for (Pelicula pelicula : todasLasPeliculas) {
            System.out.println(pelicula);
        }
        
        // Eliminar una película 
        gestor.eliminarPelicula(4);

        // Marcar una película como disponible 
        gestor.marcarPeliculaComoDisponible(3);

        // Mostrar las películas disponibles
        System.out.println("\nPelículas disponibles:");
        List<Pelicula> peliculasDisponibles = gestor.obtenerPeliculasDisponible();
        for (Pelicula pelicula : peliculasDisponibles) {
            System.out.println(pelicula);
        }

        // Mostrar las películas no disponibles
        System.out.println("\nPelículas no disponibles:");
        List<Pelicula> peliculasNoDisponibles = gestor.obtenerPeliculasNoDisponibles();
        for (Pelicula pelicula : peliculasNoDisponibles) {
            System.out.println(pelicula);
        }
    }
}
