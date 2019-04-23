package isPrimeX;
/* @author sumeyral

 */

public class IsPrimeX {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int val = Integer.parseInt(kb. nextLine());

        if(NumberUtil.isPrimeX(val))
            System.out.println("Sayı tamamen asaldır.");
        else
            System.out.println("Sayı tamamen asal değildir!");
    }
}

class NumberUtil {
    public static boolean isPrimeX(int val)
    {
        if(getDigitsCount(val) == 1)
            if(isPrime(val))
                return true;
            else
                return false;
        else {
            while(getDigitsCount(val) != 1){
                if(isPrime(val))
                    val =getDigitsSum(val);
                else
                    return false;
            }
            if(isPrime(val))
                return true;
        }
        return false;

    }
    public static int getDigitsCount(int val)
    {
        if (val == 0)
            return 1;

        int count = 0;

        while (val != 0) {
            ++count;
            val /= 10;
        }

        return count;
    }
    public static int getDigitsSum(int val)
    {
        val = Math.abs(val);

        int sum = 0;

        while (val != 0) {
            sum += val % 10;
            val /= 10;
        }

        return sum;
    }

    public static boolean isPrime(int val)
    {
        if (val <= 1)
            return false;

        if (val % 2 == 0)
            return val == 2;

        if (val % 3 == 0)
            return val == 3;

        if (val % 5 == 0)
            return val == 5;

        if (val % 7 == 0)
            return val == 7;

        if (val % 11 == 0)
            return val == 11;

        for (int i = 13; i * i <= val; i += 2)
            if (val % i == 0)
                return false;

        return true;
    }
}


