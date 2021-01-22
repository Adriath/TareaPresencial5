/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import utilidades.Color;
import utilidades.IO_ES;

/**
 * Clase que alberga el método main para mostrar las acciones de los métodos de la 
 * clase IO_ES.
 * 
 * @author Adrián Arjona
 * @version 1.0
 */
public class Prueba_IOES_ABFA {

    /**
     * Método main. Este método principal sirve para mostrar las acciones de los 
     * métodos de la clase IO_ES.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // NOTAS:
        
        /* Voy a meter lo métodos en un "System.out.println()" para
            que los resultados sean visibles desde la consola.
        */
        
        // EJERCICIO
        
        System.out.println(Color.azul("------ ¡Bienvenida a la tarea presencial 5! -----------" + "\n"));
        System.out.println(Color.verde("A continuación vamos a mostrar "
                + "el funcionamiento de los distintos métodos de la clase IO_ES."));
        System.out.println("\n" + Color.azul("---------------------------------------------------")+ "\n");
        
        System.out.println(Color.azul("// leerInteger //"));
        
        System.out.println(Color.verde("Empezamos con el método leerInteger()."));
        System.out.println(IO_ES.leerInteger());
        
        System.out.println(Color.verde("Ahora leerInteger(String msg)."));
        System.out.println(IO_ES.leerInteger("Introduce un entero: "));
        
        System.out.println(Color.verde("leerInteger(String msg, int min). El valor mínimo será 4."));
        System.out.println(IO_ES.leerInteger("Introduce un entero: ", 4));
        
        System.out.println(Color.verde("leerInteger(String msg, int min, int max) El valor mínimo será 4 y el máximo 8."));
        System.out.println(IO_ES.leerInteger("Introduce un entero: ", 4, 8));
        
        System.out.println(Color.azul("// leerEnteroLargo //"));
        
        System.out.println(Color.verde("leerIntegerLargo()."));
        System.out.println(IO_ES.leerIntegerLargo());
        
        System.out.println(Color.verde("leerIntegerLargo(String msg)"));
        System.out.println(IO_ES.leerIntegerLargo("Introduce un entero largo: "));
        
        System.out.println(Color.azul("// leerReal //"));
        
        System.out.println(Color.verde("leerReal()"));
        System.out.println(IO_ES.leerReal());
        
        System.out.println(Color.verde("leerReal(String msg)"));
        System.out.println(IO_ES.leerReal("Introduce un número real: "));
        
        System.out.println(Color.verde("leerReal(String msg, int min). El mínimo será 5"));
        System.out.println(IO_ES.leerReal("Introduce un número real: ", 5));
        
        System.out.println(Color.azul("// leerRealLargo //"));
        
        System.out.println(Color.verde("leerRealLargo()"));
        System.out.println(IO_ES.leerRealLargo());
        
        System.out.println(Color.verde("leerRealLargo(String msg)"));
        System.out.println(IO_ES.leerRealLargo("Introduce un número real largo: "));
        
        System.out.println(Color.azul("// leerCadena //"));
        
        System.out.println(Color.verde("leerCadena()"));
        System.out.println(IO_ES.leerCadena());
        
        System.out.println(Color.verde("leerCadena(String msg)"));
        System.out.println(IO_ES.leerCadena("Introduce un texto: "));
        
        System.out.println(Color.verde("leerCadena(String msg, int longitud). La longitud será de 6 caracteres."));
        System.out.println(IO_ES.leerCadena("Introduce un texto: ", 6));
        
        System.out.println(Color.azul("// leerCaracter //"));
        
        System.out.println(Color.verde("leerCaracter()"));
        System.out.println(IO_ES.leerCaracter());
        
        System.out.println(Color.verde("leerCaracter(String msg)"));
        System.out.println(IO_ES.leerCaracter("Introduce un caracter: "));
        
        System.out.println(Color.azul("// leerBooleano //"));
        
        System.out.println(Color.verde("leerBooleano()"));
        System.out.println(IO_ES.leerBooleano());
        
        System.out.println(Color.verde("leerBooleano(String msg)"));
        boolean resultado = IO_ES.leerBooleano("¿Quieres que borre todos los datos de tu ordenador sin opción a recuperación ahora mismo?");
        
        if (resultado == true) 
        {
            System.out.println(Color.rojo("Bip... bip... tus datos están borrándose "
                    + "sin remedio."));
            
            do {
                
                resultado = IO_ES.leerBooleano("¿Desea enviar un aprobado a Adrián para revertir el proceso?") ;
                
                if (!resultado) {
                    
                    System.out.println(Color.rojo("Creo que no estás en condiciones de negociar ψ(｀∇´)ψ"));
                }
                
            } while (!resultado);
            
            System.out.println("¡Bien, tus datos se han salvado mágicamente! Continuemos.");
            
        }
        else
        {
            System.out.println("Veo que no te gusta correr riesgos...");
        }
        
        System.out.println(Color.azul("// escribir //"));
        
        System.out.println(Color.verde("escribir(String msg. Vamos a añadir texto sin salto de línea."));
        IO_ES.escribir("Ya queda poco, estamos en la recta final.");
        IO_ES.escribir(" Este texto va a salir a continuación del otro porque no hay salto de línea.");
        
        
        System.out.println(Color.verde("escribirLN(String msg). Vamos a añadir texto con salto de línea."));
        IO_ES.escribirLN("A continuación de este texto se dará un salto de línea.");
        IO_ES.escribirLN("Y con esto hemos terminado.");
        
        System.out.println(Color.azul("----------- FIN DEL EJERCICIO ------------- "));
        
    }
    
}
