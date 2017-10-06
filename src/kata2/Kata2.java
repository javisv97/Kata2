package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
        
        int [] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        Map<Integer, Integer> histograma = new HashMap<>();
       
        for (int key : data) {
            histograma.put(key, histograma.containsKey(key) ? histograma.get(key) + 1 :1 );
        }
        for(int key: histograma.keySet()){
            System.out.println(key + " ==> " + histograma.get(key));
        }
    }
}
