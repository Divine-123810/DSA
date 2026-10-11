public class MyLinkedList<T> {
    private static class Node<T>{
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
// using O(1) , because we don't want to visit every node
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public void addLast(T data){
        Node<T> newNode = new Node<>(data);
        // we also used tail in order to reach out to last node without traversing into the list, also there is implementation of O(1),
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T removeFirst(){
        if( head == null){
            throw new IllegalStateException("List is empty");
        }

        T removedData = head.data;
        head = head.next;
        size--;

        if(head == null){
            tail = null;
        }
        return removedData;
    }

    public T get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node<T> current = head;

        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    public int size(){
        return size;
    }

    public void reverse(){
        Node<T> previous = null;
        Node<T> current = head;

        tail = head;
//we used O(n) because we visit each node once- time complexity,also use O(1) for space complexity.
        while(current != null){
            Node<T> nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        head = previous;
    }

    public T findMiddle(){
        if(head == null){
            throw new IllegalStateException("List is empty");
        }
        // we used O(n) for time complexity
        Node<T> slow = head;
        Node<T> fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
  public void display(){
        Node<T> current = head ;

        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
  }

}
