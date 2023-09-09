package Stack;

public class Stack {
    private int [] elemen;
    private int front;
    private int size;

    Stack() {
        this.front=-1;
        elemen = new int[10];
    }

    Stack(int ukuran) {
        this.front=-1;
        elemen = new int[ukuran];
    }

    public boolean push(int nilai) {
        if (front == elemen.length-1) {
            return false;
        } else {
            this.front++;
            this.size=this.front+1;
            this.elemen[front]=nilai;
            return true;
        }
    }

    public int pop() {
        this.front--;
        if (front == -1) {
            return -1;
        } else {
            int temp = elemen[this.front+1];
            elemen[this.front+1]=0;
            this.size=this.front+1;
            return temp;
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

    public String toString() {
        String returnValue = "[ ";
        for (int i=0; i<size ; i++) {
            returnValue += elemen[i] + " ";
        }
        returnValue += "]";
        return returnValue;
    }
}
