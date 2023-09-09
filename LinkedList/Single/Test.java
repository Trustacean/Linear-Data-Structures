package LinkedList.Single;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        SingleLinkedList newList = new SingleLinkedList();
        System.out.println(newList.isEmpty());
        newList.addHead(30);
        newList.addHead(20);
        newList.addHead(10);
        newList.addTail(40);
        newList.addTail(50);
        System.out.println(newList.isEmpty());
        System.out.println(newList);
        System.out.println("==========================");
        System.out.println(newList.ambil(4));
        System.out.println(newList);
        System.out.println("==========================");
        System.out.println(newList.removeHead());
        System.out.println(newList.removeTail());

        System.out.println(newList);
    }
}
