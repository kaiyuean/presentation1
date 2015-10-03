## Essential Java Classes 

### Exceptions

Exceptions explains the exception mechanism and how it is used to handle errors and other exceptional conditions.

* An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.

* Valid Java programming language code must honor the Catch or Specify Requirement. This means that code that might throw certain exceptions must be enclosed by either of the following:
    * A try statement that catches the exception.
    * A method that specifies that it can throw the exception.

* Three Kinds of Exceptions
    * Checked exception: These are exceptional conditions that a well-written application should anticipate and recover from.
    * Error: These are exceptional conditions that are external to the application, and that the application usually cannot anticipate or recover from.
    * Runtime exception: These are exceptional conditions that are internal to the application, and that the application usually cannot anticipate or recover from. These usually indicate programming bugs, such as logic errors or improper use of an API. 

* Catching and Handling Exceptions
    * Three exception handler components — the try, catch, and finally blocks
    * The try block identifies a block of code in which an exception can occur.
    * The catch block identifies a block of code, known as an exception handler, that can handle a particular type of exception.
    * The finally block identifies a block of code that is guaranteed to execute, and is the right place to close files, recover resources, and otherwise clean up after the code enclosed in the try block.
    * [code example](https://github.com/kaiyuean/presentation1/blob/master/src/Exceptions.java)

* Before you can catch an exception, some code somewhere must throw one. Any code can throw an exception: your code, code from a package written by someone else such as the packages that come with the Java platform, or the Java runtime environment. Regardless of what throws the exception, it's always thrown with the throw statement.

* Advantages of Exceptions
    * Separating error-handling code from "regular" code
    * Propagating errors up the call stack

### Basic I/O

* I/O Streams: An I/O Stream represents an input source or an output destination. A stream can represent many different kinds of sources and destinations, including disk files, devices, other programs, and memory arrays.
    * Byte Streams handle I/O of raw binary data. [code example](https://github.com/kaiyuean/presentation1/blob/master/src/ByteStreams.java)
    * Character Streams handle I/O of character data, automatically handling translation to and from the local character set. [code example](https://github.com/kaiyuean/presentation1/blob/master/src/CharacterStreams.java)
    * Buffered Streams optimize input and output by reducing the number of calls to the native API.
    * Scanning and Formatting allows a program to read and write formatted text.
    * I/O from the Command Line describes the Standard Streams and the Console object.
    * Data Streams handle binary I/O of primitive data type and String values.
    * Object Streams handle binary I/O of objects.
* File I/O
    * Path: A file is identified by its path through the file system, beginning from the root node. A file system stores and organizes files on some form of media, generally one or more hard drives, in such a way that they can be easily retrieved. Most file systems in use today store the files in a tree (or hierarchical) structure. At the top of the tree is one (or more) root nodes. Under the root node, there are files and directories (folders in Microsoft Windows). Each directory can contain files and subdirectories, which in turn can contain files and subdirectories, and so on, potentially to an almost limitless depth.
    * Path Class: the Path class is a programmatic representation of a path in the file system. A Path object contains the file name and directory list used to construct the path, and is used to examine, locate, and manipulate files.
    * Path Operations:
        * Creating a Path
        * Retrieving Information About a Path
        * Removing Redundancies from a Path
        * Converting a Path
        * Joining Two Paths
        * Creating a Path Between Two Paths
        * Comparing Two Paths
    * File Operations
        * Checking a File or Directory
        * Deleting a File or Directory
        * Copying a File or Directory
        * Moving a File or Directory
        * Managing Metadata (File and File Store Attributes)
        * Reading, Writing, and Creating Files
        * Random Access Files
        * Creating and Reading Directories
        * Links, Symbolic or Otherwise
        * Walking the File Tree
        * Finding Files
        * Watching a Directory for Changes

### Concurrency

The Java platform is designed from the ground up to support concurrent programming, with basic concurrency support in the Java programming language and the Java class libraries. 

* Processes and Threads
    * A process has a self-contained execution environment. A process generally has a complete, private set of basic run-time resources; in particular, each process has its own memory space.
    * Threads are sometimes called lightweight processes. Both processes and threads provide an execution environment, but creating a new thread requires fewer resources than creating a new process.
* Thread objects
    * Each thread is associated with an instance of the class Thread. There are two basic strategies for using Thread objects to create a concurrent application.
    * To directly control thread creation and management, simply instantiate Thread each time the application needs to initiate an asynchronous task.
    * To abstract thread management from the rest of your application, pass the application's tasks to an executor.
    * [code example](https://github.com/kaiyuean/presentation1/blob/master/src/ThreadObject.java)
* Synchronization
    * Threads communicate primarily by sharing access to fields and the objects reference fields refer to. This form of communication is extremely efficient, but makes two kinds of errors possible: thread interference and memory consistency errors. The tool needed to prevent these errors is synchronization.
    * However, synchronization can introduce thread contention, which occurs when two or more threads try to access the same resource simultaneously and cause the Java runtime to execute one or more threads more slowly, or even suspend their execution. Starvation and livelock are forms of thread contention. 
* Liveness
    * A concurrent application's ability to execute in a timely manner is known as its liveness.
    * Deadlock: Deadlock describes a situation where two or more threads are blocked forever, waiting for each other. [code example](https://github.com/kaiyuean/presentation1/blob/master/src/Deadlock.java)
    * Starvation: Starvation describes a situation where a thread is unable to gain regular access to shared resources and is unable to make progress. This happens when shared resources are made unavailable for long periods by "greedy" threads. 
    * Livelock: A thread often acts in response to the action of another thread. If the other thread's action is also a response to the action of another thread, then livelock may result. As with deadlock, livelocked threads are unable to make further progress. However, the threads are not blocked — they are simply too busy responding to each other to resume work. 
* High Level Concurrency objects
    * Lock objects: Lock objects work very much like the implicit locks used by synchronized code. As with implicit locks, only one thread can own a Lock object at a time. Lock objects also support a wait/notify mechanism, through their associated Condition objects. [code example](https://github.com/kaiyuean/presentation1/blob/master/src/Lock.java)
    * Concurrent collections
        * BlockingQueue defines a first-in-first-out data structure that blocks or times out when you attempt to add to a full queue, or retrieve from an empty queue.
        * ConcurrentMap is a subinterface of java.util.Map that defines useful atomic operations. These operations remove or replace a key-value pair only if the key is present, or add a key-value pair only if the key is absent. Making these operations atomic helps avoid synchronization. The standard general-purpose implementation of ConcurrentMap is ConcurrentHashMap, which is a concurrent analog of HashMap.
        * ConcurrentNavigableMap is a subinterface of ConcurrentMap that supports approximate matches. The standard general-purpose implementation of ConcurrentNavigableMap is ConcurrentSkipListMap, which is a concurrent analog of TreeMap.
    * Atomic variables: The java.util.concurrent.atomic package defines classes that support atomic operations on single variables. All classes have get and set methods that work like reads and writes on volatile variables. That is, a set has a happens-before relationship with any subsequent get on the same variable. The atomic compareAndSet method also has these memory consistency features, as do the simple atomic arithmetic methods that apply to integer atomic variables.
    * Executors
        * Executor Interfaces: Executor Interfaces define the three executor object types: Executor, ExecutorService, ScheduledExecutorService.
        * Thread Pools: Most of the executor implementations in java.util.concurrent use thread pools, which consist of worker threads.
        * Fork/Join: The fork/join framework is an implementation of the ExecutorService interface that helps you take advantage of multiple processors. It is designed for work that can be broken into smaller pieces recursively. The goal is to use all the available processing power to enhance the performance of your application.

### The Platform Environment

* Configuration Utilities: APIs used to access configuration data supplied when the application is deployed, or by the application's user.
* System Utilities: miscellaneous APIs defined in the System and Runtime classes.
* PATH and CLASSPATH: environment variables used to configure JDK development tools and other applications.

### Regular Expressions

Regular expressions are a way to describe a set of strings based on common characteristics shared by each string in the set. They can be used to search, edit, or manipulate text and data.

* Test Harness
* String Literals
* Character Classes
* Predefined Character Classes
* Quantifiers
* Capturing Groups
* Boundary Matchers
* Methods of the Pattern Class
* Methods of the Matcher Class
* Methods of the PatternSyntaxException Class
* Unicode Support
