package javaArchitecture.AdvancedDataStructuresAndSorting.maisExercicios;

//8 - Contagem de Palavras:
//Escreva um programa que conte a frequência das palavras em uma frase utilizando um HashMap.

import java.util.HashMap;
import java.util.Random;

public class Ex8_HashMap_WordFrequency {
    public static void main(String[] args){
        String phrase = "eu quero um cachorro quente pq eu amo muito um cachorro quente";

        HashMap<String, Integer> hashMap = new HashMap<>();

        String[] words = phrase.split(" ");

        for(String word : words){
            if(hashMap.containsKey(word)){
                hashMap.put(word, hashMap.get(word)+1);
            }else{
                hashMap.put(word, 1);
            }
        }

        System.out.println(hashMap);
    }
}
