public class MyArrayList<E> {
    E[] elementData;
    int size = 0;
    int capacity = 10;

    MyArrayList() {
        elementData = (E[]) new Object[10];
    }

    MyArrayList(int capacity) {
        this.capacity = capacity;
        elementData = (E[]) new Object[capacity];
    }

    public void add(E value) {
        ensureCapacity(size + 1);
        elementData[size++] = value;
    }

    public void add(E value, int index) {
        ensureCapacity(size + 1);
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = value;
        size++;
    }

    public void ensureCapacity(int size) {
        if (size > this.capacity) {
            capacity = (this.capacity * 3) / 2 + 1;
            E[] oldData = elementData;
            elementData = (E[]) new Object[capacity];
            System.arraycopy(oldData, 0, elementData, 0, this.size);
        }
    }

    void remove(int index) {
        int numMoved = size - index - 1;
        System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        elementData[--size] = null;
    }

    public int indexOf(E value) {
        int res = 0;
        for (int i = 0; i < capacity; i++) {
            if (elementData[i] == value) {
                res = i;
                System.out.println("Index is: " + res);
            }
        }
        return res;
    }

    public E get(int index) {
        return elementData[index];
    }

    public void set(int index, E value) {
        elementData[index] = value;
    }
}
