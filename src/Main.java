//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
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
}
