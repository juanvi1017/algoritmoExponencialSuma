/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author juanvi
 */
import java.util.Scanner;
public class Algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int aux;
        int exponente;
        int resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero Base: ");
        numero = sc.nextInt();
        System.out.println("Ingrese el numero exponente: ");
        exponente = sc.nextInt();
        resultado=0;
        aux=numero;
        for ( int i=1; i< exponente; i ++){
            for ( int j=1; j<=numero; j ++){
               resultado=resultado+aux;
            }
            aux=resultado;
            resultado=0;       
        }
        System.out.println("El resultado es: " + aux);
    }
    
}
