import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();

        System.out.print("Колличество цифер в массиве: ");
        num = input.nextInt();

        for (int i = 0; i < num; i++){
            System.out.print(i+1 + ". ");
            numbers.add(input.nextDouble());
        }

        MaxNum(numbers);
    }

    public static void MaxNum(ArrayList<Double> numbers){
        System.out.println("Наибольше число в списке: " + Collections.max(numbers));
    }
}
