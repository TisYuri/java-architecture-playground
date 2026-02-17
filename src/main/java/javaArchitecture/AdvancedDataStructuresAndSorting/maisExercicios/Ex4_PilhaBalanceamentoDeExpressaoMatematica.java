package javaArchitecture.AdvancedDataStructuresAndSorting.maisExercicios;

//4 - Verificação de Expressões:
//Utilizando pilhas, desenvolva um programa para verificar se uma expressão matemática contendo parênteses está balanceada.

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex4_PilhaBalanceamentoDeExpressaoMatematica {

    public static void main(String[] args) {
        String expressionOne = "(a + b) * (c - d)"; // Expressão balanceada
        String expressionTwo = "((a + b) * (c - d)"; // Expressão desbalanceada
        String expressionThree = ")(a + b)("; // Expressão desbalanceada
        String expressionFour = "a + b - c * d";
        String expressionFive = "a + c * ((a + a) - (b + b))";

        System.out.println("expressionOne: " + isExpressionBalanced(expressionOne) + "\n"
                + "expressionTwo: " + isExpressionBalanced(expressionTwo) + "\n"
                + "expressionThree: " + isExpressionBalanced(expressionThree) + "\n"
                + "expressionFour: " + isExpressionBalanced(expressionFour) + "\n"
                + "expressionFive: " + isExpressionBalanced(expressionFive) + "\n");
    }

    public static boolean isExpressionBalanced(String expression) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : expression.toCharArray()) {

            if (c == '(') {
                stack.push(c);
            }

            if (c == ')') {

                if (stack.isEmpty()) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
