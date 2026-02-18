package javaArchitecture.AdvancedDataStructuresAndSorting.maisExercicios;

//9 - Mesclar Mapas:
//Implemente um método para mesclar dois HashMaps e manipular possíveis conflitos de chaves.

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ex9_HashMap_MergingTwoHashMaps {
    public static void main(String[] args){

        Random random = new Random();
        HashMap<String, Integer> mapOne = new HashMap<>();
        HashMap<String, Integer> mapTwo = new HashMap<>();

        mapOne.put("Caramelo", 2);
        mapTwo.put("Caramelo", random.nextInt(10));

        mapOne.put("Catarina", 2);
        mapTwo.put("Morpheus",random.nextInt(10));

        mapOne.put("Dog", 8);
        mapTwo.put("Cat", random.nextInt(10));

        System.out.println("map 1:      " + mapOne);
        System.out.println("map 2:      " + mapTwo);
        HashMap<String, Integer> mergedMaps = mergeMaps(mapOne, mapTwo);
        System.out.println("map merged: " + mergedMaps);

    }

    public static HashMap<String, Integer> mergeMaps(HashMap<String, Integer> map1, HashMap<String, Integer> map2){

        for(Map.Entry<String, Integer> map : map2.entrySet()){
            if(map1.containsKey(map.getKey())){
                map1.put(map.getKey(), map.getValue() + map1.get(map.getKey()));
            }
            else{
                map1.put(map.getKey(), map.getValue());
            }
        }
        return map1;
    }
}
