import java.io.*;
public class Main
{   
    
    static boolean checkValue(String[] arr, String key){
        int len = arr.length;
        for(int i=0;i<len;i++){
            if(key == arr[i]){
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		String[] arr = {"test","testing","tester"};
		String key = "test";
		System.out.println(checkValue(arr,key));
		
	}
}
