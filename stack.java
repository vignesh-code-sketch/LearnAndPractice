// Stack Full Notes:
// 1. A stack is a linear data structure that follows the LIFO (Last In, First Out) principle.

// 2. The main operations of a stack include push (to add an element to the top of the stack), 
// pop (to remove the top element from the stack), and peek (to view the top element without removing it).

// 3. A stack can be implemented using an array or a linked list.

// 4. The main advantage of a stack is its simplicity and efficiency in managing data in a last-in, first-out manner.

// 5. The main disadvantage of a stack is its limited functionality compared to other data structures like queues or 
// linked lists, as it only allows access to the top element.

// 6. Common applications of stacks include function call management in programming languages, expression evaluation, 
// and undo mechanisms in software applications.

// 7. In a stack implemented using an array, the size of the stack is fixed, and it can lead to stack overflow 
// if we try to push an element when the stack is full. In contrast, a dynamic stack can grow and shrink in size as needed, 
// avoiding overflow issues but potentially having higher memory overhead due to resizing operations.

// Eg of stack : when we are working on a task and a high priority task comes in, we put the current task 
// on hold and start working on the new task. Once we finish the new task, we can go back to the previous task. 
// This is similar to how a stack works, where the last task added (the high priority task) is the first one to 
// be completed before returning to the previous tasks. This ensures that execution is properly resumed after 
// handling the high priority task, following the LIFO principle of a stack.

//eg: alt + tab in system -> last used app will be on top of stack
//eg: browser history -> last visited page will be on top of stack

// errors:
// overflow -> when we try to push an element in stack which is already full
// underflow -> when we try to pop an element from stack which is already empty

// Dynamic stack -> stack which can grow and shrink in size as per requirement
// it uses expand() and shrink() functions to increase and decrease the size of stack respectively

public class stack{

    int[] stack = new int[5];
    int top = -1;

    public void push(int data){
        if(top == stack.length-1){
            System.out.println("Stack overflow");
        } else{
            top++;
            stack[top] = data;
        }
    }

    public void pop(){
        if(top == -1){
            System.out.println("Stack underflow");
        } else{
            top--;
        }
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        } else{
            return stack[top];
        }
    }

    public void showStack(){
        for(int i = top; i >= 0; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}

