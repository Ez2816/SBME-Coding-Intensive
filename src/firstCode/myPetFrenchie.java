package firstcode;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;

public class myPetFrenchie extends myPetDog{

    private int anger;

    //constructors to refer to super class
    public myPetFrenchie(String name, int age, int angerIn){
        super(name,"frenchie",age);
        this.anger = angerIn;

    }

    //if you call myPetFrenchie without this constructor, still refers to default myPetDog
    public myPetFrenchie(){
        super();
    }

    //everytime the bark function is called for myPetFrenchie, override the previous function
    @Override
    public void bark () {

        System.out.println("Woooof");

        //super.bark(); this is referring to the function in the super set to be called
    }

    public void bite(){
        System.out.println("Chomp");

    }

    @Override
    public void eat(){
        System.out.println("Eat");
    }



    public static void main (String args[]){

        myPetFrenchie pet = new myPetFrenchie("a",3, 12);
        pet.bark();
        pet.age = 5;

        pet.bite();
        System.out.println(pet.anger);
        // you can still call anger because you are within the class scope


        //you can initialize a super class as a subclass
        myPetDog test = new myPetFrenchie("Dusty", 4,15);
        test.bark(); //in runtime, it will consider the myPetFrenchie bark method
        //test.bite(); you can only call myPetDog public functions


        //in order to access the methods in the subclass, must downcast to subcast
        myPetFrenchie dusty = (myPetFrenchie) test;
        dusty.bite();





        ArrayList<myPetDog> dogList = new ArrayList<myPetDog>();

        //given that the list should consist of parent types, the elements can be children types as well
        dogList.add(pet);
        dogList.add(test);
        dogList.add(new myPetDog("killer", "rottweiler", 4));
        dogList.add(new myPetFrenchie("sandy",4,12));

        for (int i = 0; i<dogList.size();i++){
            dogList.get(i).bark();

        }

    }
}
