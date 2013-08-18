package tests;

import grid.*;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static tests.TestHelper.getTestGeneration;

public class GenerationTests {

    @Test
    public void testGenerationUnderpopulationDies(){
        Generation generation = getTestGeneration();
        Grid grid = generation.nextGeneration();
        assertEquals(4, grid.getLiveCells().size());
    }

    @Test
    public void testCellHasThreeLivingNeighbors() throws Exception {
        Generation generation = getTestGeneration();
        int livingNeighbors = generation.getCellLivingNeighborCount(1, 3);
        assertEquals(3, livingNeighbors);
    }
}
