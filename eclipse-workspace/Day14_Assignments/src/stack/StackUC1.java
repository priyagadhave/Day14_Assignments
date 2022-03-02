package stack;
//A Linked List Node
class Node
{
int data;       // integer data
Node next;      // pointer to the next node
}

class Stack
{
private Node top;
private int nodesCount;

public Stack() {
   this.top = null;
   this.nodesCount = 0;
}

// Utility function to add an element `x` to the stack
public void push(int x)        // insert at the beginning
{
   // allocate a new node in a heap
   Node node = new Node();

   // check if stack (heap) is full. Then inserting an element would
   // lead to stack overflow
   if (node == null)
   {
       System.out.println("Heap Overflow");
       return;
   }

   System.out.println("Inserting " + x);

   // set data in the allocated node
   node.data = x;

   // set the .next pointer of the new node to point to the current
   // top node of the list
   node.next = top;

   // update top pointer
   top = node;

   // increase stack's size by 1
   this.nodesCount += 1;
}

// Utility function to check if the stack is empty or not
public boolean isEmpty() {
   return top == null;
}

// Utility function to return the top element of the stack
public int peek()
{
   // check for an empty stack
   if (isEmpty()) {
       System.out.println("The stack is empty");
       System.exit(-1);
   }
   return top.data;
}



// Utility function to return the size of the stack
public int size() {
   return this.nodesCount;
}

}

public class StackUC1 {
public static void main(String[] args)
{
   Stack stack = new Stack();

   stack.push(56);
   stack.push(30);
   stack.push(70);

  

  

}
}