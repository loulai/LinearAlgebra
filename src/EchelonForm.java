
public class EchelonForm {

	public static void main(String[] args) {
		Matrix sampleM = new Matrix(new int[][]{{0, -3, -6, 4, 9}, {-1, -2, -1, 3, 1}, {-2, -3, 0, 3, -1}, {1, 4, 5, -9, -7}});
		System.out.println(sampleM.isMatrixValid());
		
	}

	public static int[] findPivotPosition(int[][] m){
		int pivotColumn = 0;
		int[] pivotPosition = {0, pivotColumn}; //row, column. Row is always top one.
		for(int col = 0; col < m[0].length; col++) { //loop through COLUMN first, from left to right
			for(int row = 0; row < m.length; row++){
				if(m[row][col] != 0){ //any non-zero in that column means the pivot col, coz going left to right in columns
					pivotColumn = col;
					break;
				}
			}
		}
		return pivotPosition;
	}
	
	
}
