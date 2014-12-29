import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class Phpfile
{

	void funPhp(File fin) throws IOException
	{
		FileInputStream fis = new FileInputStream(fin);
		BufferedReader br= new BufferedReader(new InputStreamReader(fis)); 
		String line="";
		String cls="class";
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
		methodPhp(fin);
	}
	
	void methodPhp(File fin) throws IOException
	{
		FileInputStream fis = new FileInputStream(fin); 
		BufferedReader br= new BufferedReader(new InputStreamReader(fis)); 
		String line = null;
		String str="function";
		int i=0;
		String para="";
		while ((line = br.readLine()) != null) 
		{
			if(line.contains("public"))
			{
				para="public";
			}
			else if (line.contains("private"))
			{	
					para="private";
			}
			else if (line.contains("protected"))
			{	
					para="protected";
			}
			if(line.contains(str))
			{
				StringBuffer strbuf=new StringBuffer("");
				i=line.indexOf(str);
				for(i=i;i<line.length();i++)
				{
					strbuf.append(line.charAt(i)); 
				}
				System.out.println("Access Specifier: "+para+"\tFunction Name: "+strbuf);
			}
		}
		varPhp(fin);
	}

	
	void varPhp(File fin) throws IOException
	{
			FileInputStream fis = new FileInputStream(fin); 
			BufferedReader br= new BufferedReader(new InputStreamReader(fis)); 
			String line = null;
			String str="a-z";
			String dollar="$";
			int i=0;
			String para="";
			while ((line = br.readLine()) != null) 
			{
				if(line.contains("public"))
				{
					para="public";
				}
				else if (line.contains("private"))
				{	
						para="private";
				}
				else if (line.contains("protected"))
				{	
						para="protected";
				}
				if(line.contains(dollar))
				{
						if(line.contains(str))
							if(line.contains("=' "))
							{
								StringBuffer strbuf=new StringBuffer("");
								i=line.indexOf(dollar);
								for(i=i;i<line.length();i++)
								{
									strbuf.append(line.charAt(i)); 
								}
								System.out.println("Access Specifier: "+para+"\tVariable Name: "+strbuf);
							}
				}
			}

	}
}