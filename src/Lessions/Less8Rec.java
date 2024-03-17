package Lessions;

import java.util.Scanner;

public class Less8Rec {
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
        createTail(node0);
        toSting(node0);
    }
    public static void createHead(Node ref){
        Scanner scan = new Scanner(System.in);
        if(ref==null){
            return;
        }
        else{
            System.out.println("Введите число: ");
            ref.value = scan.nextInt();
            createHead(ref.next);
        }
        return;
    }
    public static void createTail(Node ref){
        Scanner scan = new Scanner(System.in);
        if(ref==null){
            return;
        }
        else{
            createHead(ref.next);
            System.out.println("Введите число: ");
            ref.value = scan.nextInt();
        }
        return;
    }
    public static void toSting(Node ref){
        if (ref==null){
            return;
        }
        else{
            System.out.println("число: "+ref.value);
            toSting(ref.next);
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
