import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        
        // If all digits were 9, create a new array with leading 1
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
    }
    
    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🔢 PLUS ONE CALCULATOR");
        System.out.println("======================");
        
        while(true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Enter custom number");
            System.out.println("2. Run test cases");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            int choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    // Custom input
                    System.out.print("Enter the number of digits: ");
                    int n = scanner.nextInt();
                    
                    int[] digits = new int[n];
                    System.out.println("Enter the digits (from left to right):");
                    for(int i = 0; i < n; i++) {
                        digits[i] = scanner.nextInt();
                    }
                    
                    System.out.print("\nInput number: ");
                    printArray(digits);
                    
                    int[] result = plusOne(digits);
                    
                    System.out.print("Result:       ");
                    printArray(result);
                    break;
                    
                case 2:
                    // Test cases
                    System.out.println("\n🧪 RUNNING TEST CASES");
                    System.out.println("====================");
                    
                    int[][] testCases = {
                        {1, 2, 3},
                        {4, 3, 2, 1},
                        {9},
                        {9, 9, 9},
                        {1, 9, 9},
                        {0},
                        {2, 0, 2, 4}
                    };
                    
                    String[] expected = {
                        "[1, 2, 4]",
                        "[4, 3, 2, 2]",
                        "[1, 0]",
                        "[1, 0, 0, 0]",
                        "[2, 0, 0]",
                        "[1]",
                        "[2, 0, 2, 5]"
                    };
                    
                    for(int i = 0; i < testCases.length; i++) {
                        System.out.println("\nTest Case " + (i + 1) + ":");
                        System.out.print("Input:    ");
                        printArray(testCases[i]);
                        
                        int[] testResult = plusOne(testCases[i]);
                        System.out.print("Output:   ");
                        printArray(testResult);
                        
                        System.out.print("Expected: " + expected[i]);
                        
                        // Check if result matches expected
                        String actualStr = Arrays.toString(testResult);
                        if(actualStr.equals(expected[i])) {
                            System.out.println (2" ✅ PASS");
                        } else {
                            System.out.println(" ❌ FAIL");
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("👋 Goodbye!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("❌ Invalid choice! Please enter 1, 2, or 3.");
            }
        }
    }
}