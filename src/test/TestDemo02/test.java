package test.TestDemo02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class test {
    public static void main (String args []){

        List l = new ArrayList();
        l.add(0,"sd");
        l.add(1,11);
        l.add(2,"sd");
        l.remove("sdq");
        Object [] s=new  Object[10];
        s[0]="1";
        s[6]="as";
        System.out.println(s[0].equals("1"));


    }

}
