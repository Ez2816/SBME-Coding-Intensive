package cellAutomata.cellTypes;

import cellAutomata.cellUpdated;

import java.util.ArrayList;

public class DeadCell extends cellUpdated {
    //this cell does nothing and waits to be interacted by other cells

    public DeadCell(int x, int y) {
        super(0,x,y,0);
    }

}
