import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        char[] alphabet = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
        ArrayList<String> numbers = new ArrayList<String>();
        HashMap<String, String> numbersHashMap = new HashMap<String, String>();
        TreeMap<String, String> numbersTreeMap = new TreeMap<String, String>();
        int index = 0;
        for (char c : alphabet) {
            for (char d : alphabet) {
                for (char e : alphabet) {
                    for (int j = 1; j <= 9; j++) {
                        for (int k = 1; k<200; k++) {
//                            numbers.add(c + Integer.toString(j * 111) + d + e + " " + k);
//                            numbersHashMap.put(c + Integer.toString(j * 111) + d + e + " " + k,index+"");
                            numbersTreeMap.put(c + Integer.toString(j * 111) + d + e + " " + k,index+"");
                            index++;
                        }

                    }
                }
            }

        }

//        for (String number : numbers) {
//            System.out.println(number);
//        }

        long start = System.nanoTime();
//        int index = Collections.binarySearch(numbers,"Х999ХХ");
//        int got = numbers.indexOf("Х999ХХ");
//        String got = numbersHashMap.get("Х999ХХ");
        String got = numbersTreeMap.get("Х999ХХ");
//        System.out.println("Среди " + numbers.size() + " нашелся нужный элемент за " + (System.nanoTime()-start) + " наносек.");
        System.out.println("Среди " + numbersHashMap.size() + " нашелся нужный элемент за " + (System.nanoTime()-start) + " наносек.");



    }
}