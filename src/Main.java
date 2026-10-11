//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // PART 1:LinkedList
MyLinkedList<Integer> list = new MyLinkedList<>();

    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addLast(50);


    System.out.println("Original list:");
    list.display();

    System.out.println("Size:" + list.size());

    System.out.println("Element at index 2:" + list.get(2));

    System.out.println("Middle element:" + list.findMiddle());

    System.out.println("Removed data:" + list.removeFirst());

    System.out.println("After removing first:" );
    list.display();

    list.reverse();

    System.out.println("After reversing list:");
    list.display();

    list.addFirst(80);
    System.out.println("After adding 80 at the beginning:" );
    list.display();

    System.out.println("The updated size:" + list.size());
    list.addLast(100);
    System.out.println("After adding 100 at the ending:" );
    list.display();

    System.out.println("The final size:" + list.size());

    // PART 2:Stack and Queue

    System.out.println("------- STACK TEST---------");

    MyStack<Integer> stack = new MyStack<>();

    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println("Top element:" + stack.peek());
    System.out.println("Removed:" + stack.pop());
    System.out.println("New top:" + stack.peek());

    System.out.println("\n--------QUEUE TEST----------");

    MyQueue<String> queue = new MyQueue<>();

    queue.enqueue("Divine");
    queue.enqueue("Alice");
    queue.enqueue("Mico");

    System.out.println("Front element:" + queue.peek());
    System.out.println("Served:" + queue.dequeue());
    System.out.println("New front:" + queue.peek());
    System.out.println("Is empty?:" + queue.isEmpty());


    System.out.println("\n----BALANCED BRACKETS TEST____");

    System.out.println("{[()]}:" + BalancedBrackets.isBalanced("{[()]}"));
    System.out.println("([)]:" + BalancedBrackets.isBalanced("([)]"));
    System.out.println("Empty expression:" + BalancedBrackets.isBalanced(""));

    //PART 3:Arrays and Strings.
    System.out.println("\n------ARRAYS AND STRINGS------");

    int[] numbers={1,2,3,4,5};
    ArrayString.rotateRight(numbers,2);
    System.out.println("Rotated: " + Arrays.toString(numbers));

    System.out.println("Anagram: " +ArrayString.isAnagram("listen", "silent"));

    int[] indices = ArrayString.twoSumSorted(new int[]{1,2,4,6,8},10);

    System.out.println("Two-sum indices: "+Arrays.toString(indices));


    //PART 4: LRU Cache
    System.out.println("\n----LRU CACHE----");
    LRUCache<Integer, String> cache = new LRUCache<>(2);
    cache.put(1,"David");
    cache.put(2,"Jado");

    System.out.println("Key 1:" +cache.get(1));

    cache.put(3,"Abigael");
    System.out.println("Key 2:" + cache.get(2));
    System.out.println("Key 3:" + cache.get(3));


}
