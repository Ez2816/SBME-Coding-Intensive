package cellAutomata.cellTypes;

import cellAutomata.cellUpdated;

import java.util.ArrayList;

public class CancerCell extends cellUpdated{
    //complex cell that kills its neighbors and tried to grow

    public CancerCell (int x, int y) {
        super(1,x,y,3);
    }

    @Override
    public void interactNeighbor(ArrayList<cellUpdated> neighbors){
        //write code here
    }

}
