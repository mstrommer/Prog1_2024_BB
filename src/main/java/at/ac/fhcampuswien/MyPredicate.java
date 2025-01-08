package at.ac.fhcampuswien;

import java.util.function.Predicate;

public class MyPredicate <T> implements Predicate<T> {
    @Override
    public boolean test(T t) {
        return t.equals("Hello World!");
    }
}
