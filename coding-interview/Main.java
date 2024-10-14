import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Problem 1
        ProblemOne problemOne = new ProblemOne();

        System.out.println("Sum using for loop: " + problemOne.sumOfArrayForLoop(numbers));
        System.out.println("Sum using while loop: " + problemOne.sumOfArrayWhileLoop(numbers));
        System.out.println("Sum using recursion: " + problemOne.sumOfArrayRecursion(numbers, 0));

        //Problem 2
        ProblemTwo problemTwo = new ProblemTwo();
        List<Character> list1 = List.of('a', 'b', 'c');
        List<Integer> list2 = List.of(1, 2, 3);

        List<Object> combinedList = problemTwo.combineAlternating(list1, list2);
        System.out.println(combinedList);

        //Problem 3
        ProblemThree problemThree = new ProblemThree();
        int number = 100;
        problemThree.prinNFibonacci(number);

        //Problem 4
        ProblemFour problemFour = new ProblemFour();
        List<Integer> arr = Arrays.asList(50, 2, 1, 9);
        System.out.println("The largest possible number is: " + problemFour.largestNumber(arr));

    }
}
