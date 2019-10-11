public class ArrayStack<T> implements Stack<T> {

    // private T[] arr;
    private int top;

    public ArrayStack() {
        T[] arr = (T[]) new Object[10];
        // arr = new T[10];
        top = -1;
    }

    public void push(T item) {
        if (top >= arr.length - 1) {
            expand();
        }
        top++;
        arr[top] = item;
    }

    public T pop() {
        T[] temp = (T[]) new Object[top];
        // T[] temp = arr[top];
        top--;
        return temp;
    }

    public T peek() {
        return arr[top];
    }

    public void expand() {
        T[] temp = (T[]) new Object[arr.length * 2];
        // T[] temp = new T[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public boolean empty() {
        if (top == -1) {
            return true;
        }
        return false;
    }
}
