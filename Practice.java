
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] arg){
       System.out.println("Helo World");
       List<Integer> list= new ArrayList<Integer>();

        list.add(2);

        int[] array = list.stream().mapToInt(Integer::intValue).toArray();

        int[] ints = {1,2,3};

        System.out.println(array[0]);

      Arrays.stream(ints).boxed().collect(Collectors.toList()).forEach(System.out::println);

    }
}