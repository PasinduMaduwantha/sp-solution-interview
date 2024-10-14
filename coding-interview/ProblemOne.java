import java.util.List;

public class ProblemOne{
    // 1. Sum of array using a for loop
    public int sumOfArrayForLoop(List<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // 2. Sum of array using a while loop
    public int sumOfArrayWhileLoop(List<Integer> arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.size()) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    // 3. Sum of array using recursion
    public int sumOfArrayRecursion(List<Integer> arr, int index) {
        if (index >= arr.size()) {
            return 0;
        }
        return arr.get(index) + sumOfArrayRecursion(arr, index + 1);
    }
}
