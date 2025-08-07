package cellAutomata;

import java.util.ArrayList;

//this is just a set up of the class
//no main function has been included but can be added to test functions
public class cell {

    //instance vars - private

    private int strength;
    private int x;
    private int y;
    private int id;

    //constructor

    public cell(int strength, int x, int y, int id) {
        this.strength = strength;
        this.x = x;
        this.y = y;
        this.id = id;
    }

    //constructor with default setting

    public cell(){
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

    //method interactNeighbor

    public void interactNeighbor(ArrayList<cellUpdated> neighbors){

    }
}
