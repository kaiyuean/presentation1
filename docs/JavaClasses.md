## Essential Java Classes 

### Exceptions

Exceptions explains the exception mechanism and how it is used to handle errors and other exceptional conditions.

* An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.

* Valid Java programming language code must honor the Catch or Specify Requirement. This means that code that might throw certain exceptions must be enclosed by either of the following:

    * A try statement that catches the exception.
    * A method that specifies that it can throw the exception.

* Before you can catch an exception, some code somewhere must throw one. Any code can throw an exception: your code, code from a package written by someone else such as the packages that come with the Java platform, or the Java runtime environment. Regardless of what throws the exception, it's always thrown with the throw statement.

### Basic I/O

* I/O Streams: An I/O Stream represents an input source or an output destination. A stream can represent many different kinds of sources and destinations, including disk files, devices, other programs, and memory arrays.
    * Byte Streams handle I/O of raw binary data.
    * Character Streams handle I/O of character data, automatically handling translation to and from the local character set.
    * Buffered Streams optimize input and output by reducing the number of calls to the native API.
    * Scanning and Formatting allows a program to read and write formatted text.
    * I/O from the Command Line describes the Standard Streams and the Console object.
    * Data Streams handle binary I/O of primitive data type and String values.
    * Object Streams handle binary I/O of objects.
* File I/O

### Concurrency

The Java platform is designed from the ground up to support concurrent programming, with basic concurrency support in the Java programming language and the Java class libraries. 

* Processes and Threads
* Thread objects
* Synchronization
* Liveness
* High Level Concurrency objects
    * Lock objects
    * Concurrent collections
    * Atomic variables
    * ThreadLocalRandom
    * Executors

### The Platform Environment

* Configuration Utilities: APIs used to access configuration data supplied when the application is deployed, or by the application's user.
* System Utilities: miscellaneous APIs defined in the System and Runtime classes.
* PATH and CLASSPATH: environment variables used to configure JDK development tools and other applications.

### Regular Expressions

Regular expressions are a way to describe a set of strings based on common characteristics shared by each string in the set. They can be used to search, edit, or manipulate text and data.

* Test Harness, String Literals, Character Classes, Predefined Character Classes, Quantifiers, Capturing Groups, Boundary Matchers, Methods of the Pattern Class, Methods of the Matcher Class, Methods of the PatternSyntaxException Class.