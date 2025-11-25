public class Remover {
​
  public static int[] removeSmallest(int[] numbers) {
   if(numbers == null || numbers.length == 0){
     return new int[]{};
   }
    int minIndex = 0;
    int minValue = numbers[0];
    
    for(int i = 1; i < numbers.length; i++){
      if(numbers[i] < minValue){
        minValue = numbers[i];
        minIndex = i;
      }
    }
    int[] newArray = new int[numbers.length - 1];
    int j = 0;
    for(int i = 0; i < numbers.length; i++){
      if (i != minIndex){
        newArray[j++] = numbers[i];
      }
    }
    return newArray;
  }
}