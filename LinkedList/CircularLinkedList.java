package LinkedList;

class  CircularLinkedList {
    private Node head;
    private int size;
    private String name;

    CircularLinkedList() {
        this.head = new Node();
        this.head.setNext(head);
        this.head.setPrev(head);
        this.size = 0;
    }

    // private int remove(Node node) {
    //     Node newPrev = node.getPrev();
    //     Node newNext = node.getNext();
    //     newPrev.setNext(newNext);
    //     newNext.setPrev(newPrev);
    //     return node.getData();
    // }

    private void addBefore(int element, Node node) {
        Node NewNode = new Node(element);
        node.getPrev().setNext(NewNode);
        NewNode.setPrev(node.getPrev());
        NewNode.setNext(node);
        node.setPrev(NewNode);
        size++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addFirst(int element) {
        addBefore(element, head.getNext());
    }

    public void addLast(int element) {
        addBefore(element, head);
    }

    @Override
    public String toString() {
        String returnVal="[";
        Node temp = head.getNext();
        while (true) {
            if (temp.getNext()==head) {
                returnVal += temp.getData()+"]";
                break;
            } else{
                returnVal += temp.getData() + "] [";
                temp = temp.getNext();
            }
        }
        return returnVal + " size=" + size;
    }
}

class Node {
    private int data;
    private Node next;
    private Node prev;

    Node() {
        
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node right) {

    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node right) {
        this.next = right;
    }

    public Node getNext() {
        return this.next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getPrev() {
        return prev;
    }

    @Override
    public String toString() {
        return ""+data;
    }
}
