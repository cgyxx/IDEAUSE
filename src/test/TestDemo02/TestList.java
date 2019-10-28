package test.TestDemo02;



public class TestList {
    public static void main(String [] args){



        MyStack myStack =new MyStack();

        myStack.push(0);
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);

        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        
    }






}
