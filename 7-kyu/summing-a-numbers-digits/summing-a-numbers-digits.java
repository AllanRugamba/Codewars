public class Kata{
  public static int sumDigits(int number){
    int sumOfDigits = 0;
    int n = Math.abs(number);
    while(n != 0){
      sumOfDigits += n % 10;
      n /= 10;
    }
    return sumOfDigits;
}
}