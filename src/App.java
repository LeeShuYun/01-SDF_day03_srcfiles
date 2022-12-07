import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

public class App{
    public static void main(String[] args){

        // ArrayLists ===========================================================
        System.out.println("Array list Demo");
        
        //create array list object
        ArrayList<String> newList = new ArrayList<String>();

        //add items to list
        newList.add("apples");
        newList.add("oranges");

        //loop over and print the items - this is the newer way of making a for loop.
        for (String item : newList) {
            System.out.println("Item -> " + item);
        }

        //remove apples form this list
        newList.remove("apples");

        //print the number of items inside the list
        System.out.println(newList.size());
        
        // key : value stores - HASHMAP =========================================
        // HashMap<key, value> varName = new HashMap<key, value>();
        // documentation has the generics as K,V. K and V are both DataType, 
        // but written different to differentiate between them 
        HashMap<String, Integer> userHashMap = new HashMap<String, Integer>();

        //insert a key value pair into the hash map
        userHashMap.put("Shu Yun", 10);
        userHashMap.put("Ken", 40);

        //getting the user Ken to print
        String key = "Ken";
        System.out.printf("Key value = %s\n", userHashMap.get(key));

        //change value
        userHashMap.put("Ken", 31);
        System.out.printf("Key value = %s\n", userHashMap.get(key));

        //check if the key exists in the map
        System.out.printf("check if fred exists: %s\n", userHashMap.containsKey(key));

        //exercise - make a hashmap where the value is a List 
        HashMap<String, ArrayList<String>> userListMap = new HashMap<>();
        
        // ArrayList <String> itemsList = new ArrayList<>();

        //we can add a new arraylist like this into the hashmap
        userListMap.put("Dahlia", new ArrayList<String>());
        userListMap.put("Gaius", new ArrayList<String>());
        userListMap.put("Mona", new ArrayList<String>());
        
        // Working with Paths
    
        

        //exceptions
        /*try{
            
        }
        catch{
            //find the right exception that the program is expected to make and catch them
        }*/


    }
}