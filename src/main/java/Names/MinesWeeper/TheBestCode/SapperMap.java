package Names.MinesWeeper.TheBestCode;

import java.util.ArrayList;
import java.util.List;

public class SapperMap {

    List<Cell> gameBoard=new ArrayList<>();

    public List<Cell>getFlaggedCells(){
        List<Cell>flaggedCells=new ArrayList<>();
        for (Cell cell : gameBoard) {
            if (cell.isFlagged()){
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }
}
