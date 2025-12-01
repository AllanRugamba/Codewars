public class StringScramble {
  
  public static String scramble(String str, int[] indices) {
    if(str.length() != indices.length){
      throw new IllegalArgumentException("The string length should be equal to the indices length");
    }
    char[] result = new char[str.length()];
    
    for(int i = 0; i<str.length(); i++){
      char charToMove = str.charAt(i);
      int newPosition = indices[i];
      result[newPosition] = charToMove;
    }
    return new String(result);
  }
}