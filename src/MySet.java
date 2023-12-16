import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;

public class MySet<type> implements Set<type>
{
    private HashMap<type, Integer> inventory = new HashMap<type, Integer>();
    @Override
    public int size()
    {
        return inventory.size();
    }

    @Override
    public boolean isEmpty()
    {
        return inventory.isEmpty();
    }

    @Override
    public boolean contains(Object o)
    {
        return inventory.containsValue(o);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c)
    {
        boolean for_return = true;

        for(Object i: c)
        {
            for_return = (for_return && inventory.containsValue(i));

            if(!for_return) break;
        }

        return for_return;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}