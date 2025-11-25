public class Kata {
    public static final String generateShape(int n) {
      StringBuilder squareBuilder = new StringBuilder();
      for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
          squareBuilder.append("+");
        }
        if(i < n -1){
          squareBuilder.append("\n");
        } 
        }
      return squareBuilder.toString();
    }
}
​