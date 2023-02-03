package arrayGraceAssignment;

public class ArrayAssignment {
    int count =0;

    public int[] Multiply(int[] numbers) {
        int [] multiply = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            int arr = numbers [i] * numbers[i];
            multiply[i]= arr;

        }


        return multiply;
    }

    public int[] Ascending(int[] array) {
        for (int counter = 0; counter < array.length ; counter++) {
            for (int i = counter+1; i < array.length; i++) {
                if (array [counter] > array[i]){
                    count = array[counter];
                    array [counter] = array [i];
                    array[i] = count;

                }

            }
            
        }
        return array;
    }

    public int[] Descending(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]){
                    count = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = count;
                }

            }
        }

        return numbers;
    }


    }

