import java.util.*;

public class AutoboxingSum {
    public static void main(String[] args) {
        List<String> numberStrings = Arrays.asList("10", "20", "30", "40", "50");
        
        List<Integer> numbers = parseIntegerList(numberStrings);
        
        int sum = calculateSum(numbers);
        
        System.out.println("Sum of numbers: " + sum);
    }

    public static List<Integer> parseIntegerList(List<String> strList) {
        List<Integer> intList = new ArrayList<>();
        for (String str : strList) {
            intList.add(Integer.parseInt(str)); // Autoboxing
        }
        return intList;
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing
        }
        return sum;
    }
}
