package test.TestDemo02;

public class MyArrayList  {

   private Object list [] = new Object[10];
    private int index=0;
    /**
     * 添加元素
     * @param val
     */
    public  void  add(Object val){
        //扩容
        if (index>=(this.list.length*0.75)){
            Object [] plist =new Object[this.list.length*2];
            for (int i=0;i<this.list.length;i++){
                plist[i]= this.list[i];
            }
            this.list=plist;
        }
        //添加元素
        list[index]=val;
        index++;
    }

    /**
     * 按位置添加元素
     * @param index
     * @param val
     */
    public void add(int index,Object val)throws IndexOutOfBoundsException{
        //扩容
        if (index>=(this.list.length*0.75)){
            Object [] plist =new Object[this.list.length*2];
            for (int i=0;i<this.list.length;i++){
                plist[i]= this.list[i];
            }
            this.list=plist;
        }
        //添加元素
            if (index<(this.index+1)){
                Object [] nlist =new Object[list.length];
                for (int i=0;i<nlist.length;i++){
                    if(i<index){
                        nlist[i]=list[i];
                    }else if(index==i){
                        nlist[i]=val;
                    }else{
                        nlist[i]=list[i-1];
                    }
                }
                this.list=nlist;
                this.index++;
            }else if (index==(this.index+1)){
                list[index]=val;
                index++;
            }else{
                throw new IndexOutOfBoundsException("超出范围，无此元素");
            }


    }

    /**
     * 取值
     * @param index
     * @return
     */
    public Object get(int index)throws IndexOutOfBoundsException {
            if (index<=(this.index)){
                return list[index];
            }else if (index<0){
                throw new ArrayIndexOutOfBoundsException("取值位置不能为负");
            } else{
                throw new IndexOutOfBoundsException("超出范围，无此元素");
            }
    }

    /**
     * 根据位置删除元素
     * @param index
     */
    public void  remove (int index)throws IndexOutOfBoundsException{
            if (index<=(this.index)){
                Object [] nlist =new Object[list.length];
                for (int i=0;i<nlist.length;i++){
                    if(i<index){
                        nlist[i]=list[i];
                    }else if(index==i){
                        continue;
                    }else{
                        nlist[i-1]=list[i];
                    }
                }
                this.list=nlist;
                this.index--;
            }else {
               throw new IndexOutOfBoundsException("超出范围，无此元素");
            }
    }
        /**
         * 根据位置删除元素
         * @param val
         */
        public void  removeAll (Object val){

            int ind=0;
                Object [] nlist =new Object[list.length];
                for (int i=0;i<nlist.length;i++){
                    if(list[i]!=val){
                        nlist[i-ind]=list[i];
                    }else if(list[i]==val){
                        this.index--;
                        ind++;
                        continue;
                    }
                }
                this.list=nlist;
        }

    /**
     * 根据值删除元素
     * @param val
     * @throws IndexOutOfBoundsException
     */
     public void  remove (Object val)throws IndexOutOfBoundsException{
         boolean b=false;
         int ind=0;
         Object [] nlist =new Object[list.length];
         for (int i=0;i<nlist.length;i++){
             if((list[i]!=val)||b){
                 nlist[i-ind]=list[i];
             }else if(list[i]==val){
                 b=true;
                 continue;
             }
         }
         this.list=nlist;
         this.index--;
     }


        /**
         * 替换元素
         * @param index
         * @param val
         */
    public void set(int index,Object val)throws IndexOutOfBoundsException{
            if (index<=(this.index)){
                list[index]=val;
            }else {
                throw new IndexOutOfBoundsException("超出范围，无此元素");
            }

    }

    /**
     * 数组大小
     * @return
     */
    public  int size(){
        int s= 0;
        for (int i=0;i<list.length;i++){
            if(list[i]!=null){
                s++;
            }
        }
        return s;
    }


    /**
     *判断是否包含此值
     * @param val
     * @return
     */
    public boolean contain(Object val){
        boolean b =false;
        for (int i=0;i<list.length;i++){
            if (list[i]!=null){
                if(list[i].equals(val)){
                    System.out.println("现在长度="+i);
                    b=true;
                    break;
                }
            }else{
                break;
            }

        }
        return b;
    }


}
