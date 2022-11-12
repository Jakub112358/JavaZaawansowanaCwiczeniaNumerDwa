package Task7;

import java.util.LinkedList;
import java.util.Random;

public class ModifiedLinkedList<T> extends LinkedList<T> {
    @Override
    public boolean add(T t) {
        Random rnd = new Random();
        super.add(rnd.nextInt(super.size()+1),t);
        return true;
    }

    @Override
    public T get(int index) {
        Random rnd = new Random();
        return super.get(rnd.nextInt(index+1));
    }
}

