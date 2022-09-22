import java.io.*;
import java.util.*;
import java.util.*;
public class FileHandling {
public static void main(String args[]) throws IOException, FileNotFoundException
{   FileInputStream fin= new FileInputStream("abcd.txt");
	FileOutputStream output= new FileOutputStream("abcde.txt", true);
	Scanner sc= new Scanner(System.in);
	String s=sc.nextLine();
	byte b[]= s.getBytes();
	int i;
	
	
while((i=fin.read())!=-1)	
output.write(i);
output.write(" ".getBytes());

output.write(b);
fin.close();
 output.close();
 
sc.close();
}}
