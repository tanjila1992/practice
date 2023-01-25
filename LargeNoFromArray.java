package program;

public class LargeNoFromArray {
	public static void main(String[] args) {
		int a[]= {1,6,3,8,10,5,4,9},temp=a[0];
		for(int i=1;i<a.length;i++) {
			if(temp<a[i]) {
				temp=a[i];
			}
		}
		System.out.println("Large no from array: "+temp);
	}

}
