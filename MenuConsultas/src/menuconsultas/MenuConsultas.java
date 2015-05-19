/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuconsultas;

import java.util.Scanner;

/**
 *
 * @author Lorena Curitol
 *         Leonardo Figueroa
 *         Claudio Vargas
 *         Riobans Urra
 */
public class MenuConsultas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura =new Scanner(System.in);  

     //Variables de ingreso al sistema
     String Nombre; 
     int opcion ;
     int Alumno= 1;
     int semestre;
     int cantidad;
     
     //Variables usadas para calcular promedios
     double promedio1 = 0;
     double suma1 = 0;
     double promediosemestre1;
     double promediosemestre2;
     
    //Inicio del programa
     System.out.println("----Bienvenido a Intranet-------");
     System.out.print("Ingrese Nombre : ");
     Nombre=captura.nextLine();
    
    //se valida si es alumno o profesor
     System.out.println("Ingrese si es alumno o profesor : ");
     System.out.println("1._Alumno/a");
     System.out.println("2._Profesor/a");
     System.out.print  ("Digite la opción: ");
     opcion=captura.nextInt();
     
     
    //si es alumno     
      if(opcion==Alumno){
         System.out.println();
         System.out.println("---Bienvenido Alumno/a "+Nombre+"--");
         System.out.println();
         System.out.println("Ésta opción permite calcular el promedio de notas ");
         System.out.println("según el semestre indicado");
         System.out.println();
         System.out.println("Presione 1, Para el primer semestre [Matematicas,lenguaje e Historia.]");
         System.out.println("Presione 2, Para el segundo semestre[ciencias naturales, biologia y quimica.]");
         System.out.print  ("Seleccione el Semestre: ");
         semestre = captura.nextInt();
        
    }
   }
}
