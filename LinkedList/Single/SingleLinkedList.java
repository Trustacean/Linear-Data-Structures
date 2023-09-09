package LinkedList.Single;

class SingleLinkedList {
    private Node head;
    private Node tail;
    public String name;

    SingleLinkedList() {
        head = null;
        tail = null;
    }

    SingleLinkedList(String name) {
        this.name = name;
        head = null;
        tail = null;
    }

    public void addHead(int value) {
        if (isEmpty()) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
        } else {
            Node newNode = new Node(value);
            newNode.setRight(head);
            head = newNode;
        }

    }

    public void addTail(int value) {
        if (isEmpty()) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
        } else {
            Node newNode = new Node(value);
            tail.setRight(newNode);
            tail = newNode;
        }
    }

    public Node removeHead() {
        if (head == tail) {
            Node returnTail = head;
            tail = head = null;
            return returnTail;
        } else {
            Node returnNode = head;
            head = head.getRight();
            return returnNode;
        }
    }

    public Node removeTail() {
        if (head == tail) {
            Node returnTail = head;
            tail = head = null;
            return returnTail;
        } else {
            Node returnTail = head;
            while (returnTail.getRight() != tail) {
                returnTail = returnTail.getRight();
            }
            tail = returnTail;
            returnTail = returnTail.getRight();
            tail.setRight(null);
            return returnTail;
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int ambil(int index) {
        int indexCounter = 0;
        Node temp = head;
        while (temp != null) {
            if (indexCounter == index) {
                return temp.getData();
            } 
            indexCounter++;
            temp = temp.getRight();
        }
        System.out.println("Index Out Of Bounds");
        return -1;
        
    }

    public String toString() {
        String returnVal="[";
        Node temp = head;
        while (temp != null) {
                if (tail == head) {
                    returnVal += temp.getData() + "]";
                    temp = temp.getRight();
                }
                else if (temp == tail) {
                    returnVal += temp.getData() + "]";
                    temp = temp.getRight();
                } else {
                    returnVal += temp.getData() + "] [";
                    temp = temp.getRight();
                }
        }
        return returnVal;
    }
}

class Node {
    private int data;
    private Node right;

    Node(int data) {
        this.data = data;
        right = null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public String toString() {
        return ""+data;
    }
}
