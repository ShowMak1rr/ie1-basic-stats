import java.util.Scanner;

public class MinMaxCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();  

        if (n <= 0) {
            System.out.println("Please enter a positive number of elements.");
            return;
        }

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate min and max
        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        scanner.close();
    }

    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
