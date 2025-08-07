package firstCode;

public class myPetDog implements dog{
// instance variables following: similar to global variables but scope only within this class
// public allows access of these variables from other classes
    //private does not allow external changes
    protected String name;
    protected String breed;
    protected int age;
    //protected means that it is accessible through the super and sub classes
    //private int age;
//public means that these variables can be accessed in other classes like "main"

    //constructors - functions/methods that have the same name as the class

    public myPetDog(String nameInput,String breedInput,int ageInput){
        this.name = nameInput;
        this.breed = breedInput;
        this.age = ageInput;

        //"this" refers to the object's own definition

    }

    //check method to check the validity of input age

    public void ageSet(int givenAge){
        if (givenAge>=0){
            this.age = givenAge;
        }
        else{
            this.age = 1;
        }
    }

    public int checkAge (){

        return this.age;
    }
    // no input constructor - creates a default object when no parameters are passed
    public myPetDog(){
        this("Bruno", "Frenchie", 3);
        //giving default values to this object
        //"this" method looks for a function where all 3 parameters with the same class name are defined which is the constructor written above
    }

    //only input 1 parameter, this function calls the constructor
    public myPetDog(int age){
        this("Fido","golden retriever”", age);
    }

    //methods

    public void bark(){
        System.out.println("Woof!");
    }

    public void eat(){
        System.out.println("Eating!");
    }

    public static void main (String[] args){
        //instantiating class
        myPetDog cas = new myPetDog();
        myPetDog spec = new myPetDog("Spec", "Laborador", 3);
        System.out.println(cas.name);
        System.out.println(spec.breed);
        cas.bark();
    }
}
