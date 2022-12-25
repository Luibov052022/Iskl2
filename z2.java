import java.util.Arrays;

public class z2 {

  public static void main(String[] args) {
    int d = 0;
    int[] catchedRes1 = new int[8];
    double[] catchedRes2 = new double[catchedRes1.length];
    try {
      for (int i = 0; i < catchedRes1.length; i++) {
        catchedRes2[i] = catchedRes1[i] / d;
      }
      System.out.println("catchedRes1 = " + Arrays.toString(catchedRes2));
    } catch (ArithmeticException e) {
      System.out.println("Catching exception: " + e);
    }
  }
}
