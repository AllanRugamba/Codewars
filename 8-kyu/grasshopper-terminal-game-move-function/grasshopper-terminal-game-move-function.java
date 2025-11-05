public class Move {
    public static int move(int position, int roll) {
        // your code here
      int newRoll = roll * 2;
      int newPosition = newRoll + position;
      return newPosition;
    }
}