package week1;

import java.util.Arrays;

public class Day3_Duplicates 
{
	public static void main(String[] args) {
		
	
//Method 1:
	int [] marks= {14,12,13,11,15,14,18,16,17,19,18,17,20};
	
	int length=marks.length;
	System.out.println(length+" "+"is the array length");
	
	Arrays.sort(marks);
	
	for(int i=0;i<length-1;i++) 
	{
		if(marks[i]==marks[i+1]) 
		{
			System.out.println(marks[i]+" "+"is duplicate");
			
		}
		
	}
	System.out.println("----------------------------------------------------------------------");
	System.out.println("Duplicates Method 2---Swapping without using arrays.sort");
	int d;
	for(int i=0;i<length-1;i++) 
	{
	if(marks[i]==marks[i+1]) 
	{
	d=marks[i];
	marks[i]=marks[i+1];
	marks[i+1]=d;
	
	System.out.print(d+" ");
	}
	
	}
	
	
	
	
}
}