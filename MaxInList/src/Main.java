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

        MinNum(numbers);
    }

    public static void MinNum(ArrayList<Double> numbers){
        System.out.println("Наименьшее число в списке: " + Collections.min(numbers));
    }
}
