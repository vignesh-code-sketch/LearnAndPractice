// Dynamic Stack Full Notes:
// 1. A dynamic stack is a stack data structure that can grow and shrink in size as needed. 
// It uses an array to store the elements of the stack, and it automatically resizes the array when necessary.

// 2. The main advantage of a dynamic stack is that it can handle an arbitrary number of elements 
// without running into stack overflow errors, as it can expand its capacity when needed. However, 
// it may have a higher memory overhead compared to a static stack due to the need for resizing and copying elements.

// 3. The main operations of a dynamic stack include push (to add an element to the top of the stack), 
// pop (to remove the top element from the stack), peek (to view the top element without removing it), 
// and size (to get the number of elements in the stack).

// 4. The push operation checks if the stack is full (i.e., if the top index is equal to the length of 
// the stack array minus one). If it is full, it calls the expand method to double the size of the stack 
// array before adding the new element.

// 5. The pop operation checks if the stack is empty (i.e., if the top index is -1). If it is not empty, 
// it decrements the top index to remove the top element. After popping an element, it checks if the size 
// of the stack is less than a quarter of the length of the stack array. If it is, it calls the shrink 
// method to halve the size of the stack array.

// 6. The peek operation checks if the stack is empty and returns the top element if it is not empty. If 
// the stack is empty, it returns -1 and prints a message indicating that the stack is empty.

// 7. The showStack method prints the elements of the stack from top to bottom, and the size method returns 
// the number of elements currently in the stack.

// 8. The expand method creates a new array with double the size of the current stack array, copies the elements 
// from the old array to the new array, and then replaces the old stack array with the new one. The shrink method 
// does the opposite by creating a new array with half the size of the current stack array, copying the elements, 
// and replacing the old stack array with the new one.

// 9. Overall, a dynamic stack is a flexible and efficient data structure that can handle varying amounts of data 
// without the risk of overflow, making it suitable for applications where the number of elements is not known in advance.

// Eg of dynamic stack: alt + tab in system -> last used app will be on top of stack
// Eg of dynamic stack in day to day life: arranging plates in stand -> when we add a new plate, we put it on top 
// of the stack, and when we remove a plate, we take it from the top of the stack. The stack can grow as we add 
// more plates and shrink as we remove them by changing the stand that holds the plates.


public class DStack{ // dynamic stack

    int[] stack = new int[5];
    int top = -1;

    public void push(int data){
        if(top == stack.length-1){
            expand();
        }
        top++;
        stack[top] = data;
    }

    public void pop(){
        if(top == -1){
            System.out.println("Stack underflow");
        } else{
            top--;
            if(size() < stack.length/4){
                shrink();
            }
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

    private void expand(){
        int[] newStack = new int[stack.length*2];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }

    private void shrink(){
        int[] newStack = new int[stack.length/2];
        System.arraycopy(stack, 0, newStack, 0, newStack.length);
        stack = newStack;
    }

}