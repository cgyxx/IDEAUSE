package test;

@Myself(name="马诚",age=22)
class Myintroduce {

    public  static void main(String [] args){
        Class clazz =Myintroduce.class;
        boolean isHasAnno= clazz.isAnnotationPresent(Myself.class);
        if (isHasAnno){
            Myself s= Myintroduce.class.getAnnotation(Myself.class);

            System.out.println(s.age());
            System.out.println(s.name());
        }
    }




}
