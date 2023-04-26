import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {

        int result1 = subtractTen(20);
        System.out.println(result1);
        int[] result2 ={1,2,3,4,5};
        System.out.println(average(result2));

    }


    public static int subtractTen(int number) {
        return number - 10;
    }
    public static int average(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    // create a method multiplyAll that takes an int and an ArrayList of Integers and returns an array list

    public static ArrayList<Integer> multiplyAll(int number, ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            result.add(num * number);
        }
        return result;
    }


}
