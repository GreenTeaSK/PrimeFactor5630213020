//Surada Khamengkit 5630213020

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactor {
    public void calculate(int numbers) {
        List<Integer> primeFactor = new ArrayList<Integer>();
        for (int i = 2; i <= numbers / i; i++) {
            while (numbers % i == 0) {
                primeFactor.add(i);
                numbers /= i;
            }
        }
        if (numbers > 1) {
            primeFactor.add(numbers);
        }
        System.out.print("Prime Factor is" + primeFactor);
    }
}

class PrimeFactorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeFactor primfactor = new PrimeFactor();
        
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        primfactor.calculate(num);
    }
}
