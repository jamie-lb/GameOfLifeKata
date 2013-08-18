package grid;

public class GridReader {

    public Grid parseGridText(String gridText) {
        Grid grid = new Grid();
        String[] lines = gridText.split("\n");
        grid.setRows(lines.length);
        grid.setColumns(lines[0].length());
        for (int row = 0; row < lines.length; row++){
            for (int column = 0; column < lines[row].length(); column++){
                if (lines[row].charAt(column) == '*')
                    grid.addLiveCell(row, column);
                else if (lines[row].charAt(column) == '.')
                    grid.addDeadCell(row, column);
            }
        }
        return grid;
    }

}
