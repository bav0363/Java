package Seminar_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Tsk2_room {
    public static void main(String[] args) {
        int size = 100;
        int range = 124;        
        System.out.println(Arrays.toString(zapolnenie(size, range)));
        System.out.println(result(zapolnenie(size, range)));

    }
    public static Integer[] zapolnenie(int size, int range){
        Random random = new Random();        

        Integer [] my_array = new Integer[size];        
        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = random.nextInt(range);            
        }        
        return my_array;
    }
    public static float result (Integer[] array){        
        Set<Integer> my_set = new HashSet<>(Arrays.asList(array));        
        float result = (float)my_set.size() * 100 / array.length;
        return result;
    }    
}
