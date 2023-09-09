package Queue;

import java.util.NoSuchElementException;

public class Challange {
    private int[] array;
    private int size;
    private int front;
    private int rear;
    private int count;

    Challange() {
        this.array = new int[100];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        this.count = 1;
    }

    public boolean enqueue() {
        if (size == this.array.length) {
            return false;
        } else {
            this.array[this.rear] = this.count;
            this.count++;
            this.rear++;
            if (this.rear == this.array.length) {
                this.rear = 0;
            }
            this.size++;
            return true;
        }

    }

    public int dequeue() {
        if (this.size == 0) {
            throw new NoSuchElementException();
        } else {
            int element = this.array[front];
            this.array[this.front] = 0;
            this.front++;
            if (this.front == this.array.length) {
                this.front = 0;
            }
            this.size--;
            return element;
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        } else {
            return false;
        }    
    }

    public int getRear() {
        return this.rear;
    }

    public int getFront() {
        return this.front;
    }
}
