public class RotateLinkedList {
    public static Node rotateRight(Node head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        Node oldTail = head;
        int n = 1;
        while(oldTail.next != null) {
            oldTail = oldTail.next;
            n++;
        }
        oldTail.next = head; // make it circular
        k = k % n;
        int stepsToNewHead = n - k;
        Node newTail = head;
        for(int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }
        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }

    public static void printList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        head = rotateRight(head, 2);
        System.out.println("Rotated List by 2:");
        printList(head);
    }
}
