import java.util.Scanner;

public class LL {

    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

  
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

   
    public void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {

            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    
    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LL list = new LL();

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter sorted elements:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.addLast(value);
        }

        System.out.println("Original linked list:");
        list.printList();

        list.removeDuplicates();

        System.out.println("After removing duplicates:");
        list.printList();

        sc.close();
    }
}