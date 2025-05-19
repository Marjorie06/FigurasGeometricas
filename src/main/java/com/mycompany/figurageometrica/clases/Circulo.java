/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurageometrica.clases;

import java.util.Scanner;

/**
 *
 * @author Marjorie
 */
public class Circulo {

    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    

    public static void main(String[] args) {

        Scanner radio = new Scanner(System.in);

        System.out.println("Ingrese el valor del radio del círculo:");
        double radioIngresado = radio.nextDouble();

        Circulo circulo = new Circulo(radioIngresado);

        System.out.println("El área del círculo es: " + circulo.calcularArea());
        System.out.println("El perímetro del círculo es:" + circulo.calcularPerimetro());

    }

}
