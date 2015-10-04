## collections

A collection — sometimes called a container — is simply an object that groups multiple elements into a single unit. Collections are used to store, retrieve, manipulate, and communicate aggregate data. Typically, they represent data items that form a natural group, such as a poker hand (a collection of cards), a mail folder (a collection of letters), or a telephone directory (a mapping of names to phone numbers).

### Interfaces

* The **Collection** Interface
	* A Collection represents a group of objects known as its elements. The Collection interface is used to pass around collections of objects where maximum generality is desired.
* The **Set** Interface
	* A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction. The Set interface contains only methods inherited from Collection and adds the restriction that duplicate elements are prohibited. Set also adds a stronger contract on the behavior of the equals and hashCode operations, allowing Set instances to be compared meaningfully even if their implementation types differ. Two Set instances are equal if they contain the same elements.
* The **List** Interface
	* A List is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements. In addition to the operations inherited from Collection, the List interface includes operations for the following:
		* Positional access — manipulates elements based on their numerical position in the list. This includes methods such as get, set, add, addAll, and remove.
		* Search — searches for a specified object in the list and returns its numerical position. Search methods include indexOf and lastIndexOf.
		* Iteration — extends Iterator semantics to take advantage of the list's sequential nature. The listIterator methods provide this behavior.
		* Range-view — The sublist method performs arbitrary range operations on the list.
* The **Queue** Interface
	* A Queue is a collection for holding elements prior to processing. Besides basic Collection operations, queues provide additional insertion, removal, and inspection operations. 
* The **Deque** Interface
	* Usually pronounced as deck, a deque is a double-ended-queue. A double-ended-queue is a linear collection of elements that supports the insertion and removal of elements at both end points. The Deque interface is a richer abstract data type than both Stack and Queue because it implements both stacks and queues at the same time. The Deque interface, defines methods to access the elements at both ends of the Deque instance. Methods are provided to insert, remove, and examine the elements. Predefined classes like ArrayDeque and LinkedList implement the Deque interface.
	* Insert: The addfirst and offerFirst methods insert elements at the beginning of the Deque instance. The methods addLast and offerLast insert elements at the end of the Deque instance. When the capacity of the Deque instance is restricted, the preferred methods are offerFirst and offerLast because addFirst might fail to throw an exception if it is full.
    * Remove: The removeFirst and pollFirst methods remove elements from the beginning of the Deque instance. The removeLast and pollLast methods remove elements from the end. The methods pollFirst and pollLast return null if the Deque is empty whereas the methods removeFirst and removeLast throw an exception if the Deque instance is empty.
    * Retrieve: The methods getFirst and peekFirst retrieve the first element of the Deque instance. These methods dont remove the value from the Deque instance. Similarly, the methods getLast and peekLast retrieve the last element. The methods getFirst and getLast throw an exception if the deque instance is empty whereas the methods peekFirst and peekLast return NULL.
* The **Map** Interface
	* A Map is an object that maps keys to values. A map cannot contain duplicate keys: Each key can map to at most one value. It models the mathematical function abstraction. The Map interface includes methods for basic operations (such as put, get, remove, containsKey, containsValue, size, and empty), bulk operations (such as putAll and clear), and collection views (such as keySet, entrySet, and values). The Java platform contains three general-purpose Map implementations: HashMap, TreeMap, and LinkedHashMap. 
* **Object Ordering**
	* Comparable implementations provide a natural ordering for a class, which allows objects of that class to be sorted automatically.
* The **SortedSet** Interface
	* A SortedSet is a Set that maintains its elements in ascending order, sorted according to the elements' natural ordering or according to a Comparator provided at SortedSet creation time. In addition to the normal Set operations, the SortedSet interface provides operations for the following:
		* Range view — allows arbitrary range operations on the sorted set
		* Endpoints — returns the first or last element in the sorted set
		* Comparator access — returns the Comparator, if any, used to sort the set
* The **SortedMap** Interface
	* A SortedMap is a Map that maintains its entries in ascending order, sorted according to the keys' natural ordering, or according to a Comparator provided at the time of the SortedMap creation. The SortedMap interface provides operations for normal Map operations and for the following:
		*Range view — performs arbitrary range operations on the sorted map
		* Endpoints — returns the first or the last key in the sorted map
		* Comparator access — returns the Comparator, if any, used to sort the map

### Implementations

* `General-purpose implementations` are the most commonly used implementations, designed for everyday use. They are summarized in the table titled General-purpose-implementations.
* `Special-purpose implementations` are designed for use in special situations and display nonstandard performance characteristics, usage restrictions, or behavior.
* `Concurrent implementations` are designed to support high concurrency, typically at the expense of single-threaded performance. These implementations are part of the java.util.concurrent package.
* `Wrapper implementations` are used in combination with other types of implementations, often the general-purpose ones, to provide added or restricted functionality.
* `Convenience implementations` are mini-implementations, typically made available via static factory methods, that provide convenient, efficient alternatives to general-purpose implementations for special collections (for example, singleton sets).
* `Abstract implementations` are skeletal implementations that facilitate the construction of custom implementations — described later in the Custom Collection Implementations section. An advanced topic, it's not particularly difficult, but relatively few people will need to do it.
* **Set Implementations**
	* General-purpose set implementations
		* There are three general-purpose Set implementations — **HashSet**, **TreeSet**, and **LinkedHashSet**. Which of these three to use is generally straightforward. 
		* HashSet is much faster than TreeSet (constant-time versus log-time for most operations) but offers no ordering guarantees. If you need to use the operations in the SortedSet interface, or if value-ordered iteration is required, use TreeSet; otherwise, use HashSet. It's a fair bet that you'll end up using HashSet most of the time. 
		* LinkedHashSet is in some sense intermediate between HashSet and TreeSet. Implemented as a hash table with a linked list running through it, it provides insertion-ordered iteration (least recently inserted to most recently) and runs nearly as fast as HashSet. The LinkedHashSet implementation spares its clients from the unspecified, generally chaotic ordering provided by HashSet without incurring the increased cost associated with TreeSet.
	* Special-purpose set implementations
		* There are two special-purpose Set implementations — **EnumSet** and **CopyOnWriteArraySet**.
		* EnumSet is a high-performance Set implementation for enum types. All of the members of an enum set must be of the same enum type. Internally, it is represented by a bit-vector, typically a single long. Enum sets support iteration over ranges of enum types. For example, given the enum declaration for the days of the week, you can iterate over the weekdays. The EnumSet class provides a static factory that makes it easy.
		* CopyOnWriteArraySet is a Set implementation backed up by a copy-on-write array. All mutative operations, such as add, set, and remove, are implemented by making a new copy of the array; no locking is ever required. Even iteration may safely proceed concurrently with element insertion and deletion. Unlike most Set implementations, the add, remove, and contains methods require time proportional to the size of the set. This implementation is only appropriate for sets that are rarely modified but frequently iterated. It is well suited to maintaining event-handler lists that must prevent duplicates.
* **List Implementations**
	* General-purpose list implementations
		* There are two general-purpose List implementations — **ArrayList** and **LinkedList**. 
		* Most of the time, you'll probably use ArrayList, which offers constant-time positional access and is just plain fast. It does not have to allocate a node object for each element in the List, and it can take advantage of System.arraycopy when it has to move multiple elements at the same time. Think of ArrayList as Vector without the synchronization overhead.
		* If you frequently add elements to the beginning of the List or iterate over the List to delete elements from its interior, you should consider using LinkedList. These operations require constant-time in a LinkedList and linear-time in an ArrayList. But you pay a big price in performance. Positional access requires linear-time in a LinkedList and constant-time in an ArrayList. Furthermore, the constant factor for LinkedList is much worse. If you think you want to use a LinkedList, measure the performance of your application with both LinkedList and ArrayList before making your choice; ArrayList is usually faster.
	* Special-purpose list implementations
		* **CopyOnWriteArrayList** is a List implementation backed up by a copy-on-write array. This implementation is similar in nature to CopyOnWriteArraySet. No synchronization is necessary, even during iteration, and iterators are guaranteed never to throw ConcurrentModificationException. This implementation is well suited to maintaining event-handler lists, in which change is infrequent, and traversal is frequent and potentially time-consuming.
* **Map Implementations**
	* General-purpose map implementations
		* The three general-purpose Map implementations are **HashMap**, **TreeMap** and **LinkedHashMap**. 
		* If you need SortedMap operations or key-ordered Collection-view iteration, use TreeMap; if you want maximum speed and don't care about iteration order, use HashMap; if you want near-HashMap performance and insertion-order iteration, use LinkedHashMap. 
	* Special-purpose map implementations
		* There are three special-purpose Map implementations — **EnumMap**, **WeakHashMap** and **IdentityHashMap**. 
		* EnumMap, which is internally implemented as an array, is a high-performance Map implementation for use with enum keys. This implementation combines the richness and safety of the Map interface with a speed approaching that of an array. If you want to map an enum to a value, you should always use an EnumMap in preference to an array.
		* WeakHashMap is an implementation of the Map interface that stores only weak references to its keys. Storing only weak references allows a key-value pair to be garbage-collected when its key is no longer referenced outside of the WeakHashMap. This class provides the easiest way to harness the power of weak references. It is useful for implementing "registry-like" data structures, where the utility of an entry vanishes when its key is no longer reachable by any thread.
		* IdentityHashMap is an identity-based Map implementation based on a hash table. This class is useful for topology-preserving object graph transformations, such as serialization or deep-copying. To perform such transformations, you need to maintain an identity-based "node table" that keeps track of which objects have already been seen. Identity-based maps are also used to maintain object-to-meta-information mappings in dynamic debuggers and similar systems. Finally, identity-based maps are useful in thwarting "spoof attacks" that are a result of intentionally perverse equals methods because IdentityHashMap never invokes the equals method on its keys. An added benefit of this implementation is that it is fast.
	* Concurrent map implementations
		* The java.util.concurrent package contains the **ConcurrentMap** interface, which extends Map with atomic putIfAbsent, remove, and replace methods, and the ConcurrentHashMap implementation of that interface.
* **Queue Implementations**
	* General-purpose queue implementations
		* **LinkedList** implements the Queue interface, providing first in, first out (FIFO) queue operations for add, poll, and so on.
	* Concurrent queue implementations
		* **BlockingQueue** extends Queue with operations that wait for the queue to become nonempty when retrieving an element and for space to become available in the queue when storing an element.
* **Deque Implementations**
	* General-purpose deque implementations
		* The general-purpose implementations include **LinkedList** and **ArrayDeque** classes. The Deque interface supports insertion, removal and retrieval of elements at both ends. The ArrayDeque class is the resizable array implementation of the Deque interface, whereas the LinkedList class is the list implementation.
	* Concurrent deque implementations
		* The **LinkedBlockingDeque** class is the concurrent implementation of the Deque interface. If the deque is empty then methods such as takeFirst and takeLast wait until the element becomes available, and then retrieves and removes the same element.
* **Wrapper Implementations**
	* Synchronization wrappers
		* The synchronization wrappers add automatic synchronization (thread-safety) to an arbitrary collection. Each of the six core collection interfaces — Collection, Set, List, Map, SortedSet, and SortedMap — has one static factory method.
	* Unmodifiable wrappers
		* Unlike synchronization wrappers, which add functionality to the wrapped collection, the unmodifiable wrappers take functionality away. In particular, they take away the ability to modify the collection by intercepting all the operations that would modify the collection and throwing an UnsupportedOperationException.
	* Checked interface wrappers
		* The Collections.checked interface wrappers are provided for use with generic collections. These implementations return a dynamically type-safe view of the specified collection, which throws a ClassCastException if a client attempts to add an element of the wrong type. The generics mechanism in the language provides compile-time (static) type-checking, but it is possible to defeat this mechanism. Dynamically type-safe views eliminate this possibility entirely.

### Algorithms

* **Sorting**
	* The sort algorithm reorders a List so that its elements are in ascending order according to an ordering relationship. Two forms of the operation are provided. The simple form takes a List and sorts it according to its elements' natural ordering. The sort operation uses a slightly optimized merge sort algorithm that is fast and stable:
		* **Fast**: It is guaranteed to run in n log(n) time and runs substantially faster on nearly sorted lists. Empirical tests showed it to be as fast as a highly optimized quicksort. A quicksort is generally considered to be faster than a merge sort but isn't stable and doesn't guarantee n log(n) performance.
		* **Stable**: It doesn't reorder equal elements. This is important if you sort the same list repeatedly on different attributes. If a user of a mail program sorts the inbox by mailing date and then sorts it by sender, the user naturally expects that the now-contiguous list of messages from a given sender will (still) be sorted by mailing date. This is guaranteed only if the second sort was stable.
* **Shuffling**
	* The shuffle algorithm does the opposite of what sort does, destroying any trace of order that may have been present in a List. That is, this algorithm reorders the List based on input from a source of randomness such that all possible permutations occur with equal likelihood, assuming a fair source of randomness. This algorithm is useful in implementing games of chance.
* **Routine Data Manipulation**
	* The Collections class provides five algorithms for doing routine data manipulation on List objects, all of which are pretty straightforward:
		* reverse — reverses the order of the elements in a List.
		* fill — overwrites every element in a List with the specified value. This operation is useful for reinitializing a List.
		* copy — takes two arguments, a destination List and a source List, and copies the elements of the source into the destination, overwriting its contents. The destination List must be at least as long as the source. If it is longer, the remaining elements in the destination List are unaffected.
		* swap — swaps the elements at the specified positions in a List.
		* addAll — adds all the specified elements to a Collection. The elements to be added may be specified individually or as an array.
* **Searching**
	* The **binarySearch** algorithm searches for a specified element in a sorted List. This algorithm has two forms. The first takes a List and an element to search for (the "search key"). This form assumes that the List is sorted in ascending order according to the natural ordering of its elements. The second form takes a Comparator in addition to the List and the search key, and assumes that the List is sorted into ascending order according to the specified Comparator. The sort algorithm can be used to sort the List prior to calling binarySearch.
* **Composition**
	* The frequency and disjoint algorithms test some aspect of the composition of one or more Collections:
		* **frequency** — counts the number of times the specified element occurs in the specified collection
		* **disjoint** — determines whether two Collections are disjoint; that is, whether they contain no elements in common
* **Finding Extreme Values**
	* The **min** and the **max** algorithms return, respectively, the minimum and maximum element contained in a specified Collection. Both of these operations come in two forms. The simple form takes only a Collection and returns the minimum (or maximum) element according to the elements' natural ordering. The second form takes a Comparator in addition to the Collection and returns the minimum (or maximum) element according to the specified Comparator.

### Benefits of the Java Collections Framework

* Reduces programming effort: By providing useful data structures and algorithms, the Collections Framework frees you to concentrate on the important parts of your program rather than on the low-level "plumbing" required to make it work. By facilitating interoperability among unrelated APIs, the Java Collections Framework frees you from writing adapter objects or conversion code to connect APIs.
* Increases program speed and quality: This Collections Framework provides high-performance, high-quality implementations of useful data structures and algorithms. The various implementations of each interface are interchangeable, so programs can be easily tuned by switching collection implementations. Because you're freed from the drudgery of writing your own data structures, you'll have more time to devote to improving programs' quality and performance.
* Allows interoperability among unrelated APIs: The collection interfaces are the vernacular by which APIs pass collections back and forth. If my network administration API furnishes a collection of node names and if your GUI toolkit expects a collection of column headings, our APIs will interoperate seamlessly, even though they were written independently.
* Reduces effort to learn and to use new APIs: Many APIs naturally take collections on input and furnish them as output. In the past, each such API had a small sub-API devoted to manipulating its collections. There was little consistency among these ad hoc collections sub-APIs, so you had to learn each one from scratch, and it was easy to make mistakes when using them. With the advent of standard collection interfaces, the problem went away.
* Reduces effort to design new APIs: This is the flip side of the previous advantage. Designers and implementers don't have to reinvent the wheel each time they create an API that relies on collections; instead, they can use standard collection interfaces.
* Fosters software reuse: New data structures that conform to the standard collection interfaces are by nature reusable. The same goes for new algorithms that operate on objects that implement these interfaces.


