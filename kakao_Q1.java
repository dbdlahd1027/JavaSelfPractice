import java.util.*; 
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        // int n = 5 ;
        // int [ ] arr1 = {  9, 20, 28, 18, 11 } ;
        // int [ ] arr2 = { 30,  1, 21, 17, 28 } ;
        
        int n = 6;
        int [ ] arr1 = {46, 33, 33 ,22, 31, 50} ;
        int [ ] arr2 = {27 ,56, 19, 14, 14, 10};
        myMethod( n, arr1, arr2 );

     }
     static void myMethod(int n, int [] arr1, int [] arr2){
        if( arr1.length == arr2.length && arr2.length == n ){
            String [] result = new String [n];
            String temp;
            for (int i = 0 ; i< arr1.length; i++){
                temp = Integer.toBinaryString(arr1[i]|arr2[i]); 
                temp = temp.replace('1','#');
                temp = temp.replace('0',' ');
                result[i] = String.format("\"%s\"", temp);
            }
            System.out.printf( Arrays.toString(result) ); 
        }
        
        
     }
}
