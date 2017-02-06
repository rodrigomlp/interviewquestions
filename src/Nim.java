
public class Nim {
    public static boolean canWinNim(int n) {
        int mul = 3;
       
        
        while(mul < n -3){
            mul*=2;
        }
        
        int counter = n - mul;
        System.out.println(counter);
        if(counter < 0 || counter%2 == 0)
            return true;
        else
            return false;
    }
    public static void main(String[]args){
    	System.out.println(canWinNim(4));
    }
}
