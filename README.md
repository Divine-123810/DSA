# Week 3: Data Structures and Algorithms I

## Complexity Report

### Part 1: Custom Singly Linked List

| Method          | Time | Space |
| --------------- | ---- | ----- |
| `addFirst()`    | O(1) | O(1)  |
| `addLast()`     | O(1) | O(1)  |
| `removeFirst()` | O(1) | O(1)  |
| `get()`         | O(n) | O(1)  |
| `size()`        | O(1) | O(1)  |
| `reverse()`     | O(n) | O(1)  |
| `findMiddle()`  | O(n) | O(1)  |
| `display()`     | O(n) | O(1)  |

**Backend use:** Linked lists manage changing sequences of records and support other data structures.

### Part 2: Stack and Queue

| Method           | Time                       | Space              |
| ---------------- | -------------------------- | ------------------ |
| `push()`         | O(1)                       | O(1)               |
| `pop()`          | O(1)                       | O(1)               |
| `peek()` (stack) | O(1)                       | O(1)               |
| `isEmpty()`      | O(1)                       | O(1)               |
| `enqueue()`      | O(1)                       | O(1)               |
| `dequeue()`      | O(n) worst, O(1) amortized | O(1) per operation |
| `peek()` (queue) | O(n) worst, O(1) amortized | O(1) per operation |
| `isBalanced()`   | O(n)                       | O(n)               |

**Backend use:** Stacks support undo history and expression parsing, while queues schedule background jobs and requests.

### Part 3: Arrays and Strings

| Method             | Time | Space |
| ------------------ | ---- | ----- |
| `rotateRight()`    | O(n) | O(1)  |
| `reverse()` helper | O(n) | O(1)  |
| `isAnagram()`      | O(n) | O(1)  |
| `twoSumSorted()`   | O(n) | O(1)  |

**Backend use:** Arrays and strings support indexed data processing, text comparison, and efficient searching.

### Part 4: LRU Cache

| Method      | Time          | Space          |
| ----------- | ------------- | -------------- |
| Constructor | O(1)          | O(1) initially |
| `get()`     | O(1) expected | O(1)           |
| `put()`     | O(1) expected | O(1) per entry |

Total cache storage: **O(capacity)**.

**Backend use:** LRU caches retain recently accessed data in memory, reducing repeated database queries and service calls.

### Conclusion

This project demonstrates custom data structures, algorithm implementation, and complexity analysis for efficient backend processing, scheduling, and caching.
