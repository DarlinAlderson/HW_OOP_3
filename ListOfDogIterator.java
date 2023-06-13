import java.util.Iterator;
import java.util.List;

public class ListOfDogIterator implements Iterator<Dog> {
    private List<Dog> listOfDogIterable;
    private static int count;

    public ListOfDogIterator(List<Dog> listOfDogIterable) {
        this.listOfDogIterable = listOfDogIterable;
        count = 0;
    }

    public static void setCount(int count) {
        ListOfDogIterator.count = count;
    }

    @Override
    public boolean hasNext() {
        return count < listOfDogIterable.size();
    }

    @Override
    public Dog next() {
        return listOfDogIterable.get(count++);
    }
}
