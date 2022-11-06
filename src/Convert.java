import java.util.TreeMap;

public class Convert {
    TreeMap<Character, Integer> romainArabicMAp = new TreeMap<>();

    public Convert(){
        romainArabicMAp.put('I', 1);
        romainArabicMAp.put('V', 5);
        romainArabicMAp.put('X', 10);
        romainArabicMAp.put('L', 50);
        romainArabicMAp.put('C', 100);
        romainArabicMAp.put('D', 500);
        romainArabicMAp.put('M', 10000);
    }

    public int romanToInt(String numbers){
        int index = numbers.length()-1;// XII - 2
        char[] elements = numbers.toCharArray();//  X I I
        int arabic;
        int result = romainArabicMAp.get(elements[index]);// I - 1
        for(int i = index-1; i>=0; i--){ // index 0
            arabic = romainArabicMAp.get(elements[i]); // I - 1, X-10
            if(arabic < romainArabicMAp.get(elements[i + 1])){
                result =result - arabic;
            }else{
                result = result + arabic;
            }
        }
        return result;
    }
}
