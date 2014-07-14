public class QuickSort {
	
	private  int[] a;

	void sort( int left, int right) {
		if (a.length == 0)
			return;
		if(left>right)
			return;

		int t = a[left];
		int i=left;
		int j=right; 
		while ( i!= j) {
			while (a[j] >= t && i < j) {
				j--;
			}
			while (a[i] <= t && i < j) {
				i++;
			}

			if (i < j) {
				a[i] ^= a[j];
				a[j] ^= a[i];
				a[i] ^= a[j];
			}

		}

		int m = a[i];
		a[i] = t;
		a[left] = m;

		sort(i + 1, right);
		sort(left, i - 1);
		
		System.out.println("========");
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}

	}

	public static void main(String[] args) {
		
		QuickSort q=new QuickSort();
		q.a=new int[10];

		// 初始化数据
		for (int i = 0; i < 10; i++) {
			q.a[i] = (int) (Math.random() * 100);
			System.out.println(i + ":" + q.a[i]);
		}
		
		q.sort(0, q.a.length-1);

		for (int i = 0; i < q.a.length; i++) {
			System.out.println(q.a[i]);
		}

	}

}
