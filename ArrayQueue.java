public class ArrayQueue<T> implements Queue<T> {

    //private T[] arr;
    private int head;
    private int tail;
    private int size;

    public ArrayQueue() {
        T[] arr = (T []) new Object[10];
        //arr = new T[10];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(T item) {
        if (++tail == arr.length) {
            expand();
        } else {
            arr[tail++] = item;
            size++;
            if (tail >= arr.length) {
                tail = 0;
            }
        }
    }

    public T dequeue() {
        if (empty()) {
            throw new Exception();
        }
        T[] temp = (T []) new Object[head];
        //T[] temp = arr[head];
        head++;
        head = head % arr.length;
        size--;
        return temp;
    }

    public void expand() {
        T[] temp = (T []) new Object[arr.length];
        //T[] temp = new T[arr.length * 2];
        int newHead = head;
        for (int i = 0; i <= size; i++) {
            temp[i] = arr[i];
            newHead = (newHead + 1) % size;
        }
        head = -1;
        tail = size;
        arr = temp;
    }

    public boolean empty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
}
