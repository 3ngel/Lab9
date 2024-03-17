package Lessions;

public class Less1 {
    private static int step = 0;
    public static void m(int x){
        space();
        System.out.println(""+x+"-> ");
        step++;
        //От первого к последнему число
        System.out.println("x = "+x);
        if((2*x+1)<20){
            m(2*x+1);
        }
        step--;
        //От последнего числа к первому
        System.out.println("x = "+x);
    }
    public static void space(){
        for(int i=0; i<step; i++){
            System.out.println(" ");
        }
    }
    public static void main(String[] args){m(1);}
}
