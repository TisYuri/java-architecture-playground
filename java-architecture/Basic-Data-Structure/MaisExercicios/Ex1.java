package MaisExercicios;

import java.util.Scanner;

public class Ex1 {
    //Exercício 1: Variáveis Primitivas
    //Crie um programa que declare variáveis para armazenar um número inteiro, um número de ponto flutuante e uma string. Atribua valores a essas variáveis e exiba-as na tela.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primitiveInteger = sc.nextInt();
        float primitiveFloat = sc.nextFloat();
        String ObjectString = sc.next();

        System.out.println(primitiveInteger + " " + primitiveFloat + " " + ObjectString);

        sc.close();
    }
}
