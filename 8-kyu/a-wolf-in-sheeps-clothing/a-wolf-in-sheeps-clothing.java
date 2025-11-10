public class ZywOo {
​
  public static String warnTheSheep(String[] array) {
    //Your code)))
    if(array[array.length-1].equals("wolf")){
        return "Pls go away and stop eating my sheep";
    }else{
      int wolfPositionFromEnd = 0;
      for(int i = 0; i < array.length; i++){
        if(array[i].equals("wolf")){
          wolfPositionFromEnd = (array.length - 1) - i;
          break;
        }
      }
      return "Oi! Sheep number " + wolfPositionFromEnd + "! You are about to be eaten by a wolf!";
    }
  }
​
}