import java.util.Arrays;
public class Quick {
	public static void partition(int nth,int[]ary) {

	}
	public static int helper(int[]ary) {
		int chosen=(int)(Math.random()*ary.length);
		int pivot=ary[chosen];
		int up=0;
		int down=ary.length-1;
		while(up!=down) {
			for(int i=0;i<ary.length;i++) {
				if(ary[i]>pivot) {
					up=i;
					break;
				}
			}
			for(int i=ary.length-1;i>=0;i--) {
				if(ary[i]<pivot) {
					down=i;
					break;
				}
			}
			int dummy=ary[up];
			ary[up]=ary[down];
			ary[down]=dummy;
		}
		return up;
	}

}
