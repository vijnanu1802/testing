package ioOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class read2files{
	public void read2file(){
		FileReader fr=null;
		FileReader fr1=null;
		BufferedReader br=null;
		BufferedReader br1=null;
		String s;
		String s1;
		try {
			fr1=new FileReader("C:\\Users\\yerraguntla.r\\Desktop\\reader2.txt");
			fr=new FileReader("C:\\Users\\yerraguntla.r\\Desktop\\reader1.txt");
			br=new BufferedReader(fr);
			br1=new BufferedReader(fr1);
			while(((s=br.readLine())!=null)&&(s1=br1.readLine())!=null){
				if(s.equals(s1)){
					System.out.println("Equal");
				}
				else{
					System.out.println("Not Equal");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
public class read2filesandcompare {

	public static void main(String[] args) {

		read2files r=new read2files();
		r.read2file();
	}

}
