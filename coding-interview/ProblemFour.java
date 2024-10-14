
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProblemFour {

    public long largestNumber(List<Integer> arr) {
        List<String> strArr = new ArrayList<>();
        for (Integer num : arr) {
            strArr.add(String.valueOf(num));
        }

        Collections.sort(strArr, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is "0", the result should just be "0"
        if (strArr.get(0).equals("0")) {
            return 0;
        }

        // Join the sorted elements to form the largest number
        StringBuilder largestNumber = new StringBuilder();
        for (String num : strArr) {
            largestNumber.append(num);
        }

        String resultStr = largestNumber.toString();
        return Long.parseLong(resultStr);
    }

}

