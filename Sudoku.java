package grafos;

public class Sudoku {
	public static void main(String args[]) {
		metodos sudoku = new metodos(new int[][] {
			{0, 2, 0, 5, 0, 1, 0, 9, 0},
            {8, 0, 0, 2, 0, 3, 0, 0, 6},
            {0, 3, 0, 0, 6, 0, 0, 7, 0},
            {0, 0, 1, 0, 0, 0, 6, 0, 0},
            {5, 4, 0, 0, 0, 0, 0, 1, 9},
            {0, 0, 2, 0, 0, 0, 7, 0, 0},
            {0, 9, 0, 0, 3, 0, 0, 8, 0},
            {2, 0, 0, 8, 0, 4, 0, 0, 7},
            {0, 1, 0, 9, 0, 7, 0, 6, 0}
		});
		sudoku.resultado();
	}
}