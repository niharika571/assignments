

//Write a generic method to exchange the positions of two different elements in an array.


import java.util.Arrays;
import java.util.Scanner;

public class GenericsQ3 {
    public static <Integer> void swap(Integer[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid index");
        }

        Integer temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        Integer[] numbers = new Integer[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Before swapping:");
        System.out.println(Arrays.toString(numbers));

        System.out.print("Enter the indices to swap (separated by space): ");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        swap(numbers, index1, index2);

        System.out.println("After swapping:");
        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
