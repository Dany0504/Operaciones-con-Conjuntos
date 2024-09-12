package org.example;
import java.util.HashSet;
import java.util.Set;

public class Main {


    public static Set<Integer> unir(Set<Integer> conjunto1, Set<Integer> conjunto2) {
        Set<Integer> resultado = new HashSet<>(conjunto1);
        resultado.addAll(conjunto2);
        return resultado;

    }

    public static Set<Integer> intersectar(Set<Integer> conjunto1, Set<Integer> conjunto2) {
        Set<Integer> resultado = new HashSet<>(conjunto1);
        resultado.retainAll(conjunto2);
        return resultado;
    }


    public static Set<Integer> diferenciar(Set<Integer> conjunto1, Set<Integer> conjunto2) {
        Set<Integer> resultado = new HashSet<>(conjunto1);
        resultado.removeAll(conjunto2);
        return resultado;
    }

    // Método para verificar si un conjunto es subconjunto de otro
    public static boolean esSubconjunto(Set<Integer> conjunto1, Set<Integer> conjunto2) {
        return conjunto1.containsAll(conjunto2); // Verificar si 'conjunto1' contiene todos los elementos de 'conjunto2'
    }



}
