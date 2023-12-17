import java.util.HashMap;
import java.util.Set;

import java.util.Map.Entry;

import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings("unchecked")

public class MySet<type> implements Set<type>
{
    private int current_key = 0;
    private HashMap<Integer, type> inventory = new HashMap<Integer, type>();

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
    public boolean add(type input) 
    {
        inventory.put(current_key++, input);
        return true;
    }

    @Override
    public boolean remove(Object o) 
    {
        return false;
    }

    @Override
    public boolean addAll(Collection c) 
    {
        try 
        {
            for(Object i: c) add((type) i);
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
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

    @Override
    public String toString() 
    {
        String for_return = "";

        for_return += ("value = " + inventory.get(0));
        for_return += ("value = " + inventory.get(1));
        for_return += ("value = " + inventory.get(2));

        return for_return;
    }
}