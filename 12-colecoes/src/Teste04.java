import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Teste04 {
    public static void main(String[] args) {
        Integer[] x = {2, 3, 6,1 };
        //ist<Integer> a  = ArrayList.asList(x);
        Stream<Integer> s = Stream.of(x);
        System.out.println(s.filter());
    }

}
