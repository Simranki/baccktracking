package backtracking;

public class SudokuSolver {
public boolean isSafe(char[][]board,int row,int col,int number){
 //to check every columns
for(int i=0;i<board.length;i++){
	if(board[i][col]==(char)(number+'0')){
		return false;
		}
	}
//to check every rows
for(int j=0;j<board.length;j++){
	if(board[row][j]==(char)(number+'0')){
		return false;
		}
	}
//to check every grid
int startingRow=(row/3)*3;
int startingCol=(col/3)*3;
for(int i=startingRow;i<startingRow+3;i++){
	for(int j=startingCol;j<startingCol+3;j++){
		if(board[i][j]==(char)(number+'0')){
			return false;
			}
		}
	}
return true;
}
public boolean helper(char[][] board,int row,int col){
	if(row==board.length){
		return true;
		}
	int newRow=0;
	int newCol=0;
	if(col==board.length-1) {
		newRow=row+1;
		newCol=0;
		}
	else{
		newRow=row;
		newCol=col+1;
		}
	if(board[row][col] != '.'){
		if(helper(board,newRow,newCol)){
			return true;
			}
		}
	else{
		//fill the place
		for(int num=1;num<=9;num++){
			if(isSafe(board,row,col,num)){
				board[row][col]=(char)(num + '0');
				if( helper(board,newRow,newCol))
					return true;
				else
					board[row][col]='.';
				}
			}
		}
	return false;
	}
public void solveSudoku(char[][] board) {
	helper(board,0,0);
	}
}
