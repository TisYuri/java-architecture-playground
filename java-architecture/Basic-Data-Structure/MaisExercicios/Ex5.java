package MaisExercicios;

public class Ex5 {

    //Exercício 5: Matrizes (Arrays)
    //Crie uma matriz (array) de números inteiros. Encontre e imprima o maior valor na matriz.

    public static void main(String[] args){
        int[][] matrix = {
                {4,2,8},
                {6,98,123},
                {-45,-200,80}
        };

        int biggestNumber = matrix[0][0];
        int i, j;
        for(i = 0; i < matrix.length; i++){
            for(j = 0; j<matrix[i].length; j++){
                biggestNumber = (biggestNumber < matrix[i][j])
                        ? matrix[i][j]
                        : biggestNumber;
            }
        }
        System.out.println("O maior numero é " + biggestNumber);
    }
}
