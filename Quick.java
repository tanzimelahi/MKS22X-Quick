import java.util.Arrays;
public class Quick {

	public static int partition(int[]ary, int begin,int finish){// index is for testing
  //  System.out.println(Arrays.toString(ary));
	//	System.out.println("6 should be at beginning");
		int chosen=begin+(int)( Math.random() *(finish-begin+1));// switch this with index at next line
		int pivotIndex=chosen;
   // System.out.println(pivotIndex+"this ispivotindex");
       // if(pivotIndex==2) {
        //	throw new IllegalArgumentException();

        //}
		int pivot=ary[pivotIndex];
		int start=begin;
		int end=finish;
		int dummy=ary[start];
		ary[start]=pivot;
		ary[pivotIndex]=dummy;
	  boolean dumb=true;
		while(dumb){
		    //System.out.println(Arrays.toString(ary));
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
			if(pivot==end){
				quicksortH(ary,start,pivot-1);
			}
			else if(pivot==start){
				quicksortH(ary,pivot+1,end);
			}
			else{
			quicksortH(ary,start,pivot-1);
			quicksortH(ary,pivot+1,end);
		  }
			//System.out.println("passed through all those");
			start=end;
		}

	}
	public static void quicksort(int[]ary){
		quicksortH(ary,0,ary.length-1);
	}




	public static void main(String[]args){
		int[]ary = {6,8,10,-2,8,8};
		int[]test=new int[100000000];
		for(int i=0;i<test.length;i++) {
			test[i]=8;
		}
	    quicksort(test);
	    System.out.println(Arrays.toString(test));

	}

}
