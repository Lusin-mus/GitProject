package com.company;

public class Main {

    public static void main(String[] args) {
	int [] array= {1, 2, 4, 6, 8, 9, 0};
	int sum=sumOfArrayNumbers(array);
        System.out.println(sum);


}
    public static int sumOfArrayNumbers(int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}