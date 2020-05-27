/*
Un algoritmo que le permita:
1)Desplegar el nombre del proyecto de su paper
2)Qué es red neuronal.
3)Cuáles son los elementos que forman una red neuronal.
4)Cómo utilizaron una red neuronal en el proyecto que usted a seleccionado.
5)Cómo utilizaría usted la red neuronal como mejoramiento al proyecto propuesto.
6)En que consistió el entrenamiento utilizando una red neuronal, indique el algoritmo utilizado.
 */
package redneuronal1;

/**
 *
 * @author Gabriel Alexander Díaz Vera
 */
import java.util.Scanner;
public class RedNeuronal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner objeto=new Scanner (System.in);
    System.out.println("Desplegue el nombre del proyecto de su paper: ");
    System.out.println("Transferencia de Aprendizaje Mediante Redes Neuronales Convolucionales para el Reconocimiento de Conductores Distraídos");
    String nombrepaper=objeto.nextLine();

    System.out.println("Defina que es red neuronal: ");
    String red=objeto.nextLine();

    System.out.println("Ingrese cuales son los elementos que forman una red nueronal: ");
    String elementos=objeto.nextLine();

    System.out.println("Ingrese como utilizaron una red neuronal en el proyecto que usted a seleccionado. : ");
    String utilizaron=objeto.nextLine();

    System.out.println("Ingrese como utilizaría usted la red neuronal como mejoramiento al proyecto propuesto. : ");
    String mejoramiento=objeto.nextLine();

    System.out.println("Ingrese en que consistió el entrenamiento utilizando una red neuronal, indique el algoritmo utilizado. : ");
    String entrenamiento=objeto.nextLine();

    }

}
