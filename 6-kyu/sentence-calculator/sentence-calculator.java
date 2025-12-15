public class SentenceCalculator{
    public static int lettersToNumbers(String s){
        int sum = 0;
      for(int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (ch >= 'a' && ch <= 'z'){
          sum += ch - 'a' + 1;
        }else if (ch >= 'A' && ch <= 'Z'){
          sum += (ch - 'A' + 1) * 2;
        }else if(ch >= '0' && ch <='9'){
          sum += ch - '0';
        }else{
          sum += 0;
        }
      }
      return sum;
    }
}