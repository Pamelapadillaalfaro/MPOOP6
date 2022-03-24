/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.unam.fi.mpoo;

import controlador.Sumadora;

/**
 *Clase principal
 * @author alumno
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Clase empaquetada");
        Sumadora  sumadora=new Sumadora();
        double suma=sumadora.sumar(3, 4);
        System.out.println(suma);
    }
}
