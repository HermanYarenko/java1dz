import java.util.Arrays;
public class program2 {
    /*вывод чисел */
    public static void main(String[] args) {
        int [] arr  = new int[1001];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;    
        } 
        simple(arr); 
    }    
        static void simple(int[] res ) {
      
            for (int i = 0; i < res.length; i++) {
                if (((res[i]==3 || res[i]==2 ) ||(res[i]%2!=0 && res[i]%3!=0))&&( res[i]!=1)) {
                    System.out.println(i); 
                }
            } 

        }
}
    

