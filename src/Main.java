import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Convert convert = new Convert();
        String romam = "XII";
        int i;
        i= convert.romanToInt(romam);
        System.out.println(i);
    }
}