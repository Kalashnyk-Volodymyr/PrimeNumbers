import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/4/16.
 */
public class Main {
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        list = Numbers.getNumbers(510510);
        for(Integer i:list)
        System.out.print("\t"+i);
    }
}
