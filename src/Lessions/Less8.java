package Lessions;

import java.util.Scanner;

public class Less8 {
    public static void main(String[] args){
        Node node0 = new Node(0, null);
        Node node1 = new Node(0, null);
        Node node2 = new Node(0, null);
        Node node3 = new Node(0, null);

        node0.next=node1;
        node1.next=node2;
        node2.next=node3;
        createHead(node0);
        toSting(node0);
    }
    public static void createHead(Node ref){
        Scanner scan = new Scanner(System.in);
        while (ref!=null){
            System.out.println("Введите число: ");
            ref.value = scan.nextInt();
            ref = ref.next;
        }
        return;
    }
    public static void createTail(Node ref){

    }
    public static void toSting(Node ref){
        while (ref!=null){
            System.out.println("Число "+ref.value);
            ref = ref.next;
        }
    }

    static class Node{
        public int value;
        public Node next;
        Node(int value, Node next){
            this.value=value;
            this.next = next;
        }
    }
}
