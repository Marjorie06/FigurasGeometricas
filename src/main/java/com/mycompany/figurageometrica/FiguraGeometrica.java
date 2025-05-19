/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.figurageometrica;

import com.mycompany.figurageometrica.clases.Circulo;
import com.mycompany.figurageometrica.clases.Cuadrado;
import com.mycompany.figurageometrica.clases.Rectangulo;
import com.mycompany.figurageometrica.clases.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Marjorie
 */
public class FiguraGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---CALCULO DE AREAS Y PERIMETROS ---");
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectangulo");
            System.out.println("4. Triangulo Rectangulo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del circulo: ");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    System.out.println("Area: " + circulo.calcularArea());
                    System.out.println("Perimetro: " + circulo.calcularPerimetro());
                    break;

                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(lado);
                    System.out.println("Area: " + cuadrado.CalcularArea());
                    System.out.println("Perimetro: " + cuadrado.CalcularPerimetro());
                    break;

                case 3:
                    System.out.print("Ingrese la base del rectangulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectangulo: ");
                    double altura = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    System.out.println("Area: " + rectangulo.calcularArea());
                    System.out.println("Perimetro: " + rectangulo.calcularPerimetro());
                    break;

                case 4:
                    System.out.print("Ingrese la base del triangulo: ");
                    double baseT = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triangulo: ");
                    double alturaT = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(baseT, alturaT);
                    System.out.println("Area: " + triangulo.calcularArea());
                    System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
                    System.out.println("Perimetro: " + triangulo.calcularPerimetro());
                    System.out.println("Tipo de triangulo: " + triangulo.determinarTipoTriangulo());
                    break;

                case 5:
                    System.out.println("--Gracias por usar el programa--");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();

    }
}
