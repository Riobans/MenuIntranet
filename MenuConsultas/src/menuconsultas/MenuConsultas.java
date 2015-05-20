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
        
// Elabore un programa en java que permita a los alumnos de una escuela municipal
// calcular los promedios con sus notas, el programa debe capturar una cantidad
// de notas definida por cada asignatura y calcular los promedios uno a la vez.
// Al final de cada semestre se debe promediar los resultados obtenidos de cada asignatura 
// para dar un promedio semestral y avisar al alumno si aprobo o no el semestre.    
        
     Scanner captura =new Scanner(System.in);  

     
     String Nombre; 
     int opcion ;
     int Alumno= 1;
     int semestre;
     int cantidad;
     
     
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
     System.out.println("----Bienvenido a Intranet Alumno-------");
     System.out.print("Ingrese su nombre : ");
     Nombre=captura.nextLine();
    
//se valida si es o no alumno
     System.out.println("¿Es usted alumno/a? : ");
     System.out.println("1._Sí");
     System.out.println("2._No");
     System.out.print  ("Digite la opción: ");
     opcion=captura.nextInt();
     
     
//si es alumno (Estructura de decición doble)     
      if(opcion==Alumno){
         System.out.println();
         System.out.println("---Bienvenido Alumno/a "+Nombre+"--");
         System.out.println();
         System.out.println("Ésta opción permite calcular el promedio de notas ");
         System.out.println("según el semestre indicado");
         System.out.println();
         System.out.println("Presione 1, Para el primer semestre [Matemáticas,Lenguaje y Comunicación e Historia.]");
         System.out.println("Presione 2, Para el segundo semestre[Ciencias Naturales, Biologia y Química.]");
         System.out.print  ("Seleccione el Semestre: ");
         semestre = captura.nextInt();
         
//En el primer semestre se ingresaran las notas para las asignaturas de Matematicas,lenguaje e Historia
//Estructura CASE
        switch (semestre) {
        case 1:
                System.out.print("Ingrese la cantidad de notas para la asignatura de Matemáticas: ");
                cantidad = captura.nextInt();
//Estructuras FOR
                System.out.println("use comas para separar decimales: ");
                for (int n = 1; n <= cantidad; n++) {
                    System.out.print("nota°" + n + ": ");
                    double numero = captura.nextDouble();
                    suma1 = (suma1 + numero);
                    promedio1 = (suma1 / cantidad);
                }
                System.out.println("El promedio de las notas ingresadas para Matemáticas es: " + promedio1);
                System.out.println();
                
                System.out.print("Ingrese la cantidad de notas para la asignatura de Lenguaje y Comunicación: ");
                cantidad = captura.nextInt();
                
                System.out.println("use comas para separar decimales: ");
                for (int n = 1; n <= cantidad; n++) {
                    System.out.print("nota°" + n + ": ");
                    double numero = captura.nextDouble();
                    suma2 = (suma2 + numero);
                    promedio2 = (suma2 / cantidad);
                }
                System.out.println("El promedio de las notas ingresadas para Lenguaje y Comunicación es: " + promedio2);
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
                System.out.println("El promedio de las notas ingresadas Historia es: " + promedio3);
                System.out.println();
                    
//En este punto se evaluara si el promedio de las tres asignaturas del primer semestre son superiores a la nota solicitada,
//la cual es nota 5,0. De no ser asi, se le indicará al alumno que esta reprobado por nota insufuciente.                    
                
                promediosemestre1= ((promedio1+promedio2+promedio3)/3);
                                
                if(promediosemestre1 <= 5){
                    System.out.println(("Estimado Alumno/a ")+Nombre+(" el promedio mínimo para aprobar el semestre es de 5.0"));
                    System.out.println("Su promedio es de : "+promediosemestre1);
                    System.out.println("Lo sentimos no cumple el promedio mínimo para aprobar el 1° semestre");
                }else{
                    System.out.println(("Estimado Alumno ")+Nombre+(" el promedio mínimo para aprobar el semestre es de 5.0"));
                    System.out.println("Su promedio es : "+promediosemestre1);
                    System.out.println("Usted cumple con con el requisito para aprobar el 1° semestre !Felicitaciones¡");
                }
        break;           
// En el segundo semestre se ingresaran las notas  para las asignaturas de Ciencias Naturales, Biología y Química.
        case 2:
                System.out.print("Ingrese la cantidad de notas para la asignatura de  Ciencias Naturales: ");
                cantidad = captura.nextInt();
                
                System.out.println("use comas para separar decimales: ");
                for (int n = 1; n <= cantidad; n++) {
                    System.out.print("nota°" + n + ": ");
                    double numero = captura.nextDouble();
                    suma4 = (suma4 + numero);
                    promedio4 = (suma4 / cantidad);
                }
                System.out.println("El promedio de las notas ingresadas para Ciencias Naturales es: " + promedio4);
                System.out.println();
                
                System.out.print("Ingrese la cantidad de notas para la asignatura de Biología: ");
                cantidad = captura.nextInt();
                
                System.out.println("use comas para separar decimales: ");
                for (int n = 1; n <= cantidad; n++) {
                    System.out.print("nota°" + n + ": ");
                    double numero = captura.nextDouble();
                    suma5 = (suma5 + numero);
                    promedio5 = (suma5 / cantidad);
                }
                System.out.println("El promedio de las notas ingresadas para Biología es: " + promedio5);
                System.out.println();
                
                System.out.print("Ingrese la cantidad de notas para la asignatura de Química: ");
                cantidad = captura.nextInt();
                
                System.out.println("use comas para separar decimales: ");
                for (int n = 1; n <= cantidad; n++) {
                    System.out.print("nota°" + n + ": ");
                    double numero = captura.nextDouble();
                    suma6 = (suma6 + numero);
                    promedio6 = (suma6 / cantidad);
                }
                System.out.println("El promedio de las notas ingresadas Química es: " + promedio6);
                System.out.println();
                    
//En este punto se evaluara si el promedio de las tres asignaturas del segundo semestre son superiores a la nota solicitada,
//la cual es nota 5,0. De no ser asi, se le indicara al alumno que esta reprobado por nota insufuciente.                    
                
                promediosemestre2= ((promedio4+promedio5+promedio6)/3);
                                
                if(promediosemestre2 <= 5){
                    System.out.println(("Estimado Alumno ")+Alumno+(" el promedio minimo para aprobar el semestre es de 5.0"));
                    System.out.println("Su promedio es de : "+promediosemestre2);
                    System.out.println("Lo sentimos no cumple el promedio mínimo para aprobar el 2° semestre");
                }else{
                    System.out.println(("Estimado Alumno ")+Alumno+(" el promedio minimo para aprobar el semestre es de 5.0"));
                    System.out.println("Su promedio es : "+promediosemestre2);
                    System.out.println("Usted cumple con con el requisito para aprobar el 2° semestre !Felicitaciones¡");
                 break;
                }  
             }
//si no es alumno, no permite el acceso al programa        
                     }if(opcion==2){
                      System.out.println("Lo sentimos, no se permite el acceso a ex alumnos");
                    }
   }
 }

