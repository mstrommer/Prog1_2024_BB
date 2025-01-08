package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Generics <V>{
    public static <T> List<T> foo(T item){
        List<T> list = new ArrayList<>();
        list.add(item);
        return list;
    }

    public static <T extends Predicate<V>, V> boolean foo(T predicate, V value){
        return predicate.test(value);
    }

    public void printV(V item){
        System.out.println(item);
    }
}
