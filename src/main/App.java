package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {

        LogicaClasificacion ejercicios = new LogicaClasificacion();

        // Ejercicio 1
        Queue<String> cola = new LinkedList<>();
        cola.add("ana");
        cola.add("luis");
        cola.add("pedro");

        System.out.println(ejercicios.invertirColaNombres(cola));

        // Ejercicio 2
        Queue<String> cola2 = new LinkedList<>(Arrays.asList("c", "a", "s", "a"));
        Queue<String> cola3 = new LinkedList<>(Arrays.asList("r", "a", "d", "a", "r"));

        System.out.println(ejercicios.verificarPalindromoCola(cola2));
        System.out.println(ejercicios.verificarPalindromoCola(cola3));

    }
}
