import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main (String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        
        Collections.sort(list);
        System.out.println(list);

        // for (int i= list.size() ;i >0 ; i--){
        //     System.out.print(list.get(i-1) + " ");
        // }
        // int max = Integer.MIN_VALUE;
        // for (int i = 0 ; i< list.size(); i++ ){
        //     // if(max<list.get(i)){
        //     //     max =list.get(i);
        //     // }
        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println(max);
    }
    
}
