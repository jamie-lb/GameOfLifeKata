package tests;

import cell.Cell;
import grid.Grid;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static tests.TestHelper.getTestGrid;

public class GridReaderTest {

    @Test
    public void gridReadCorrectly(){
        Grid grid = getTestGrid();
        assertEquals(4, grid.getRows());
        assertEquals(8, grid.getColumns());
    }

    @Test
    public void testGridHasThreeLiveCells(){
        Grid grid = getTestGrid();
        List<Cell> aliveCells = grid.getLiveCells();
        assertEquals(3, aliveCells.size());
    }

    @Test
    public void testGridHasTwentyNineDeadCells(){
        Grid grid = getTestGrid();
        List<Cell> deadCells = grid.getDeadCells();
        assertEquals(29, deadCells.size());
    }
}
