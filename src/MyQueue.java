public class MyQueue<T>{

    private final MyStack<T> inStack = new MyStack<>();
    private final MyStack<T> outStack = new MyStack<>();

    public void enqueue(T item){
        inStack.push(item);
    }

    public T dequeue(){
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        if(outStack.isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return outStack.pop();
    }

    public T peek(){
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        if(outStack.isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return outStack.peek();
    }
    public boolean isEmpty(){
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
