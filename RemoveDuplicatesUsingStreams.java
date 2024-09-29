
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStreams {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(2);

        // Coonverting ArrayList to arrays []

        int[] arrays = list.stream().mapToInt(Integer::intValue).toArray();

        // Priting all elemets once
        System.out.println(Arrays.toString(arrays));

        // Printing elements one by one using java Streams
        System.out.println(" Printing elements one by one");

        Arrays.stream(arrays).forEach(System.out::println);

        // Converting arrays to ArrayList
        System.out.println(" Printing arrays ");

        List<Integer> arrayList = Arrays.stream(arrays).boxed().collect(Collectors.toList());

        arrayList.stream().forEach(System.out::println);

        // Removing Duplicates
        System.out.println(" Printing Non Duplicates values");

        list.stream().distinct().forEach(System.out::println);

    }
}
