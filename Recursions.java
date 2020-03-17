import java.util.ArrayList;
import java.util.Collections;

public class Recursions{

    public static int exercicio1(int n){
            if (n < 0) {
                throw new IllegalArgumentException("por que trolas meu programinha ?");
            }
            else if (n == 0) return 1;
            return n * exercicio1(n - 1);
    }
    public static int exercicio2(int n){
        if(n<0) {
            return n+exercicio2(n+1);
        }
        else if(n == 0)
            return 0;
        return n + exercicio2(n - 1);
    }
    public static int exercicio3(int n){
        if(n<=0)throw new IllegalArgumentException("por que trolas meu programinha");
        else if(n==1)return 1;
        else if(n==2)return 1;
        return exercicio3(n-1)+exercicio3(n-2);
    }
    public static int exercicio4(int k, int j){
        if(k > j)throw new IllegalArgumentException("por que trolas meu programinha");
        if(k == j)
            return k;
        return j + exercicio4(k,j-1);

    }
    public static boolean exercicio5(String palavra){
        if(palavra==null)throw new NullPointerException("por que trolas meu programinha");
        else if(palavra.length()<=1) return true;
        else if(palavra.charAt(0)==palavra.charAt(palavra.length()-1))return exercicio5(palavra.substring(1,palavra.length()-1));
        else return false;
    }
    public static String exercicio6(int n){
        if(n<0){throw new IllegalArgumentException("por que trolas meu programinha");}
        else if(n == 0) return "";
        return exercicio6(n/2)+ Integer.toString(n%2);
    }
    public static int exercicio7(ArrayList<Integer> list){
        if(list == null)throw new NullPointerException("por que trolas meu programinha");
        if(list.size() == 0)
            return 0;
        else if(list.size() == 1)
            return list.get(0);
        return list.get(0) + exercicio7(new ArrayList<Integer>(list.subList(1,list.size())));
    }
    public static int exercicio8(ArrayList<Integer> l) throws NullPointerException{
        if(l.size() == 1)
            return l.get(0);
        if(l.get(0) > l.get(l.size()-1)) Collections.swap(l,0,l.size()-1);
        return exercicio8(new ArrayList<Integer>(l.subList(1,l.size())));
    }
    public static boolean exercicio9(String str,String match){

    }
}