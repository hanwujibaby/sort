
public class PopupSort {
	
	
	public static void main(String[] args) {
		
		int[] array=new int[20];
		
		//初始化数据
		for(int i=0;i<20;i++){
			array[i]=(int)(Math.random()*100);
			System.out.println(array[i]);
		}
		System.out.println("array's size:"+array.length);
		
		
		//排序开始
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++)
			if(array[i]>array[j]){
				array[i]^=array[j];
				array[j]^=array[i];
				array[i]^=array[j];
			}
		}
		
		for(int i=0;i<array.length;i++){
			System.out.println("array:"+array[i]);
		}
		
		
	}

}
