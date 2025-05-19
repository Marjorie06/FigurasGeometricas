/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurageometrica.clases;

import java.util.Scanner;

/**
 *
 * @author Marjrorie
 */
public class Cuadrado {
        public double lado;
    
    //Constructor
    public Cuadrado(double lado ){
      this.lado=lado;
    
      }
   public double CalcularArea(){
       return lado*lado;
       
   } 
   public double CalcularPerimetro (){
       return 4*lado;
   }
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

     
        System.out.println("Ingrese el valor del lado del cuadrado:");
        double ladoIngresado = scanner.nextDouble();

       
        Cuadrado cuadrado = new Cuadrado(ladoIngresado);

        
        System.out.println("El área del cuadrado es: " + cuadrado.CalcularArea());
        System.out.println("El perímetro del cuadrado es: " + cuadrado.CalcularPerimetro());
  }
}
