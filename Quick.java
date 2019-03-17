import java.util.Arrays;
public class Quick {

	public static int partition(int[]ary, int begin,int finish){// index is for testing
  //  System.out.println(Arrays.toString(ary));
	//	System.out.println("6 should be at beginning");
		int chosen=(int)(Math.random()*finish+1-begin)+begin;// switch this with index at next line
		int pivotIndex=chosen;
    System.out.println(pivotIndex+"this ispivotindex");
		int pivot=ary[pivotIndex];
		int start=begin;
		int end=finish;
		int dummy=ary[start];
		ary[start]=pivot;
		ary[pivotIndex]=dummy;
	  boolean dumb=true;
		while(dumb){
			System.out.println(Arrays.toString(ary));
			for(int i=end;i>=start;i--){
				if(i==start){
					int store=ary[i];
					ary[i]=pivot;
					ary[begin]=store; // it seems swiching the begin and start caused erro
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
					ary[begin]=store;
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
	public static int quickSelect(int[]ary,int k){
    int start=0;
		int end=ary.length-1;
		while (true){
		  int compare=partition(ary,start,end);
			if(compare==k){
				return ary[k];
			}
			else if(compare>k){
				end=compare;
			}
			else if(compare<k){
				start=compare;
			}
		}
	}
	public static void quicksortH (int[]ary,int start,int end){
		int pivot=partition(ary,start,end);
		while(start!=end){
			if(pivot==ary.length-1){
				quicksortH(ary,start,pivot-1);
			}
			else if(pivot==0){
				quicksortH(ary,pivot+1,end);
			}
			else{
			quicksortH(ary,start,pivot-1);
			quicksortH(ary,pivot+1,end);
		  }
			start=end;
		}

	}
	public static void quicksort(int[]ary){
		quicksortH(ary,0,ary.length-1);
	}



	public static void main(String[]args){
		int[]ary={6,3,2,8};
		//System.out.println(partition(ary,0,4));
		quicksort(ary);
		System.out.println(Arrays.toString(ary));
	}

}
