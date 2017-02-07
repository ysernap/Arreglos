package arreglos;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.println("Ingrese el tamaño");
        int tam = lec.nextInt();
        int[] vectorA=new int[tam];
        int[] vectorB=new int[tam];
        
        for(int i=0;i<tam;i++){
            System.out.println("Dato"+i+"A");
            vectorA[i]=lec.nextInt();
            System.out.println("Dato"+i+"B");
            vectorB[i]=lec.nextInt();
        }
    int[]resultado=suma_vectores(vectorA, vectorB);
    
    for(int i=0;i<tam;i++){
        System.out.println(resultado[i]);
    }
    }
    static int [] suma_vectores(int[]A, int[]B){
        int r[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            r[i]=A[i]+B[i];
        }
        return r;
    }
}
