package ioOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class readwrite{
	public void writeOperation(){
		String s="This is Read and Write and extra 123456789 Operation";
		FileWriter fr=null;
		BufferedWriter br=null;
		FileReader fw=null;
		BufferedReader bw=null;
		try {
			fr=new FileWriter("C:\\Users\\yerraguntla.r\\Desktop\\abc.txt");
			br=new BufferedWriter(fr);
			//fr.write("This is Read and Write Operation");
			br.write(s);
			System.out.println("Succesfull");
			fw=new FileReader("C:\\Users\\yerraguntla.r\\Desktop\\abc.txt");
			bw=new BufferedReader(fw);
			String s1=bw.readLine();
			//while(s1!=null){
			System.out.println("String s1 is :"+s1);
			//}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
				fr.close();
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
public class Filereadandwriteoperations {

	public static void main(String[] args) {
		readwrite r=new readwrite();
		r.writeOperation();
	}

}
