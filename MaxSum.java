public class MaxSum {
  public static int sum = 0;

  public static void main(String[] args) {
    int[] tomb = {6, 5, 4, 3, 2};
    System.out.println(maxsum(tomb, tomb.length - 1));
  }

  private static int maxsum(int[] tomb, int i) {
    int temp;
    if (i == 0) {
      sum += tomb[i];
      return sum - tomb[i];
    } else {
      sum += tomb[i];
      temp = maxsum(tomb, i - 1);
      if (temp < sum - tomb[i]) {
        return sum - tomb[i];
      } else {
        return temp;
      }
    }
  }
}


