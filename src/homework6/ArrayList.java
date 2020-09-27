package homework6;

public class ArrayList <E> implements List<E>{

//    private E[] array =  (E[]) {"R", "ss", "uf"};
    private E[] array =  (E[]) new Object[0];

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void add(E item) {
        E[] tempArray =  (E[]) new Object[size()+1];
        for (int i=0; i< array.length; i++) {
            tempArray[i]=array[i];
        }
        tempArray[size()] = item;
        array = tempArray;
    }

    @Override
    public void remove(int index) {
        E[] tempArray =  (E[]) new Object[size()-1];
        for (int i=0; i< index; i++) {
            tempArray[i]=array[i];
        }

        for (int i=index; i< tempArray.length; i++) {
            tempArray[i] = array[i+1];
        }
        array = tempArray;
    }

    @Override
    public void remove(E item) {
        E[] tempArray =  (E[]) new Object[size()-1];
        int index = 0;
        for (; item!=array[index]; index++) {
            tempArray[index]=array[index];
        }

        for (int i=index; i< tempArray.length; i++) {
            tempArray[i] = array[i+1];
        }
        array = tempArray;
    }

    @Override
    public E get(int index) {
        return array[index];
    }

    @Override
    public void clear() {
        array = (E[]) new Object[0];
    }
}