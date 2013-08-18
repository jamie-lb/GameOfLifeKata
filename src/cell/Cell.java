package cell;

public class Cell {
    private final int column;
    private final int row;
    private boolean isAlive;

    public Cell(int row, int column, boolean alive) {
        this.row = row;
        this.column = column;
        this.isAlive = alive;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean alive) {
        isAlive = alive;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
