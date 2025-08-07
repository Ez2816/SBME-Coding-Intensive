package cellAutomata.cellTypes;

import cellAutomata.cellUpdated;

import java.util.ArrayList;

public class ImmuneCell extends cellUpdated {
    //fight cancer cells

    public ImmuneCell(int x, int y){
        super(3,x,y,4);
    }

    @Override
    public void interactNeighbor(ArrayList<cellUpdated> neighbors){
        //write code here
    }
}
