package backtracking;
// Qs. print all permutations of a given string
public class backtracking1 {
public static void permutations(String str,String perm,int index) {
	//base case
	if(str.length()==0) {
		System.out.println(perm);
		return;
	}
	for(int i=0;i<str.length();i++) {
		char currChar=str.charAt(i);
		String newStr=str.substring(0,i)+str.substring(i+1);
		permutations(newStr,perm+currChar,index+1);
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="ABC";
permutations(str,"",0);
	}

}
