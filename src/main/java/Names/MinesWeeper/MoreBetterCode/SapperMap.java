package Names.MinesWeeper.MoreBetterCode;

import java.util.ArrayList;
import java.util.List;

public class SapperMap {
    final int CELL_STATUS = 0;
    final int CLOSED = 1, OPENED = 2, BOMBED = 3, FLAGGED = 4;
    final int CELL_NUMBER = 1;


    List<int[]> gameBoard = new ArrayList<int[]>();

    //........
    public List<int[]> getFlaggedSells() {
        List<int[]> flaggedCells = new ArrayList<int[]>();
        for (int[] cell : gameBoard)
            if (cell[CELL_STATUS] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }

    /*
        - Довольно непонятный способ обозначения статуса ячейки(int[])
    */


}
