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
public class Rectangulo {
    public double  base;
public double altura;


   //Constructor
public Rectangulo(double base,double altura){
    this.base = base;
    this.altura = altura;
    }


    public double calcularArea() {
        return base * altura;
    }
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
   public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in); 

        
        System.out.println("Ingrese la base del rectángulo:");
        double baseIngr = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectángulo:");
        double alturaIngr = scanner.nextDouble(); 

        
        Rectangulo rectangulo = new Rectangulo(baseIngr, alturaIngr);

       
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
        System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
    }
 
}
