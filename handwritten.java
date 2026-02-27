
    import java.util.Arrays;
// import java.util.* -> will import all the files in utils folder 
// but not all the folders (* works only for all the files)

public class handwritten {
    public static void submain(String a[]){
        //primitive:
        int i                 = 1;
        byte byt              = 127;
        short sh              = 588;
        float fl              = 5.6f;
        double d              = 10.5;
        char c                = 'A';
        boolean b             = true;

        //non primitive:
        // int - Integer
        // char - Character
        // byte - Byte
        // short - Short
        // float - Float
        // double - Double
        // boolean - Boolean

        // boxing:
        Integer boxInteger    = i; // autoBoxing
        int newly             = boxInteger.intValue(); // unboxing

        String str            = "12";
        int numly             = Integer.parseInt(str);

            // Type casting
            byt               = (byte)i;// explict casting
            i                 = byt; // implicit casting (aka conversion)

        i                     = i + 1; // addition assignment
        i                     += 1; // addition assignment
        i++; // post increment : fetch and increment (what is fetched, will be assigned)
        ++i; // pre increment : increment and fetch (assigned after increment)

        byte byt1             = 127;

        int outOfRange        = byt + byt1; // automatic promotion
        int byt2              = byt / byt1; // quotient
        int byt3              = byt % byt1; // remainder


        boolean ca            = false;

        boolean result        = b & ca; //relational operation
        result                = b && ca; // short-circuit operation

        int[] nums            = new int[5]; // array
        int[][] nums1         = new int[3][4]; // 2D array, multi-dimensional array
        int[][] nums2         = new int[3][]; // jagged array
        nums2[0]              = new int[4]; // 2D array, multi-dimensional array
        nums2[1]              = new int[2]; // jagged array
        nums2[2]              = new int[5]; // jagged array

        String[] noums        = new String[5];

        // what is string constant pool?
        // heap and stack memory in java and how are they used in java
        // constructor, extends, super class, this
        // every class in java extends object class
        // single level inheritance and multi level inheritance are
        //  allowed but not multiple inheritance
        // what is conanical constructure?

        System.out.print("Hello");
    }

    // example of method overloading
    class Calculator {

        // same method name with different parameters
    int add(int a, int b) {return a + b;}

    double add(double a, double b) {return a + b;}

    int add(int a, int b, int c) {return a + b + c;}
    }
class AdvancedCalculator extends Calculator {

    // method overriding
    @Override
    int add(int a, int b) {
        System.out.println("Advanced Calculator Add with bonus logic");
        return a + b + 10; // modified implementation
    }
}

// Access modifiers
// public, private, protected
// default (no modifier)

// place                     public      protected      default     private
// same class                yes         yes            yes         yes
// same pack, subclass       yes         yes            yes         no
// same pack, non-subclass   yes         yes            yes         no
// diff pack, subclass       yes         yes            no          no
// diff pack, non-subclass   yes         no             no          no


//polymorphism - same method name, different behavior
// compile-time (static) polymorphism - method overloading
// runtime (dynamic) polymorphism - method overriding = dynamic method dispatch

// final keyword
// - final variable: cannot be reassigned
// - final method: cannot be overridden
// - final class: cannot be inherited

// TypeCasting : 
// 1. Upcasting : converting a subclass reference to a superclass reference
// 2. Downcasting : converting a superclass reference to a subclass reference

// Final class: once declared final cannot be inherited, 
// design is fixed, immutable, same for the final methods too


// Abstract class and methods:

// cannot be instantiated
// Shape shape = new Shape(); is not allowed
// only abstract classes can have abstract methods
// any class that extends an abstract class must implement all abstract methods

abstract class Shape {
    abstract void draw(); // only declaration
}

class Circle extends Shape { // concrete class
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape { // concrete class
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    // if a concrete class does not implement all abstract methods, 
    // it must be declared abstract
    // all abstract methods must be in a abstract class but 
    // all abstract classes are not required to have abstract methods

    // inner classes
    class A {
        void display() {
            System.out.println("Inside Inner Class");
        }
    }

    // A obj = Hello.new A();
    // obj.display();

    // anonymous sub class?

    // anonymous inner class
    Shape shape = new Shape() {
        @Override
        void draw() {
            System.out.println("Drawing an Anonymous Shape");
        }
    };
    // shape.draw();

    // static variables and methods:
    class StaticExample {
        static int staticVar  = 0; // static variable
        int index             = 0; // instance variable

        static void staticMethod() { // static method
            System.out.println("Inside Static Method");
        } // when a method is declared static, 
        // it can be called without creating an instance of the class. 
        // So when you know you are going to use only one method from the class, 
        // you can declare it as static and save memory.

    } // when multiple objects are created, static variables are shared 
    // among all instances but each instance variable is unique to its instance.


    // abstract - half blueprint
    // interface - full blueprint with no implementation
    // class - full blueprint with implementation

    /** multiple interfaces:
 * Example: A Smartphone can do multiple capabilities.
 * It can:
 *  - Call
 *  - Take Photos
 *  - Browse Internet
 */

interface Callable {
    void makeCall(String number);
}

interface Camera {
    void takePhoto();
}

interface Browser {
    void browse(String website);
}

// Multiple interface implementation
class SmartPhone implements Callable, Camera, Browser {

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void takePhoto() {
        System.out.println("Photo taken 📸");
    }

    @Override
    public void browse(String website) {
        System.out.println("Browsing " + website);
    }
}

// abstract vs interfaces


// enum is a class - and it cannot be extended


// Types of interface 
// Normal
// Functional or sam
// Marked 

// Lamda expressions can be used only with Functional interface

// errors:
// runtime, compile time, logical errors
// runtime errors must be handled safely "Exception Handling"
// try ~ catch
// while catching errors, always put parent class at the bottom of all catches

// checked expection will force the user to handle it ubt not unhandled.
// custom expections can be formed by extending the expection class

// taking input from user
// int num = System.in.read(); = gives the ascii value... (minus by 48)
// but read only char at a time..

// BufferedReader:
// BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
// int num = Integer.parseInt(bf.readLine()); 
// readLine() reads a whole line as a String
// bf.close();

// better way: Scanner
// Scanner scanner = new Scanner(System.in);
// int num = scanner.nextInt();
// scanner.close();

// when error is thrown - catch catches it, but if you want to execute few statements irrespective of error thrown - use try with finally
// try {
//     // code that may throw an exception
// } catch (Exception e) {
//     // handle exception
// } finally {
//     // code that will always execute
// }

// normally finally will be used for closing the resources
//try{
// } catch (Exception e) {
//     // handle exception
// } finally {
//     bf.close();
// }

// try with resources : the statement used inside the try condition will be auto closed...
// try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
    // int num = Integer.parseInt(bf.readLine());
// } catch (Exception e) {
    // handle exception
// }

// Threads : smallest unit one can work with.
// A thread is a lightweight process and is the basic unit of CPU utilization.
// It consists of a thread ID, program counter, register set, and stack space.
// Threads share the process resources but execute independently.

// How to turn a normal method to a thread?
// 1. Extend the Thread class with the method you want to turn into a thread.
// 2. call the turned class with start() method.
// 3. the method name in the extended class must be run() always

// also you can assign priorities to threads
// Thread t1 = new Thread();
// t1.setPriority(Thread.MAX_PRIORITY); (varies from 1 to 10, also has constants like MIN_PRIORITY and NORM_PRIORITY)

// scheduler will decide which thread to run
// It will allocate CPU time to each thread based on their priority and other factors.
// at any moment the scheduler can run 2 threads concurrently choosing it randomly or which will end soon if priority is not given.

//example of thread extension:
// class MyThread extends Thread {
//     @Override
//     public void run() {
//         System.out.println("Thread is running...");
//     }
// }

// MyThread t1 = new MyThread();
// t1.start();

// also you can execute 2 threads parallelly by putting each one to sleep after one execution
// class MyThread extends Thread {
//     @Override
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Thread is running...");
//             try {
//                 Thread.sleep(1000); // Sleep for 1 second
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// Class OtherThread
// class OtherThread extends Thread {
//     @Override
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Other thread is running...");
//             try {
//                 Thread.sleep(1000); // Sleep for 1 second
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// but now to0 there are chances that same thread can execute back to 
// back as when both the threads get out of sleep at the same time but 
// scheduler gave chance to the previous thread itself

// to create a thread we are extending the Thread class and overriding the run() method
// but what if the class which i want to turn into a thread is already extending another class?
// in java multiple inheritance is not allowed with classes but we can achieve it through interfaces

// how?
// when we look into the thread class, we see that it implements the Runnable interface which has the run() method declaration.
// so instead of extending the Thread class, we can implement the Runnable interface.

// so now i can put
// class A implements B, Runnable (){
//     @Override
//     public void run() {
//         // code to be executed in the thread
//     }
// }

// now i can call it like
// A obj = new A();
// Thread t1 = new Thread(obj); -> i create a new thread object as only it that start method
// t1.start();

// Runnable class in a functional interface -> so it can be converted into a lambda expression

// Runnable obj = () -> {
//             if (condition) {
//                 // code to be executed in the thread
//             }
// };
// Thread t1 = new Thread(obj);
// t1.start();

// what if two threads try to work on a same variable at the same time? : inconsistency!!
// so it is always good to go with proper accountablity.

// so there exists a concept called thread safe: which
//  means only one thread can work with a mutable obj, var, ect at a time

// when the main is executing the 2 threads, it will only 
// just start the threads, but will not wait for the threads to compelete their works
// so when you plan to use the outcome of the threads in the main flow it wont work..
// to make it work you must use the join() method
// A obj = new A();
// B obj1 = new B();
// Thread t1 = new Thread(obj);
// Thread t2 = new Thread(obj1);
// t1.start();
// t2.start();
// try {
//     t1.join(); // Wait for t1 to finish
//     t2.join(); // Wait for t2 to finish
// } catch (InterruptedException e) {
//     e.printStackTrace();
// }

// Race condition:
// even now the 2 threads might not work properly, bcoz both might reach out to the same 
// variable at the same time, leading to inconsistency.
// so always use synchronized keyword to make sure only one thread can work with a mutable variable at a time.
// eg: Class A {
//  int i;
//     @Override
//     public synchronized void sum()  {
//             i ++
//         }
//     }
// }
// when one thread called this synchronized method, it will acquire the lock on the object
// and no other thread can execute any synchronized method on the same object until the lock is released.

// Thread states: 6 states
// NEW
//   ↓ start()
// RUNNABLE
//   ↓ (gets CPU)
// Running
//   ↓ wait() join() LockSupport.park() / sleep(1000) wait(1000) join(1000)
// WAITING / TIMED_WAITING / BLOCKED (waiting for a lock)
//   ↓
// RUNNABLE
//   ↓
// TERMINATED

// Collection Api : the concept to use data structures to store and manipulate groups of objects.
// It provides a set of classes and interfaces for working with collections of objects,
// such as lists, sets, and maps.

// The main interfaces in the Collection API are:
// 1. Collection: The root interface for all collection classes.
// 2. List: An ordered collection that allows duplicate elements.
// 3. Set: A collection that does not allow duplicate elements.
// 4. Map: A collection that maps keys to values, with no duplicate keys allowed. does not extend Collection.

// these interfaces are called Collection Framework interfaces or collection.
// these interfaces are implemented by various classes in the Java Collections Framework.

// Iterator -> Iterator<Integer> value = nums.iterator();
// while (value.hasNext()) {
//     Integer num = value.next();
// }
// List implementations: ArrayList, LinkedList, Vector, Stack
// Set implementations: HashSet, LinkedHashSet, TreeSet(sorted)
// Map implementations: HashMap, LinkedHashMap, TreeMap
// Queue implementations: PriorityQueue, ArrayDeque

// to get all the keys from the map use maps.keySet();
// to get all the values from the map use maps.values();

// collections?

// to sort -> Collections.sort(nums);

// comparator vs comparable

// consumer interface

// stream, why stream?
// Stream API is used to process collections of objects in a functional style.
// It allows for operations such as filtering, mapping, and reducing on collections.
// Streams can be sequential or parallel, making it easy to take advantage of 
// multi-core architectures.

// nums.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println)
// .reduce(0[initial value], (c, e) -> c + e);
// .sorted();

// parallelStream will create multiple threads to 
// process the elements in parallel. but dont use it for sorting.

// Use of var: java 10+
// instead of declaring the exact type of a variable, you can use var to let the compiler infer the type.
// var list = new ArrayList<String>();
// var stream = list.stream();
// when declared by var, we must initialize it... else complier will not know what type it is..
// var can be only a local variable
// var cant be used for class name, but can be used for variable name


// Sealed classes:
// what if i want to restrict other methods from inheriting my class? -> i use final keyword...
// but what if i want to allow only certain methods to inherit? -> use sealed keyword
// how to use? :
// sealed class Shape permits A, B, C {
// }
   // final class A extends Shape {} -> cannot be inherited
   // sealed class B extends Shape permits D {} -> can be inherited by other sealed classes
   // non-sealed class C extends Shape {} -> can be inherited by any class

// same rules apply for interfaces but only with sealed and non sealed keywords, 
// interfaces cannot be final...

// Record:
// if you are going to create a class only for data handling purposes
// you can use a record instead of a regular class.
// A record is a special kind of class in Java that is designed to hold data.
// It automatically provides implementations for common methods like equals(), hashCode(), and toString().
// the only difference bwt a dto and record is that a record is a final class and its fields are final, 
// so once created by its constructor, you cannot change its state. which means 
// indirectly -> you cannot have any setters
// record Point(int x, int y) {}

// also i can override the default conanical constructor..
// record Point(int age, int year) {
//     public Point(int age, int year) { (conanical constructor)
//         this.age = 0;
//         this.year = 2000;
//     }
// }

}}