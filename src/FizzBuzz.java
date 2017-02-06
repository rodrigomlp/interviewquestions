import java.awt.List;
import java.util.ArrayList;

public class FizzBuzz {
	
	public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 1; i <= n ; i++ ){
            if(i%15 == 0){
                arr.add("FizzBuzz");
            }
            else if(i%3 == 0){
                arr.add("Fizz");
            }
            else if(i%5 == 0){
                arr.add("Buzz");
            }
            else{
            arr.add(Integer.toString(i));
            }
        }
        return arr;
    }

}
