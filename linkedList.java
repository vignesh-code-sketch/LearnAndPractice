// LinkedList Full concept notes:
// 1. A linked list is a linear data structure where each element (called a node) contains a value and a reference (or link) to the next node in the sequence.
// 2. The first node is called the head, and the last node is called the tail, which points to null.
// 3. Linked lists can be singly linked (where each node points to the next node) or doubly linked (where each node points to both the next and previous nodes).
// 4. Linked lists are dynamic in size, meaning they can grow or shrink as needed, unlike arrays which have a fixed size.
// 5. Common operations on linked lists include insertion, deletion, traversal, and searching for elements.
// 6. Insertion can be done at the beginning, end, or any specific position in the linked list.
// 7. Deletion can also be performed at the beginning, end, or any specific position in the linked list.
// 8. Traversal involves visiting each node in the linked list to perform some operation, such as printing the values or calculating the length of the list.
// 9. The time complexity for insertion and deletion in a linked list is O(1) if the position is known, but O(n) if we need to search for the position first. Traversal has a time complexity of O(n).
// 10. The space complexity of a linked list is O(n) because it requires additional memory for storing the references (links) along with the values in each node.
// 11. Linked lists are often used in scenarios where dynamic memory allocation is required, such as implementing stacks, queues, and other data structures.
// 12. Example use cases for linked lists include managing a list of tasks, implementing a playlist of songs, or creating a chain of nodes in a graph or tree data structure.


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public Node getHead(){
        return this.head;
    }

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
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

    // Method to delete a node with a specific value
    public void delete(int key) {
        Node current = head, previous = null;

        // If head node itself holds the key to be deleted
        if (current != null && current.data == key) {
            head = current.next; // Change head
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        // If key was not present in linked list
        if (current == null) return;

        // Unlink the node from linked list
        previous.next = current.next;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void insertAt(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAt(int position) {
        if (head == null) return;

        Node current = head;

        if (position == 0) {
            head = current.next; // Change head
            return;
        }

        Node previous = null;
        for (int i = 0; current != null && i < position; i++) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        previous.next = current.next; // Unlink the node from linked list
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


}