import java.util.ArrayList;

public class Recursions{
        public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>(5);
        a.add(1);
        a.add(2);
        a.add(8);
        a.add(5);
        a.add(3);
        System.out.println(exercicio8(a));
        //System.out.println(exercicio7(25));
    }
    public static int exercicio1(int n){
        if(n<0) {
            System.out.println("por que trolas meu programinha ?");
            return -1;
        }
        else if(n==0)return 1;
        return n * exercicio1(n-1);
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
        if(n<=0){System.out.println("por que trolas meu programinha ?");return 0;}
        else if(n==1)return 1;
        else if(n==2)return 1;
        return exercicio3(n-1)+exercicio3(n-2);
    }
    public static int exercicio4(int k, int j){
        if(k > j){System.out.println("por que trolas meu programinha ?");return 0;}
        if(k == j)
            return k;
        return j + exercicio4(k,j-1);

    }
    public static boolean exercicio5(String palavra){
        if(palavra==null){System.out.println("por que trolas meu programinha ?");return false;}
        else if(palavra.length()<=1) return true;
        else if(palavra.charAt(0)==palavra.charAt(palavra.length()-1))return exercicio5(palavra.substring(1,palavra.length()-1));
        else return false;
    }
    public static String exercicio6(int n){
        if(n<0){System.out.println("por que trolas meu programinha ?");return "false";}
        else if(n==0)return "0";
        else if(n==1)return "1";
        return exercicio6(n/2)+exercicio6(n%2);
    }
    public static int exercicio7(ArrayList<Integer> list){
        if(list == null){System.out.println("por que trolas meu programinha ?");return -1;}

        if(list.size() == 0)
        return 0;
        else if(list.size() == 1)
            return list.get(0);
        return list.get(0) + exercicio7(new ArrayList<Integer>(list.subList(1,list.size())));
    }
    private static int exercicio8aux(ArrayList<Integer> l, int n){
        if(l.size()==0)return n;
        else if(l.get(0)>n)return exercicio8aux(new ArrayList<Integer>(l.subList(1,l.size())),l.get(0));
        else return exercicio8aux(new ArrayList<Integer>(l.subList(1,l.size())),n);
    }
    public static int exercicio8(ArrayList<Integer> l){
        if(l==null){System.out.println("por que trolas meu programinha ?");return -1;}
        return exercicio8aux(l,l.get(0));
    }
}