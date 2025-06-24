package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());

        // NO MODIFICAR HASTA AQUÍ

        LogicaClasificacion logica = new LogicaClasificacion();

//------------------------------------ Probar invertirCadena

        String texto = "Hola Mundo";
        String invertido = logica.invertirCadena(texto);    
        System.out.println("\n invertirCadena(\"" + texto + "\"): " + invertido);
        System.out.println("\n---------------------------------------------------------------");


//------------------------------------- Probar validarSimbolos
        String expresion = "{[()]}";
        boolean balanceado = logica.validarSimbolos(expresion);
        System.out.println("\n validarSimbolos(\"" + expresion + "\"): " + balanceado);
        System.out.println("\n---------------------------------------------------------------");

//-------------------------------------- Probar ordenarPila
        Stack<Integer> pila = new Stack<>();
        pila.push(3);
        pila.push(1);
        pila.push(4);
        pila.push(2);
        System.out.println("\n ordenarPila([3, 1, 4, 2]): " + logica.ordenarPila(pila));
        System.out.println("\n---------------------------------------------------------------");


//-------------------------------------- Probar clasificarPorParidad
        LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("\n clasificarPorParidad([1, 2, 3, 4, 5, 6]): " + logica.clasificarPorParidad(original));
        System.out.println("\n----------------------------------------------------------------");

    }
}
