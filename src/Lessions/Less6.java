package Lessions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Less6 {
    public static void main(String[] args){
        Map<Integer,String> gr = new HashMap<>();
        gr.put(1, "Pavel");
        gr.put(2,"Ivan");
        gr.put(3,"Alex");
        gr.put(4,"Nino");
        gr.put(5,"Adrain");
        gr.put(6,"Jony");
        gr.put(7,"Paul");
        gr.put(8,"Roma");
        gr.put(9,"Mishan");
        gr.put(10,"Max");
        Map<Integer,String> bigKeys = new HashMap<>();
        int mn = 1;
        for (int key: gr.keySet()){
            if(key>5){
                bigKeys.put(key, gr.get(key));
            }
            if(gr.get(key).length()>5){
                mn*=key;
            }
        }
        System.out.println("Произведение ключей,где строка больше 5 "+mn);
        System.out.println("Все объекты где ключи больше 5 "+ bigKeys.toString());
    }
}
