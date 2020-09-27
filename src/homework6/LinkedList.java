package homework6;

public class LinkedList <E> implements List<E>{
    private static class Node<E>{
        public Node <E> previous;
        public E value;
        public Node <E> next;
    }
    private Node<E> first=null;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E item) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(E item) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void clear() {

    }
}
