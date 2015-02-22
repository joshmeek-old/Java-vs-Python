
public class javaPrime {

  public static void main(String[] args) {

    long startTime = System.currentTimeMillis();

    for(int i = 1; i <= 104729; i++)
      isPrime(i);

    long finalTime = System.currentTimeMillis() - startTime;

    System.out.println(finalTime);
  }

  public static boolean isPrime( int n ) {

		if(n <= 2)
			return true;

		int square = (int) (Math.sqrt(n) + 1);

		return(divisible(n, square, 2));
	}

  private static boolean divisible(int n, int square, int num) {

		if(n % num == 0)
			return false;

		if(num >= square)
			return true;

		return(divisible(n, square, num + 1));

	}
}
