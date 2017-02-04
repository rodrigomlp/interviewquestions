
public class IslandParemeter {
	public int islandPerimeter(int[][] grid) {
        
	       
        int perimeter = 0;
        int row = grid.length;
        int col = grid[0].length;
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j<col; j ++){
                  //check first row
                if(grid[i][j] == 1){
                 
                  if( i == 0)
                    perimeter++;
                  if(j == 0)
                    perimeter++;
                  if(i == row-1)
                    perimeter++;
                  if(j == col-1)
                    perimeter++;
                  //check top
                  if (i != 0 && grid[i-1][j] == 0)
                     perimeter++;
                 //check bottom
                  if (i != row-1 && grid[i+1][j] == 0)
                    perimeter++;
                 //check left
                  if (j != 0 && grid[i][j-1] == 0)
                    perimeter++;
                 //check right
                  if (j != col-1 && grid[i][j+1] == 0)
                    perimeter++;
                 //check last row
                  
                }
            }
        }
        return perimeter;
    }
}
