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
     //Variables usadas para calcular promedios
     double promedio1 = 0;
     double promedio2 = 0;
     double promedio3 = 0;
     double promedio4 = 0;
     double promedio5 = 0;
     double promedio6 = 0;
     double suma1 = 0;
     double suma2 = 0;
     double suma3 = 0;
     double suma4 = 0;
     double suma5 = 0;
     double suma6 = 0;
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
         
         //En el primer semestre se ingresaran las notas para las asignaturas de Matematicas,lenguaje e Historia
        switch (semestre) {
        case 1:
                System.out.print("Ingrese la cantidad de notas para la asignatura de Matematicas: ");
                cantidad = captura.nextInt();
                
                System.out.println("use comas para separar decimales: ");
                for (int n = 1; n <= cantidad; n++) {
                    System.out.print("nota°" + n + ": ");
                    double numero = captura.nextDouble();
                    suma1 = (suma1 + numero);
                    promedio1 = (suma1 / cantidad);
                }
                System.out.println("EL promedio de las notas ingresadas para matemáticas es: " + promedio1);
                System.out.println();
                
                System.out.print("Ingrese la cantidad de notas para la asignatura de Lenguaje y comunicación: ");
                cantidad = captura.nextInt();
                
                System.out.println("use comas para separar decimales: ");
                for (int n = 1; n <= cantidad; n++) {
                    System.out.print("nota°" + n + ": ");
                    double numero = captura.nextDouble();
                    suma2 = (suma2 + numero);
                    promedio2 = (suma2 / cantidad);
                }
                System.out.println("EL promedio de las notas ingresadas para lenguaje y comunicación es: " + promedio2);
                System.out.println();
                
                System.out.print("Ingrese la cantidad de notas para la asignatura de Historia: ");
                cantidad = captura.nextInt();
                
                System.out.println("use comas para separar decimales: ");
                for (int n = 1; n <= cantidad; n++) {
                    System.out.print("nota°" + n + ": ");
                    double numero = captura.nextDouble();
                    suma3 = (suma3 + numero);
                    promedio3 = (suma3 / cantidad);
                }
                System.out.println("EL promedio de las notas ingresadas Historia es: " + promedio3);
                System.out.println();
                    
//En este punto se evaluara si el promedio de las tres asignaturas del primes semestre son superior a la nota solicitada,
//la cual es nota 5.de no ser asi se le indicara al alumno que esta reprobado por nota insufuciente.                    
                
                promediosemestre1= ((promedio1+promedio2+promedio3)/3);
                                
                if(promediosemestre1 <= 5){
                    System.out.println(("Estimado Alumno/a ")+Nombre+(" el promedio minimo para aprobar el semestre es de 5.0"));
                    System.out.println("Su promedio es de : "+promediosemestre1);
                    System.out.println("Lo sentimos no cumple el promedio mínimo para aprobar el 1° semestre");
                }else{
                    System.out.println(("Estimado Alumno ")+Nombre+(" el promedio minimo para aprobar el semestre es de 5.0"));
                    System.out.println("Su promedio es : "+promediosemestre1);
                    System.out.println("Usted cumple con con el requisito para aprobar el 1° semestre !Felicitaciones¡");
                }
        break;
        
    }
   }
 }
}
