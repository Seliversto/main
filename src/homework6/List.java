package homework6;

public interface List <E>{
    int size();
    void add(E item);
    void remove(int index);
    void remove(E item);
    E get(int index);
    void clear();
}
