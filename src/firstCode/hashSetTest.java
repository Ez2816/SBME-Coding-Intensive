package firstCode;
import java.util.HashSet;

public class hashSetTest {

    // a hash set does not allow for duplicates to exist

    // can store null value
    //no index

    public static void main(String[] args) {
        // iterate through a set
        HashSet <String> colors = new HashSet<String>();

        for(String color:colors){
            System.out.println(color);
        }


        //adding elements
        colors.add("blue");
        colors.add("blue");
        colors.add("red");
        // at this point, the only elements in the set are blue and red, duplicates are ignored


        //removing elements
        colors.remove("red");

        // checking if an item is contained within the list

        colors.contains("red"); // returns true
        colors.contains("green"); // returns false

        // to find the size
        colors.size(); //returns integer

        //to merge another set
        HashSet <String> primary = new HashSet<String>();
        primary.add("yellow");
        primary.add("red");

        colors.addAll(primary);
        //at this point, you have a set of red blue yellow


        //to find the intersection
        colors.retainAll(primary);
        //at this point your set will only have red



        //to find the unique elements within the set color
        colors.removeAll(primary);
        //at this point your set will only have blue
    }





}
