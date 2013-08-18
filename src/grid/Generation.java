package grid;

import cell.Cell;

public class Generation {

    private final Grid grid;

    public Generation(Grid grid){
        this.grid = grid;
    }

    public Grid nextGeneration() {
        for (Cell cell:grid.getCells()){
            if (cell.getIsAlive()){
                cell.setIsAlive(cellHasTwoOrThreeLivingNeighbors(cell));
            }
            else{
                cell.setIsAlive(cellHasThreeLivingNeighbors(cell));
            }
        }
        return grid;
    }

    private boolean cellHasTwoOrThreeLivingNeighbors(Cell cell) {
        int livingNeighborCount = getCellLivingNeighborCount(cell.getRow(), cell.getColumn());
        return livingNeighborCount == 2 || livingNeighborCount == 3;
    }

    private boolean cellHasThreeLivingNeighbors(Cell cell) {
        int livingNeighborCount = getCellLivingNeighborCount(cell.getRow(), cell.getColumn());
        return livingNeighborCount == 3;
    }

    public int getCellLivingNeighborCount(int cellRow, int cellColumn){
        int livingNeighbors = 0;
        for (int row = cellRow - 1; row <= cellRow + 1; row++){
            for (int column = cellColumn - 1; column <= cellColumn + 1; column++){
                if (!(cellRow == row && cellColumn == column)){
                    if (cellIsAlive(row, column)) livingNeighbors += 1;
                }
            }
        }
        return livingNeighbors;
    }

    private boolean cellIsAlive(int row, int column) {
        Cell cell = getCellAtLocation(row, column);
        return cell == null
                ? false
                : cell.getIsAlive();
    }

    private Cell getCellAtLocation(int row, int column){
        for (Cell cell: grid.getCells()){
            if (cell.getRow() == row && cell.getColumn() == column)
                return cell;
        }
        return null;
    }
}
