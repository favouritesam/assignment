import arrayGraceAssignment.ArrayAssignment;

import java.util.Arrays;

public class ArrayAssignmentMain {
    public static void main(String[] args) {
        ArrayAssignment arrayAssignment = new ArrayAssignment();
        int[] numbers = {2,4,6,5,3,1};
        System.out.println(Arrays.toString(arrayAssignment.Ascending(numbers)));
        System.out.println(Arrays.toString(arrayAssignment.Descending(numbers)));
        System.out.println(Arrays.toString(arrayAssignment.Multiply(numbers)));
    }
}
