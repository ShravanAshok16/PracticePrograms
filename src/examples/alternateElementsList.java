package examples;
import java.util.*;
public class alternateElementsList {  

    public static void main(String[] args) {
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);    
        random.add(101f);
 
        iterateFwd(random);
    }
 
    public static void iterateFwd(List<Float> num) {
        ListIterator<Float> it = num.listIterator();
        while(it.hasNext()) {
            for(int i=1;i<num.size();i++){
                System.out.println(num.get(i));
                i++;
            }
            break;
        }
    }
 /*   public static void iterateFwd(List<Float> num) {
        ListIterator<Float> it = num.listIterator();
        while(it.hasNext()) {
            if(it.hasNext()){
                System.out.println(it.next());
            }
            it.next();
        }
    }
*/ 
 }

