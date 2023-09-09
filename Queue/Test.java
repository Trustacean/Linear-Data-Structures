package Queue;

public class Test {
    public static void main(String[] args) {
        Queue antrian = new Queue(7);
        antrian.enqueue(26);
        antrian.enqueue(15);
        antrian.enqueue(8);
        antrian.enqueue(14);
        System.out.println(antrian.dequeue());
        System.out.println(antrian.dequeue());
        System.out.println(antrian.dequeue());
        System.out.println(antrian.dequeue());
        System.out.println(antrian.dequeue());
    }
}
