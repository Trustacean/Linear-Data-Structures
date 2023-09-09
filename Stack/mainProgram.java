package Stack;

public class mainProgram {
    public static void main(String[] args) {
        Stack s = new Stack(10);

        s.push(25); 
        s.push(45);
        s.push(56);
        System.out.println("Ukuran : " + s.size() + " => " + s.toString());
        if (s.pop()==-1) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("ukuran : " + s.size() + " => " + s.toString());
        }

        
        if (s.isEmpty()) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("ukuran : " + s.size() + " => " + s.toString());
        }

        s.push(56);
        if (s.pop()==-1) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("ukuran : " + s.size() + " => " + s.toString());
        }

        if (s.pop()==-1) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("ukuran : " + s.size() + " => " + s.toString());
        }
    }
}
