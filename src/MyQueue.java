public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public void enqueue(int element) {
        if (isQueueFull()) throw new StackOverflowError("Queue is full");
        else {
            tail++;
            if (tail == capacity-1) tail = 0;
            queueArr[tail] = element;
            currentSize ++;
            System.out.println("Element " + element + " is added to Queue");
        }
    }

    public void dequeue() {
        if (isQueueEmpty())
            System.out.println("Underflow ! Unable to remove element from Queue");
        else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            currentSize--;
        }
    }

    boolean isQueueFull() {
        return (currentSize == capacity);
    }

    boolean isQueueEmpty() {
        return (currentSize == 0);
    }
}