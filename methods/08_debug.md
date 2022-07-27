Kianna Herr, Harrison Fung, Moo Joon Park, Sarah McCoy

## Original code for countNeighbors from Cgol:
```java
  public static int countNeighbours( char[][] board, int r, int c )
  {
    int row = board.length;
    int col = board[0].length;
    int count = 0;
    // start at the larger: 0 or the row above. end at the smaller: last row or the row below.
    for (int i = Math.max(0, r - 1); i <= Math.min(row - 1, r + 1);  i++){
      for (int j = Math.max(0, c - 1); j <= Math.min(col - 1, c + 1) ; j++){
        if (!(i == r && j == c)){ //if not on the target cell
          //System.out.println("Row " + i + ", column " + j);
          if (board[i][j] != '-'){ //if cell is not a hyphen (dead)
            count += 1;
          }
        }
      }
    }
    return count;
  }
```

## Edited to introduce errors:

```java
  public static int countNeighbours( char[][] board, int r, int c )
  {
    int row = board.length;
    int col = board[0].length // oops, lost a semicolon
    int count = 0;
    // start at the larger: 0 or the row above. end at the smaller: last row or the row below.
    for (int i = r - 1; i <= row - 1;  i++){ // not dealing with edge cases
      for (int j = c - 1; j <= c + 1; j++){ // not dealing with edge cases
        //if not on the target cell
        if (i != r && j != c){ // should be !(i == r && j == c)
          //System.out.println("Row " + i + ", column " + j);
          if (board[i][j] != '-'){ //if cell is not a hyphen (dead)
            count += 1;
          }
        // erased bracket
      }
    }
    return count;
  }
```