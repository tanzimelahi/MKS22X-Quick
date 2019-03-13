import java.util.Arrays;
public class Quick {

	public static int partition(int[]ary){
	//	int chosen=(int)(Math.random()*ary.length);
		int pivotIndex=3;
		int pivot=ary[pivotIndex];
		int start=0;
		int end=ary.length-1;
		int dummy=ary[0];
		ary[0]=pivot;
		ary[pivotIndex]=dummy;
	  boolean dumb=true;
		while(dumb){
			System.out.println(Arrays.toString(ary));
			for(int i=end;i>=start;i--){
				if(i==start){
					int store=ary[i];
					ary[i]=pivot;
					ary[0]=store;
					return i;
				}
			 else if(ary[i]<pivot){
				 end=i;
				 break;
			 }
			}
			for(int i=start;i<=end;i++){
				if(i==end){
					int store=ary[i];
					ary[i]=pivot;
					ary[0]=store;
					return i;
				}
				 if(ary[i]>pivot){
					start=i;
					break;
				}
			}
			int store=ary[start];
			ary[start]=ary[end];
			ary[end]=store;
		}
		return -1;
	}
	public static void main(String[]args){
		int[]ary={6,3,2,8,-1};
		System.out.println(partition(ary));
		System.out.println(Arrays.toString(ary));
	}

}
