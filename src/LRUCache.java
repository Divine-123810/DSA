import java.util.Map;
import java.util.HashMap;

public class LRUCache<K, V>{

    private static class Node<K, V>{
        K key;
        V value;
        Node<K,V> prev;
        Node<K,V> next;

        Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<K, Node<K, V>> map = new HashMap<>();


    private final Node<K, V> head = new Node<>(null, null);
    private final Node<K, V> tail = new Node<>(null, null);

    public LRUCache(int capacity){
        if(capacity <= 0){
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.capacity = capacity;
        head.next = tail;
        tail. prev = head;
    }

    public V get(K key){
        Node<K, V> node = map.get(key);

        if(node == null){
            return null;
        }
        moveToFront(node);
        return node.value;
    }

    public void put(K key , V value){
        Node<K, V> node = map.get(key);

        if(node != null){
            node.value = value;
            moveToFront(node);
            return;
        }

        if(map.size() == capacity){
            Node<K ,V> leastRecent = tail.prev;
            removeNode(leastRecent);
            map.remove(leastRecent.key);
        }

        Node<K, V> newNode = new Node<>(key, value);
        addToFront(newNode);
        map.put(key,newNode);
    }
    private void addToFront(Node<K, V> node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    private void removeNode(Node<K, V> node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToFront(Node<K, V> node){
        removeNode(node);
        addToFront(node);
    }
}
