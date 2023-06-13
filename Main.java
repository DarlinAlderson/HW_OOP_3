/*
Задание 2.
Реализовать любой выбранный интерфейс из списка 
(Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>).
*/

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListOfDog listDogs = new ListOfDog();
        listDogs.setListDogs(Arrays.asList(
                new Dog("Baily"),
                new Dog("Rick"),
                new Dog("Marty")));
        System.out.println("--------Sorting by Iterator--------");
        Iterator<Dog> iter = listDogs.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("\n--------Sorting by Class ComparableOfDog--------");
        listDogs.getListDogs().sort(new ComparableOfDog());
        for (Dog dog : listDogs) {
            System.out.println(dog);
        }
    }
}
