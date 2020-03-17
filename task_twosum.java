package sara_mohamed;
import java.util.*;
import java.util.Arrays;
public class task_twosum {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("please enter the target sum");
	int sum=input.nextInt();
	if(sum<=0){
		System.out.println("zero and negative numbers are invalid");
	}
	System.out.println("please enter the count of numbers");
	int rlen=input.nextInt();
    int[] r=new int[rlen];
    for(int i=0;i<rlen;i++){
    	System.out.println("please enter the numbers");
    	r[i]=input.nextInt();
    }
    
    for(int i=0;i<rlen;i++){
    	for(int j=i+1;j<rlen;j++){
    		if((r[i]+r[j])==sum)
    			System.out.println("the sum of the numbers at indices "+i++ +" and "+ j++ +" = "+sum);
    	}
    }
    
    
	}

}
