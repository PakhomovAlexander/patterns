import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyList implements Iterable<String> {
    public String elems[] = {"name1", "name2", "name3", "name4"};

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        throw new NotImplementedException();
    }

    @Override
    public Spliterator<String> spliterator() {
        throw new NotImplementedException();
    }

    private class MyIterator implements Iterator<String> {
        int index;

        @Override
        public boolean hasNext() {
            if (index < elems.length) {
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                return elems[index++];
            }
            return null;
        }
    }
}

