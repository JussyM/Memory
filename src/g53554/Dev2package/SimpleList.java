package g53554.Dev2package;

/**
 *
 * @author jussy
 */
public interface SimpleList {
    public int size();
    public boolean isEmpty();
    public boolean add(E e);
    public boolean remove(Object o);
    public void clear();
    public E get(int index);
    public E set(int index,E element);
    public E remove(int index);
    public int indexOf(Object o);

    public static class E {

        public E() {
        }
    }
    
    
    
}
