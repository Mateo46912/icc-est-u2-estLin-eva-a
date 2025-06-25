package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {

        Stack<String> pila = new Stack<>();
        while(!cola.isEmpty()){
            pila.push(cola.remove());
        }

        Queue<String> colaInversa = new LinkedList<>();

        while(!pila.isEmpty()){
            colaInversa.add(pila.pop());
        }

        return colaInversa; 
    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {
        LinkedList<String> respaldo =new LinkedList<>(cola);
        int i=0;
        int j= respaldo.size()-1;
        while(i<j){
            if(!respaldo.get(i).equals(respaldo.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
