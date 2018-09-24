import java.util.function.Function;

/**
 * @author <a href="mailto:brent.n.douglas@gmail.com">Brent Douglas</a>
 */
public class Main {

    public static void main(final String... args) {
        thing((Integer it) -> "");
    }

    interface X1 extends Function<Integer, String> {}
    interface X2 extends Function<Short, String> {}

    static void thing(final X1 x) {}
    static void thing(final X2 x) {}
}
