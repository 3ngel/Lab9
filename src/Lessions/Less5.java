package Lessions;

public class Less5 {
    public static void main(String[] args){
        Node head = null;
        for(int i=9; i>=0;i--){
            head = new Node(i, head);
        }
        Less4.Node ref = head;
        while (ref!=null){
            System.out.println(" "+ref.value);
            ref = ref.next;
        }
    }
    static class Node extends Less4.Node {
        public int value;
        public Less4.Node next;
        public Node(int value, Less4.Node next){
            super(value, next);
        }
    }
}
