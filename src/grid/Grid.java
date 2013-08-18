package grid;

import cell.Cell;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    private int rows;
    private int columns;
    private List<Cell> cells = new ArrayList<Cell>();

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public List<Cell> getLiveCells() {
        List<Cell> liveCells = new ArrayList<Cell>();
        for (Cell cell : cells){
            if (cell.getIsAlive()) liveCells.add(cell);
        }
        return liveCells;
    }

    public void addLiveCell(int row, int column) {
        cells.add(new Cell(row, column, true));
    }

    public List<Cell> getDeadCells() {
        List<Cell> deadCells = new ArrayList<Cell>();
        for (Cell cell : cells){
            if (!cell.getIsAlive()) deadCells.add(cell);
        }
        return deadCells;
    }

    public void addDeadCell(int row, int column) {
        cells.add(new Cell(row, column, false));
    }

    public List<Cell> getCells() {
        return cells;
    }
}
