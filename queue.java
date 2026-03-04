// Queue full concept notes:
// 1. A queue is a linear data structure that follows the First In First Out (FIFO) principle, where the first element added to the queue is the first one to be removed.
// 2. A queue typically supports two main operations: enqueue (adding an element to the rear of the queue) and dequeue (removing an element from the front of the queue).
// 3. Queues can be implemented using arrays, linked lists, or circular buffers.
// 4. In an array-based implementation, a fixed-size array is used to store the elements of the queue, and two pointers (front and rear) are maintained to keep track of the positions for enqueueing and dequeueing.
// 5. Eg in real life : A line of people waiting to buy tickets at a movie theater is an example of a queue. The first person in line is the first one to get the ticket, and new people join the end of the line.

class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
    }

    // Method to add an element to the rear of the queue
    public void enqueue(int value) {
        if (rear < maxSize - 1) {
            rear++;
            queueArray[rear] = value;
        } else {
            System.out.println("Queue is full. Cannot enqueue " + value);
        }
    }

    // Method to remove an element from the front of the queue
    public int dequeue() {
        if (front <= rear) {
            int value = queueArray[front];
            front++;
            return value;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return -1 to indicate that the queue is empty
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }
}

class circularQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public circularQueue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
    }

    // Method to add an element to the rear of the circular queue
    public void enqueue(int value) {
        if ((rear + 1) % maxSize == front) {
            System.out.println("Circular Queue is full. Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
        }
    }

    // Method to remove an element from the front of the circular queue
    public int dequeue() {
        if (front == (rear + 1) % maxSize) {
            System.out.println("Circular Queue is empty. Cannot dequeue.");
            return -1; // Return -1 to indicate that the circular queue is empty
        } else {
            int value = queueArray[front];
            front = (front + 1) % maxSize;
            return value;
        }
    }

    // Method to check if the circular queue is empty
    public boolean isEmpty() {
        return front == (rear + 1) % maxSize;
    }

    // Method to check if the circular queue is full
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty.");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(queueArray[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % maxSize;
        }
        System.out.println();
    }
}