package backtracking;
import java.util.*;
// qs permutation using swaping without using any data structure to reduce space complexity
public class Backtracking2 {
	public static void permutation(int []arr,List<List<Integer>>ans,int index) {
		if(index==arr.length) {
			List<Integer>ds=new ArrayList<>();
			for(int i=0;i<arr.length;i++) {
				ds.add(arr[i]);
			}
			ans.add(new ArrayList<>(ds));
			return;
		}
		for(int i=0;i<arr.length;i++) {
			swap(i,index,arr);
			permutation(arr,ans,index+1);
			swap(i,index,arr);
		}
	}
	public static void swap(int i,int j,int []arr) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
public static List<List<Integer>>permute(int []arr){
	List<List<Integer>>ans=new ArrayList<>();
	permutation(arr,ans,0);
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3};
		
		System.out.println(permute(arr));
		
		

	}

}
