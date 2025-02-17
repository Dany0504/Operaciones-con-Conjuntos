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


    public static boolean esSubconjunto(Set<Integer> conjunto1, Set<Integer> conjunto2) {
        return conjunto1.containsAll(conjunto2); // Verificar si 'conjunto1' contiene todos los elementos de 'conjunto2'
    }


    public static Set<Pareja<Integer, Integer>> cartesiano(Set<Integer> conjunto1, Set<Integer> conjunto2) {
        Set<Pareja<Integer, Integer>> resultado = new HashSet<>();
        for (Integer elemento1 : conjunto1) {
            for (Integer elemento2 : conjunto2) {
                resultado.add(new Pareja<>(elemento1, elemento2));
            }
        }
        return resultado;
    }


    public static class Pareja<T, U> {
        private final T primero;
        private final U segundo;

        public Pareja(T primero, U segundo) {
            this.primero = primero;
            this.segundo = segundo;
        }

        public T getPrimero() {
            return primero;
        }

        public U getSegundo() {
            return segundo;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pareja<?, ?> pareja = (Pareja<?, ?>) o;
            return primero.equals(pareja.primero) && segundo.equals(pareja.segundo);
        }

        @Override
        public int hashCode() {
            return 31 * primero.hashCode() + segundo.hashCode();
        }

        @Override
        public String toString() {
            return "(" + primero + ", " + segundo + ")";
        }
    }


    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        // Añadir algunos números de prueba a los conjuntos
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        conjunto2.add(2);
        conjunto2.add(3);
        conjunto2.add(4);

        // Mostrar los resultados de las operaciones
        System.out.println("Unión: " + unir(conjunto1, conjunto2));
        System.out.println("Intersección: " + intersectar(conjunto1, conjunto2));
        System.out.println("Diferencia: " + diferenciar(conjunto1, conjunto2));
        System.out.println("Es subconjunto: " + esSubconjunto(conjunto1, conjunto2));
        System.out.println("Cartesiano: " + cartesiano(conjunto1, conjunto2));
    }


}
