package Lessions;

public class Less2 {
    public static void  main(String[] args){
        twos(5);
    }
    public static void twos(int k){
        if(k>0){
            twos(k/2);
            System.out.print(k%2+" ");
        }
    }
}
