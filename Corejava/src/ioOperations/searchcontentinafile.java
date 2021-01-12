package ioOperations;

import java.io.BufferedReader;
import java.io.FileReader;

class searchoperation{
	public void search(){
		String s1;
		String s="Read and Write";
		FileReader fr=null;
		BufferedReader br=null;
		try{
			fr=new FileReader("C:\\Users\\yerraguntla.r\\Desktop\\abc.txt");
			br= new BufferedReader(fr);
			while((s1=br.readLine())!=null){
				if(s1.contains(s)){
					System.out.println("Content is in the string");
				}
				else{
					System.out.println("There is no content in the string");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
public class searchcontentinafile {

	public static void main(String[] args) {
		searchoperation content=new searchoperation();
		content.search();
	}

}
