package firstcode;
import java.util.HashMap;

public class hashMapTest {
    public static void main(String[] args) {
        HashMap <String,Integer> teaSteepingTime = new HashMap<>();


        // to add a pair
        teaSteepingTime.put("oolong", 185);

        //to find a value
        teaSteepingTime.get("oolong");
        // the return oif this function would be the corresponding value which is 185


        //to remove a pair
        teaSteepingTime.remove("oolong");


        //to remove all
        teaSteepingTime.clear();

        //find the size of a hashmap
        teaSteepingTime.size();


        //to iterate through a hashmap
        for (String key: teaSteepingTime.keySet()){

            System.out.println(teaSteepingTime.get(key));
        }

        //check if the hash map contains this element
        teaSteepingTime.containsKey("oonlong"); // returns true
        teaSteepingTime.containsKey("green"); //returns false

        //replacing a value for a key
        teaSteepingTime.replace("Rooibos", 245);
        //if you call rooibos, the return value is 245


        //to return all of the unique keys in the hashmap
        teaSteepingTime.keySet();
        //this prints all of the unique keys


        //to return all of the unique values in the hashmap
        teaSteepingTime.values();
    }




}
