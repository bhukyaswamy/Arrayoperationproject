package programmingcls;

public class Array_Operation {
	public int[] insert(int a[], int ele, int pos) {
		if(pos>a.length+1 || pos<1) {
			System.out.println("Insertion not possible");
		}
		else {
			int res[] = new int[a.length+1];
			for (int i = 0,j=0; i < res.length; i++) {
				if(i==(pos-1)) {
					res[i]=ele;
				}
				else {
					res[i]=a[j++];
				}
			}
			return res;
		}
		return a;
	}
	public int[] deleteion(int a[], int ele) {
		if(a.length<=0) {
			System.out.println("Array is empty");
			return a;
		}
		else if(search(a,ele)==-1) {
			System.out.println("Deleting element is not present");
			return a;
		}
		else {
			int[] res=new int[a.length-1];
			int ind=search(a,ele);
			for (int i = 0,j=0; i < a.length; i++) {
				if(i!=ind) {
					res[j++]=a[i];
				}
			}
			return res;
		}
	}
	public int[] update(int a[], int re, int ne) {
		if(a.length==0) {
			System.out.println("Array is empty..");
		}
		else {
			if(search(a,re)==-1) {
				System.out.println("Replacing element is not present..");
			}
			else {
				for (int i = 0; i < a.length; i++) {
					if(a[i]==re) {
						a[i]=ne;
					}
				}
			}
		}
		return a;
	}
	public  void sort(int a[]) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length-i; j++) {
				if(a[j-1]>a[j]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public int search(int a[], int ele) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==ele) {
				return i;
			}
		}
		return -1;
	}
	public int[] reverse(int a[]) {
		int rev[] =new int[a.length];
		for (int i = 0,j=a.length-1; i < a.length; i++,j--) {
			rev[i]=a[j];
		}
		return rev;
	}
	public void display(int a[]) {
		for(int i :a) {
			System.out.print(i+" ");
		}
	}
	public int min(int a[]) {
		int min=a[0];
		for (int i = 1; i < a.length; i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	public int max(int a[]) {
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	public boolean isEmpty(int a[]) {
		return a.length==0;
	}
	
}
