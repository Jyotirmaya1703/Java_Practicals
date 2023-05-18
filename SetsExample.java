import java.util.*;

public class SetsExample {

    public static void main(String[] args) {
        
        // Creating a HashSet object named set1
        Set<Integer> set1 = new HashSet<Integer>();
        
        // Adding some elements to the set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
  
        
        // Creating a HashSet object named set2
        Set<Integer> set2 = new HashSet<Integer>();
        
        // Adding some elements to the set2
        set2.add(2);
        set2.add(3);
        set2.add(4);


        
        // Performing set operations
        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println("Union of set1 and set2: " + union);
        
        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of set1 and set2: " + intersection);
        
        Set<Integer> difference = new HashSet<Integer>(set1);
        difference.removeAll(set2);
        System.out.println("Difference of set1 and set2: " + difference);
    }

}

