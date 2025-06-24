package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Utiliza una pila (Stack) para invertir el orden de los caracteres de una cadena.
     * Apila cada carácter y luego desapila para formar la cadena invertida.
     */
    public String invertirCadena(String texto) {
        Stack<Character> pila = new Stack<>();
        for (char c : texto.toCharArray()) {
            pila.push(c);
        }

        StringBuilder resultado = new StringBuilder();
        while (!pila.isEmpty()) {
            resultado.append(pila.pop());
        }

        return resultado.toString();
    }

    /**
     * Usa una pila para verificar si los símbolos de apertura y cierre () {} []
     * están correctamente balanceados. Apila los símbolos de apertura y verifica
     * que cada cierre coincida con el tope de la pila.
     */
    public boolean validarSimbolos(String expresion) {
        Stack<Character> pila = new Stack<>();
        Map<Character, Character> mapa = Map.of(
            ')', '(', 
            ']', '[', 
            '}', '{'
        );

        for (char c : expresion.toCharArray()) {
            if (mapa.containsValue(c)) {
                pila.push(c);
            } else if (mapa.containsKey(c)) {
                if (pila.isEmpty() || !pila.pop().equals(mapa.get(c))) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    /**
     * Ordena una pila de enteros en orden ascendente usando solo otra pila auxiliar.
     * Inserta los elementos en la pila auxiliar en el lugar correcto, simulando
     * el ordenamiento de cartas en la mano.
     */
    public List<Integer> ordenarPila(Stack<Integer> pila) {
        Stack<Integer> auxiliar = new Stack<>();

        while (!pila.isEmpty()) {
            Integer temporal = pila.pop();

            while (!auxiliar.isEmpty() && auxiliar.peek() > temporal) {
                pila.push(auxiliar.pop());
            }

            auxiliar.push(temporal);
        }

        List<Integer> resultado = new ArrayList<>();
        while (!auxiliar.isEmpty()) {
            resultado.add(auxiliar.pop());
        }

        return resultado;
    }

    /**
     * Separa los números pares e impares de una lista, manteniendo el orden original.
     * Devuelve una lista con los pares primero y luego los impares.
     */
    public List<Integer> clasificarPorParidad(LinkedList<Integer> original) {
        LinkedList<Integer> pares = new LinkedList<>();
        LinkedList<Integer> impares = new LinkedList<>();

        for (Integer numero : original) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        List<Integer> resultado = new LinkedList<>();
        resultado.addAll(pares);
        resultado.addAll(impares);
        return resultado;
    }
}
