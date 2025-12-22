import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<Double>();
        numbers.add(3.1);
        numbers.add(2.4);
        numbers.add(-5.7);
        numbers.add(7.9);
        numbers.add(-9.3);
        MaxNum(numbers);
    }

    public static void MaxNum(ArrayList<Double> numbers){
        System.out.println("Наибольше число в списке: " + Collections.max(numbers));
    }
}
