package stringspack;

public class Checkword {

	public static void main(String[] args) {
		String s="The quick is brown fox jumps over is the lazy dog";
		String s1[]=s.split(" ");
	for(int i=0;i<s1.length-1;i++){
		if(s1[i].equals("is")){
			System.out.println(s1[i]+ "word is in the String");
			continue;
		}
		else{
			System.out.println("NOppp");
			break;
		}
	}
	}

}
