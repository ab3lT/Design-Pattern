import java.util.Arrays;
import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        System.out.println("Hello Adapter");

        Integer[] arrayOfInts = new Integer[] {42, 43, 44};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        System.out.println(arrayOfInts);
        System.out.println(listOfInts);

    }
}
