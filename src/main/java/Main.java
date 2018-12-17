import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
public class Main {
    private final Integer i;
    private final Supplier<Integer> supplier = () -> i;


    public static void main(String[] args) {
    }
}
