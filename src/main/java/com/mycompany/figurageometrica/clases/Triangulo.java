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
public class Triangulo {
   
    public double base;
    public double altura;
    //Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

 
    public double calcularArea() {
        return (base * altura) / 2;
    }


    public double calcularPerimetro() {
        double hipotenusa = calcularHipotenusa();
        return base + altura + hipotenusa;
    }

    public double calcularHipotenusa() {
        return Math.hypot(base, altura);
    }

    public String determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        if (base == altura && altura == hipotenusa) {
            return "Equilátero";
        } else if (base == altura || base == hipotenusa || altura == hipotenusa) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
  public static void main(String[] args) {

        
       Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese la base del triángulo:");
        double baseIngr = scanner.nextDouble();

        System.out.println("Ingrese la altura del triángulo:");
        double alturaIngr = scanner.nextDouble();

       
        Triangulo triangulo = new Triangulo (baseIngr, alturaIngr);

    
        System.out.println("El área del triángulo es: " + triangulo.calcularArea());
        System.out.println("El perímetro del triángulo es: " + triangulo.calcularPerimetro());
        System.out.println("La hipotenusa del triángulo es: " + triangulo.calcularHipotenusa());
        System.out.println("El tipo de triángulo es: " + triangulo.determinarTipoTriangulo());
    }  
}

