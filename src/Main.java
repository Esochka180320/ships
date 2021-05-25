public class Main {
  public static void main(String[] args) {

    int[][] board =
            {
                    { 1, 0, 1 },
                    { 0, 0, 1 },
                    { 1, 0, 1 }
            };

    System.out.println(Task.countBattleships(board));
  }
}
