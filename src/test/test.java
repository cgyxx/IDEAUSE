package test;

import java.util.List;

public class test {

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int [] la = new int [pre.length] ;
        int [] newpre=new int [pre.length];
        int [] newin=new int [pre.length];
        int root = pre[0];
        TreeNode n1 =   new TreeNode(root);
        //先看左子树
        for(int i =0;i<pre.length;i++){
            if(root!=in[i]){
                newin[i]=in[i];
                newpre[i]=pre[i+1];
            }else{
                break;
            }
        }
        //左子树到底，返回底层值
        if(newin.length>0) {
            TreeNode l = reConstructBinaryTree(newpre, newin);
            n1.left = l;
        }
        //右子树
        boolean flag =false;int c = 0;
        for(int i =0;i<pre.length;i++){
            if (flag){
                newin[c]=in[i];
                newpre[c]=pre[i];
                c++;
            }
            if(root==in[i]){
                flag =true;
            }
        }
        if(newin.length>0) {
            TreeNode r = reConstructBinaryTree(newpre, newin);
            n1.right = r;
        }
        return n1;


    }

}
