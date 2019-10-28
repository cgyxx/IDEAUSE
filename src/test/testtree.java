package test;

public class testtree {
    public static void  main(String [] args){
        int [] p={1,2,4,7,3,5,6,8};
        int [] i={4,7,2,1,5,3,8,6};
       TreeNode s =  test.reConstructBinaryTree(p,i);
        System.out.println(s.val+"//"+s.left.val);
    }

}
