class Solution {
    public static String isSortedAndHow(int[] array) {
      boolean ascending = true;
        for(int i = 0; i < array.length - 1; i++){
          if(array[i] > array[i+1]){
            ascending = false;
            break;
          }
          }
          if(ascending){
            return "yes, ascending";
          }
          boolean descending = true;
          for(int i = 0; i < array.length-1; i++){
           if(array[i] < array[i+1]){
            descending = false;
            break;
          }
          }
          if(descending){
            return "yes, descending";
          } 
      return "no";
    }
}