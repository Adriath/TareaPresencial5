/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 * Esta clase recoge los códigos de los colores para utilizarlos cómodamente en
 * otras clases.
 * 
 * @author Adrián Arjona
 * @version 1.0
 */
public class Color {
    
    private static final String BLACK="\033[30m"; 
    private static final String RED="\033[31m"; 
    private static final String GREEN="\033[32m"; 
    private static final String YELLOW="\033[33m"; 
    private static final String BLUE="\033[34m"; 
    private static final String PURPLE="\033[35m"; 
    private static final String CYAN="\033[36m"; 
    private static final String WHITE="\033[37m";
    private static final String RESET="\u001B[0m";
    
    
    // MÉTODOS
    
    /**
     * Colorea el texto en color negro.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String negro(String msg){
        
        String mensajeUsuario = BLACK + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color rojo.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    public static String rojo(String msg){
        
        String mensajeUsuario = RED + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color verde.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    public static String verde(String msg){
        
        String mensajeUsuario = GREEN + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color amarillo.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    public static String amarillo(String msg){
        
        String mensajeUsuario = YELLOW + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color azul.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    public static String azul(String msg){
        
        String mensajeUsuario = BLUE + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color púrpura.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    public static String purple(String msg){
        
        String mensajeUsuario = PURPLE + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color cyan.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    public static String cyan(String msg){
        
        String mensajeUsuario = CYAN + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color blanco.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    public static String blanco(String msg){
        
        String mensajeUsuario = WHITE + msg + RESET ;
        
        return mensajeUsuario;
    }
    
}
