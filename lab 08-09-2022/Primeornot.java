import java. util.*;
class Primeornot {

  public static void main(String[] args) {

    int n = 11;
    int count = 0;
     if (n <= 1)
	    count++;
    for (int i = 2; i <= n / 2; i++) {
      
      if (n % i == 0) {
        count++;
      }
    }

    if ( count > 0)
      System. out.println("The number is not prime");
    else
      System. out.println("The number is prime");
  }
}




OUTPUT
The number is prime