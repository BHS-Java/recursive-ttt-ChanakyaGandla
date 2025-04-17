public class Recursive {


    public Recursive() {

    }


    public void countDown(int n) {
      System.out.println(n);
      if (n <= 0) {
          return;
      }
      countDown(n-1);
    }

    public int sumToN(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumToN(n-1);
    }

    public void printDashes(int n) {
        if (n <= 0) {
          return;
        }
        System.out.print("-");
        printDashes(n-1);
    }

    public void printDashesMrReiberWay(int n) {
      System.out.print("-");
      if (n > 0) {
        printDashes(n-1);
      }
    }
}
