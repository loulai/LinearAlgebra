
public class Matrix {
	
	public int[][] raw;
	private int numOfRows;
	private int numOfColumns;
	private boolean isValid = true;
	private int[] pivotPosition;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Matrix(int[][] m){
		this.raw = m;
		this.numOfRows =  m.length;
		this.numOfColumns = m[0].length;
		this.pivotPosition = this.findPivotPosition();
	}
	
	public void printProperties(){
		System.out.println("--------- PROPERTIES ---------------------");
		printMatrix();
		System.out.println("Number of rows    : " + this.numOfRows);
		System.out.println("Number of columns : " + this.numOfColumns);
		System.out.println("Is valid?         : " + this.isMatrixValid());
		System.out.printf("Pivot position    : row %d, column %d \n", this.pivotPosition[0], this.pivotPosition[1]);
		System.out.println("-------------------------------------------");
	}
	
	public void printMatrix(){
		for(int r = 0; r < this.numOfRows; r++){
			System.out.print("[");
			for(int c = 0; c < this.numOfColumns; c++){
				System.out.printf("%3d ", this.raw[r][c]);
			}
			System.out.print("]");
			System.out.println();
		}
	}
	
	public boolean isMatrixValid(){
		//first, basic, make sure each row is the same length
		for(int i = 0; i < (numOfRows - 1); i++){
			if(this.raw[i].length != this.raw[i + 1].length){
				isValid = false;
				break;
			}
		}
		return isValid;
	}

	private int[] findPivotPosition(){
		int pivotColumn = 0;
		int[] pivotPosition = {0, pivotColumn}; //row, column. Row is always top one.
		for(int col = 0; col < this.raw[0].length; col++) { //loop through COLUMN first, from left to right
			for(int row = 0; row < this.raw.length; row++){
				if(this.raw[row][col] != 0){ //any non-zero in that column means the pivot col, coz going left to right in columns
					pivotColumn = col;
					break;
				}
			}
		}
		return pivotPosition;
	}
	
	
}
