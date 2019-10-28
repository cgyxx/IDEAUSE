package test;;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MyStack {
    public static void  main(String [] args){
        System.out.println(new MyStack().NumberOf1(-2147483648));
    }

//    输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
        public int NumberOf1(int n) {
            int count =0;
            List a = new ArrayList<>();
            if (n<0){
                while(n!=0){
                    a.add(0,n%2==1?0:1);
                    n=n/2;
                } a.add(0,1);
                for (int i = a.size()-1; i >=0 ; i++) {
                    if (a.get(i).equals("1")){
                        a.remove(i);
                        a.add(i,0);
                    }else {
                        a.remove(i);
                        a.add(i,1);
                        break;
                    }
                }
                for (int i = 0; i <a.size() ; i++) {
                    if(a.get(i).equals("1")){
                        count++;
                    }
                }
            }else{
                while(n!=0){
                    a.add(0,n%2);
                    if (n%2==1){
                        count++;
                    }
                    n=n/2;
                }
            }
            return count;
        }


}
