package ch01;

import java.util.Arrays;

public class TwoSumFast {
	public static int main(String[] args) {
		String string=null;
		string=ScannerIn.input(string);
		
		String[] strarray=string.split(" ");
		int[] intarray=new int[strarray.length];
		for(int i=0;i<strarray.length;i++){
			intarray[i]=Integer.parseInt(strarray[i]);
		}
		
		Arrays.sort(intarray);
		int N=intarray.length;
		int count=0;
		for(int i=0;i<N;i++)
			if(BinarySearch.rank(-intarray[i],intarray)>i)
				count++;
		return count;
	}

}
