/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*   Class MrCoxallStack.
*/

import java.util.ArrayList;

/**
* Class.
*/
public class MrCoxallStack {

    /**
    * ArrayList.
    */

    private ArrayList<Integer> theStack = new ArrayList<Integer>();

    /**
    * The push function.
    *
    * @param pushNumber int added to stack
    */

    // push method
    public void push(int pushNumber) {
        theStack.add(0, pushNumber);
    }

    /**
    * Pop method.
    *
    * @return return
    */
    public int pop() {
        final int returnValue;
        if (theStack.size() > 0) {
            final int popNumber = theStack.get(0);
            theStack.remove(0);
            returnValue = popNumber;
        }
        else {
            System.out.println("Stack is empty.");
            returnValue = -1;
        }
        return returnValue;
    }

    /**
    * Getters.
    */
    public void showStack() {
        System.out.println("The stack list.");
        for (Integer aSingleElement : theStack) {
            System.out.println(aSingleElement);
        }
        System.out.println("End of stack list.\n");
    }
}
