import by.itstep.lesson.Fibonachi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Fibonachi fib = new Fibonachi();
        int[] ints = fib.fibArray(10);
        System.out.println(Arrays.toString(ints));


    }
}
