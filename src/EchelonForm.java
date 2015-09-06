
public class EchelonForm {

	public static void main(String[] args) {
		int[][] sampleMatrix = {{0, -3, -6, 4, 9}, {-1, -2, -1, 3, 1}, {-2, -3, 0, 3, -1},{1, 4, 5, -9, -7}};
		System.out.println(isMatrixValid(sampleMatrix));
	}
	
	

	public int[] findPivotPosition(int[][] m){
		int pivotColumn = 0;
		int[] pivotPosition = {0, pivotColumn}; //row, column. Row is always top one.
		return pivotPosition;
	}
	
	public static boolean isMatrixValid(int[][] m){
		boolean isValid = true;
		//first, basic, make sure each row has equal ints per column
		for(int i = 0; i < (m.length - 1); i++){
			if(m[i].length != m[i + 1].length){
				isValid = false;
				break;
			}
		}
		return isValid;
	}
}
