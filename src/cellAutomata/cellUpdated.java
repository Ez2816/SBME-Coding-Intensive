package cellAutomata;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;


public class liverCellUpdated {

    //instance vars - private

    private int strength;
    private int x;
    private int y;
    private int id;

    private HashMap<String,Integer> characteristics = new HashMap<>();
    private HashSet<String> mols = new HashSet<String>();


    //constructor

    public liverCellUpdated(int strength, int x, int y, int id) {
        this.strength = strength;
        this.x = x;
        this.y = y;
        this.id = id;

        //initialize the values for characteristics map and molecules list
        characteristics.put("ATP", 100);
        characteristics.put("Water", 100);
        characteristics.put("Glucose", 100);
        characteristics.put("Lactate", 100);

        mols.add("insulin");
        mols.add("Cortisol");
        mols.add("adrenaline");
        mols.add("oxytocin");
    }

    //constructor with default setting

    public liverCellUpdated(){
        this(0,0,0,0);
    }

    //getters

    public int getStrength(){
        return strength;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getID(){
        return id;
    }

    public int getCharacteristic(String chara){
        return characteristics.get(chara);
    }

    //setters

    public void setStrength(int strength){
        if (strength >=0){
            this.strength = strength;
        }
        else {
            this.strength = 0;
        }
    }
    public void setX(int x){
        if  (x>=0){
            this.x = x;
        }
        else {
            this.x = 0;
        }
    }
    public void setY(int y){
        if (y>=0){
            this.y = y;
        }
        else {
            this.y=0;
        }
    }
    public void setID(int id){
        if (id >=0){
            this.id = id;
        }
        else {
            this.id = 0;
        }
    }

    //setting characteristics
    public void setCharacteristic(String chara, int value){
        if (characteristics.containsKey(chara)){
            if (value >= 0){
                this.characteristics.replace(chara,value);
            }
        }
        else{
            System.out.println("this characteristic does not exist");
        }
    }

    //cellular response methods

    public void respond(String stimulus){
        if (mols.contains(stimulus)){
            //response for diff molecules here
        } else {
            System.out.println("no response");
        }
    }

    //method interactNeighbor

    public void interactNeighbor(ArrayList<liverCellUpdated> neighbors){

    }
}
