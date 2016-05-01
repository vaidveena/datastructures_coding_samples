package datastructure_coding;

/**
 * @author vvaidyanathan
 * Array implementation of stack
 */

public class Stacks {
    
    private final int CAPACITY = 100;
    private int top = -1;
    int[] stack; 
    
    Stacks()
    {
        stack = new int[CAPACITY];
    }
    
    public void Push(int x)
    {
        if (top == CAPACITY-1) 
        {
            System.out.print("Error: stack overflow\n");
            return;
        }
        ++top;
        stack[top] = x;
    }
    
    public void Pop() 
    {
        if(top == -1) { 
            System.out.print("Error: No element to pop\n");
            return;
        }
        top--;
    }
    
    public int Top() 
    {
        return stack[top];
    }
    
    int IsEmpty()
    {
        if(top == -1) return 1;
        return 0;
    }
    
    void PrintStack()
    {
        for (int index = 0; index <= top; index++)
        {
            System.out.print(stack[index]);
        }
    }

}
