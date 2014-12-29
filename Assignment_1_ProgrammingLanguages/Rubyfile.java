import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Rubyfile {
	void funRuby(File fin) throws IOException
	{
		FileInputStream fis = new FileInputStream(fin); 
		BufferedReader br= new BufferedReader(new InputStreamReader(fis)); 
		String line="";
		String cls="class";
		String end="end";
		int i=0;
		while ((line = br.readLine()) != null) 
		{
			if(line.contains(cls))
			{
				StringBuffer strbuf =new StringBuffer(""); 
				i=line.indexOf(cls); 
				for(i=i;i<line.length();i++)
				{
					strbuf.append(line.charAt(i)); 
				}
				System.out.println("Class Name: "+strbuf);
			}
		}
		methodRuby(fin);
	}	
	
	void methodRuby(File fin) throws IOException
	{
		FileInputStream fis = new FileInputStream(fin); 
		BufferedReader br= new BufferedReader(new InputStreamReader(fis)); 
		String line="";
		String str="def";
		int i=0;
		while ((line = br.readLine()) != null) 
		{
			if(line.contains(str))
			{
				StringBuffer strbuf =new StringBuffer(""); 
				i=line.indexOf(str);
				for(i=i;i<line.length();i++)
				{
					strbuf.append(line.charAt(i)); 
				}
				System.out.println("Function Name: "+strbuf);
			}
		}
		varRuby(fin);
	}
		
	void varRuby(File fin) throws IOException
	{
		FileInputStream fis = new FileInputStream(fin); 
		BufferedReader br= new BufferedReader(new InputStreamReader(fis)); 
		String line="";
		String str="@@";
		int i=0;
		while ((line = br.readLine()) != null) 
		{
			if(line.contains(str))
			{
				StringBuffer strbuf =new StringBuffer(""); 
				i=line.indexOf(str);
				for(i=i;i<line.length();i++)
				{
					strbuf.append(line.charAt(i)); 
				}
				System.out.println("Variable Name: "+strbuf);
					
		
			}
		}
	}
}
