import java.util.ArrayList;
import java.util.List;

public class ProblemTwo {

    public List<Object> combineAlternating(List<?> list1, List<?> list2) {
        List<Object> result = new ArrayList<>();
        int maxLength = Math.max(list1.size(), list2.size());

        for (int i = 0; i < maxLength; i++) {
            if (i < list1.size()) {
                result.add(list1.get(i));
            }
            if (i < list2.size()) {
                result.add(list2.get(i));
            }
        }
        return result;
    }
}
