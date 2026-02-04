public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;  // example number
        int sum = 0;
        int temp = number;

        do {
            sum += temp % 10;
            temp /= 10;
        } while (temp > 0);

        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
