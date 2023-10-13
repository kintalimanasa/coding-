import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        String romanNumber = "IX";
        int result = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            char current = romanNumber.charAt(i);
            if (i + 1 < romanNumber.length()) {
                char next = romanNumber.charAt(i + 1);
                if (romanToInt.get(current) < romanToInt.get(next)) {
                    result += romanToInt.get(next) - romanToInt.get(current);
                    i++;
                } else {
                    result += romanToInt.get(current);
                }
            } else {
                result += romanToInt.get(current);
            }
        }
        System.out.println(result);
    }
}