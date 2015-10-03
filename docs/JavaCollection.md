## collections

A collection — sometimes called a container — is simply an object that groups multiple elements into a single unit. Collections are used to store, retrieve, manipulate, and communicate aggregate data. Typically, they represent data items that form a natural group, such as a poker hand (a collection of cards), a mail folder (a collection of letters), or a telephone directory (a mapping of names to phone numbers).

### Interfaces

* The Collection Interface
	* A Collection represents a group of objects known as its elements. The Collection interface is used to pass around collections of objects where maximum generality is desired.
* The Set Interface
	* A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction. The Set interface contains only methods inherited from Collection and adds the restriction that duplicate elements are prohibited. Set also adds a stronger contract on the behavior of the equals and hashCode operations, allowing Set instances to be compared meaningfully even if their implementation types differ. Two Set instances are equal if they contain the same elements.
* The List Interface
	* A List is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements. In addition to the operations inherited from Collection, the List interface includes operations for the following:
		* Positional access — manipulates elements based on their numerical position in the list. This includes methods such as get, set, add, addAll, and remove.
		* Search — searches for a specified object in the list and returns its numerical position. Search methods include indexOf and lastIndexOf.
		* Iteration — extends Iterator semantics to take advantage of the list's sequential nature. The listIterator methods provide this behavior.
		* Range-view — The sublist method performs arbitrary range operations on the list.
* The Queue Interface
	* A Queue is a collection for holding elements prior to processing. Besides basic Collection operations, queues provide additional insertion, removal, and inspection operations. 
* The Deque Interface
	* Usually pronounced as deck, a deque is a double-ended-queue. A double-ended-queue is a linear collection of elements that supports the insertion and removal of elements at both end points. The Deque interface is a richer abstract data type than both Stack and Queue because it implements both stacks and queues at the same time. The Deque interface, defines methods to access the elements at both ends of the Deque instance. Methods are provided to insert, remove, and examine the elements. Predefined classes like ArrayDeque and LinkedList implement the Deque interface.
	* Insert: The addfirst and offerFirst methods insert elements at the beginning of the Deque instance. The methods addLast and offerLast insert elements at the end of the Deque instance. When the capacity of the Deque instance is restricted, the preferred methods are offerFirst and offerLast because addFirst might fail to throw an exception if it is full.
    * Remove: The removeFirst and pollFirst methods remove elements from the beginning of the Deque instance. The removeLast and pollLast methods remove elements from the end. The methods pollFirst and pollLast return null if the Deque is empty whereas the methods removeFirst and removeLast throw an exception if the Deque instance is empty.
    * Retrieve: The methods getFirst and peekFirst retrieve the first element of the Deque instance. These methods dont remove the value from the Deque instance. Similarly, the methods getLast and peekLast retrieve the last element. The methods getFirst and getLast throw an exception if the deque instance is empty whereas the methods peekFirst and peekLast return NULL.
* The Map Interface
	* A Map is an object that maps keys to values. A map cannot contain duplicate keys: Each key can map to at most one value. It models the mathematical function abstraction. The Map interface includes methods for basic operations (such as put, get, remove, containsKey, containsValue, size, and empty), bulk operations (such as putAll and clear), and collection views (such as keySet, entrySet, and values). The Java platform contains three general-purpose Map implementations: HashMap, TreeMap, and LinkedHashMap. 
* Object Ordering
	* Comparable implementations provide a natural ordering for a class, which allows objects of that class to be sorted automatically.
* The SortedSet Interface
	*A SortedSet is a Set that maintains its elements in ascending order, sorted according to the elements' natural ordering or according to a Comparator provided at SortedSet creation time. In addition to the normal Set operations, the SortedSet interface provides operations for the following:
		* Range view — allows arbitrary range operations on the sorted set
		* Endpoints — returns the first or last element in the sorted set
		* Comparator access — returns the Comparator, if any, used to sort the set
* The SortedMap Interface
	* A SortedMap is a Map that maintains its entries in ascending order, sorted according to the keys' natural ordering, or according to a Comparator provided at the time of the SortedMap creation. The SortedMap interface provides operations for normal Map operations and for the following:
		*Range view — performs arbitrary range operations on the sorted map
		* Endpoints — returns the first or the last key in the sorted map
		* Comparator access — returns the Comparator, if any, used to sort the map

### Benefits of the Java Collections Framework

* Reduces programming effort: By providing useful data structures and algorithms, the Collections Framework frees you to concentrate on the important parts of your program rather than on the low-level "plumbing" required to make it work. By facilitating interoperability among unrelated APIs, the Java Collections Framework frees you from writing adapter objects or conversion code to connect APIs.
* Increases program speed and quality: This Collections Framework provides high-performance, high-quality implementations of useful data structures and algorithms. The various implementations of each interface are interchangeable, so programs can be easily tuned by switching collection implementations. Because you're freed from the drudgery of writing your own data structures, you'll have more time to devote to improving programs' quality and performance.
* Allows interoperability among unrelated APIs: The collection interfaces are the vernacular by which APIs pass collections back and forth. If my network administration API furnishes a collection of node names and if your GUI toolkit expects a collection of column headings, our APIs will interoperate seamlessly, even though they were written independently.
* Reduces effort to learn and to use new APIs: Many APIs naturally take collections on input and furnish them as output. In the past, each such API had a small sub-API devoted to manipulating its collections. There was little consistency among these ad hoc collections sub-APIs, so you had to learn each one from scratch, and it was easy to make mistakes when using them. With the advent of standard collection interfaces, the problem went away.
* Reduces effort to design new APIs: This is the flip side of the previous advantage. Designers and implementers don't have to reinvent the wheel each time they create an API that relies on collections; instead, they can use standard collection interfaces.
* Fosters software reuse: New data structures that conform to the standard collection interfaces are by nature reusable. The same goes for new algorithms that operate on objects that implement these interfaces.


