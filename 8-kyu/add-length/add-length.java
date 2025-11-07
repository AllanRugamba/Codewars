public class AddLength{
  
  public static String[] addLength(String str){
    String[] wordsArr = str.split(" ");
    for(int i = 0; i < wordsArr.length; i++){
      wordsArr[i] = wordsArr[i] + " " + wordsArr[i].length();
    }
    return wordsArr;
  }
  
}