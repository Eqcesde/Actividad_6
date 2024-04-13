package com.example;

public class Main {
    public static void main(String[] args) {
        String nombre = "Anderson Quiroz";
        int salarioBase = 1300000;
        int horasTrabajo = 240;
        int horasExtras = 12;
        double auxilioTransporte = 180000;
        // Cálculo de la nómina
        double salarioDevengado = calcularSalarioDevengado(salarioBase, horasTrabajo, horasExtras);
        double deducciones = calcularDeducciones(salarioDevengado, auxilioTransporte);
        double salarioNeto = salarioDevengado - deducciones;

        // Impresión de la nómina
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Auxilio transporte: $" + auxilioTransporte);
        System.out.println("Salario devengado: $" + salarioDevengado);
        System.out.println("Deducciones: $" + deducciones);
        System.out.println("Salario neto: $" + salarioNeto);
    }
     // Método para calcular el salario devengado
     public static double calcularSalarioDevengado(int salarioBase, int horasTrabajo, int horasExtras) {
        // Implementar solución
        // 1 paso calculamos las horas de trabajo imaginando que trabajamos 8 horas por día
        double horaTrabajo =  salarioBase / (8 * 30);
        // 2 paso calculamos la hora extra
        double horaExtra = horaTrabajo * 1.5;
        // 3 paso calculñamos el salario devengado
        double salarioDevengado = salarioBase + (horaTrabajo * horasTrabajo) + (horaExtra * horasExtras);
          return salarioDevengado;
      }
  
      // Método para calcular las deducciones
      public static double calcularDeducciones(double salarioDevengado, double auxilioTransporte) {
          // Implementar solución
        double deducciones = auxilioTransporte;
          return deducciones;   
      } 
    }
