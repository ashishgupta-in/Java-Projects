/**
 * Find the prime numbers in range(0-num)
 * using "Sieve of Eratosthenes" algorithm
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        IntStream.rangeClosed(2, num).forEach(i -> ar.add(i));
        int k = 0;
        int p = ar.get(k);
        while (p * p < ar.get(ar.size() - 1)) {
            for (int i = p * p; i <= ar.get(ar.size() - 1); i += p) {
                ar.remove(Integer.valueOf(i));
            }
            p = ar.get(++k);
        }
        System.out.println(ar);
    }
}
