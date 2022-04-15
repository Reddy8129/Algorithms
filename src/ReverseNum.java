public class ReverseNum {
	
	int revNum(int num)
	{
		int rev=0,last_dig;
		while(num>0){
			last_dig=num%10;
			rev=(rev*10)+last_dig;
			num=num/10;
		}
		return rev;
	}
		
	
}
