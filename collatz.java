import java.util.*;

public class Program
{
    public static void main(String[] args) {
       for(int i = 2; i <  1000000; i++)
          Collatz.getLength(i);
    }
}


public class Collatz {
    public static Map<Integer,Integer> known = new HashMap<Integer, Integer>(); 
    
    static {
        known.put(new Integer(1), new Integer(1));
    }
    
    public static int getLength(int num) {
        if(known.containsKey(num)) {
            return known.get(num).intValue();
        }
        int len;
        if(num%2 == 0) {
            len = getLength(num/2);
        } else {
            len = getLength(num*3+1);
        }
        known.put(new Integer(num), new Integer(len+1));
        return len+1;
    }
}
