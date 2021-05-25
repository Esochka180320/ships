public class Task {

  public static int countBattleships(int[][] board) {
    int width = board.length;
    if (width == 0){
      return 0;
    }
    int height = board[0].length;

    int count = 0;

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        if (board[i][j] == 0){
          continue;
        }
        if (i > 0 && board[i - 1][j] == 1){
          continue;
        }
        if (j > 0 && board[i][j - 1] == 1){
          continue;
        }
        count++;
      }
    }

    return count;
  }
}
