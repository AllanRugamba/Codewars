public class Kata {
    public static boolean isUpperCase(String s) {
      for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        if(Character.isLetter(ch) && Character.isLowerCase(ch)){
          return false;
        }
        }
      return true;
      }
      }
    
​