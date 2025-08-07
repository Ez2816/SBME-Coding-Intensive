package firstcode;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        //ArrayList<String> fruits = new ArrayList<String>();
        myPetDog bruno = new myPetDog("Bruno", "Frenchie", 2);
        ArrayList<myPetDog> dogs = new ArrayList<myPetDog>();

        dogs.add(bruno);

        //dogs.indexOf("") - finding index of a certain item
        //dogs.add(index,"") - adding object at specified position
        //dogs.add("") - adding object at the end
        //dogs.remove("") - removing certain object
        //dogs.remove(index) - remove object at specified index
        //dogs.size() - checking size of the whole array
        //dogs.get(index) - retrieving the object at specified index

        //array lists allows programmers to have an array that does not have a set size
        //most things work just like an array

    }



}
