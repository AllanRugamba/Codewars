public class TwiceAsOld {
​
    public static int twiceAsOld(int dadYears, int sonYears) {
        int nbrOfYears = dadYears - (2 * sonYears);
      return Math.abs(nbrOfYears);
    }
​
}