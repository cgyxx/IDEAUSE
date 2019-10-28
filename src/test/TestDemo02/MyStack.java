package test.TestDemo02;

public class MyStack {

    private Object value;

    private  MyArrayList al =new MyArrayList();
    public void push(Object value){
        al.add(value);
    }

    public Object pop() throws IndexOutOfBoundsException{

            Object res = al.get(al.size()-1);
            al.remove(al.size()-1);
            return res;
    }

    public int size(){
        return  al.size();
    }
}
