import java.util.*;

public class HashTableKeys {

    public static void main(String[] args) {
        
        // Creating a Hashtable object
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        
        // Adding elements to the Hashtable
        hashtable.put("1", "one");
        hashtable.put("2", "two");
        hashtable.put("3", "three");
        hashtable.put("4", "four");
        
        // Getting the Set of keys from the Hashtable
        Set<String> keys = hashtable.keySet();
        
        // Displaying the set of keys
        System.out.println("The set of keys in the Hashtable are:");
        for(String key : keys) {
            System.out.println(key);
        }
    }

}