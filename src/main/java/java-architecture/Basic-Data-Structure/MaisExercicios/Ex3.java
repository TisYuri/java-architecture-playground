package MaisExercicios;

public class Ex3 {

    //Exercício 3: Laços (for/while)
    //Crie um programa que imprima os números de 1 a 10 usando um loop.

    public static void main(String[] args){
        int i;
        for(i = 1; i<11; i++){
            System.out.println(i);
        }
        System.out.println("Now with while");
        i = 0;
        while(i <10){
            i++;
            System.out.println(i);
        }
    }
}
