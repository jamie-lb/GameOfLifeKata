package tests;

import grid.*;
import grid.GridReader;

public class TestHelper {
    static String gridText = "........\n" +
            "....*...\n" +
            "...**...\n" +
            "........\n";

    public static Grid getTestGrid() {
        GridReader reader = new GridReader();
        return reader.parseGridText(gridText);
    }

    public static Generation getTestGeneration(){
        Grid grid = getTestGrid();
        return new Generation(grid);
    }
}