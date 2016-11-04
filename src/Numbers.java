import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/4/16.
 */

public class Numbers {
    public  static final List<Integer> getNumbers(int number) {
        List<Integer> primeNums=new ArrayList<>();
        int divider;
        divider = 2;
        while (number >= divider) {
            if (number % divider == 0) {
                primeNums.add(divider);
                number = number / divider;
            } else divider += 1;
        }
        if(primeNums.size()==0) primeNums.add(number);
       return primeNums;
    }
}


