package Queue;

import java.util.NoSuchElementException;

public class Queue {
    private int[] array;
    private int size;
    private int front;
    private int rear;

    Queue() {
        this.array = new int[10];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    Queue(int amount) {
        this.array = new int[amount];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public boolean enqueue(int element) {
        if (size == this.array.length) {
            return false;
        } else {
            this.array[this.rear] = element;
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

    public void printQueue() {
        System.out.print("Out <= ");
        for (int i = 0, j = 0 ; i < this.size; i++) {
            if (this.front+i>=this.array.length) {
                System.out.print(this.array[j] + " ");
                j++;
            } else {
                System.out.print(this.array[this.front+i] + " ");
            }
        }    
        System.out.print("<= In\n");
    }

}
