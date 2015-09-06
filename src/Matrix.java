
public class Matrix {
	
	public int[][] raw;
	private int numOfRows;
	private int numOfColumns;
	private boolean isValid = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Matrix(int[][] m){
		this.raw = m;
		this.numOfRows =  m.length;
		this.numOfColumns = m[0].length;
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

}
