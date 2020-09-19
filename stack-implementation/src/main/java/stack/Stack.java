package stack;

import java.util.ArrayList;
import java.util.List;

public class  Stack<T> {

    public List<T> myList = new ArrayList<>();

    public void push(T item) {
        myList.add(item);
    }

    public int count() {
        return myList.size();
    }

    public T pop() {

        if (count() < 1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return myList.remove(count() - 1);
    }

    public T peek() {
        return myList.get(count() - 1);
    }
}
