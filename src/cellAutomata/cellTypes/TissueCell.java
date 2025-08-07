package cellAutomata.cellTypes;

import cellAutomata.cellUpdated;

import java.util.ArrayList;

public class TissueCell extends cellUpdated {
    //replaces neighboring dead cells with tissue cells

    public TissueCell(int x, int y) {
        super(0,x,y,1);
    }

    public void interactNeighbor(ArrayList<cellUpdated> neighbors){
        //write code here
    }
}
