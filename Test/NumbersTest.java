/**
 * Created by employee on 11/4/16.
 */
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class NumbersTest {
    @Test
    public final void whenNumberIsZeroThenRuntimeExceptionIsThrown() {
        assertThat( Numbers.getNumbers(0),contains(0));
    }
    @Test
    public final void whenNumberIsOneThenRuntimeExceptionIsThrown() {
        assertThat( Numbers.getNumbers(1),contains(1));
    }
    @Test
    public final void whenNumberThenRuntimeExceptionIsThrown() {
        assertThat( Numbers.getNumbers(2*3*5*7*11*13*17),contains(2, 3, 5, 7, 11, 13, 17));
    }
}
