import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 */
public class ParallelStream {


    @Test
    public void testParallel() {

        Variable t = new Variable();
        new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")).parallelStream().peek(a -> t.add(1)).count();
        System.out.println(t.getI());
    }

    class Variable {
        Integer i = 0;

        Integer getI() {
            return i;
        }

        void add(int a) {
            i+= a;
        }
    }
}
