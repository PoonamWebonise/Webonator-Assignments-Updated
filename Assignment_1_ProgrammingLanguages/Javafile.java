import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Javafile {

	void funJava(File fin) throws IOException
	{
		FileInputStream fis = new FileInputStream(fin); 
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		int i=0;
		String cls="class";
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
			else if(line.contains("void"))
			{
				para="void";
			}
			else if(line.contains(""))
			{
				para="";
			}
			if(line.contains(cls))
			{
				StringBuffer strbuf =new StringBuffer(""); 
				i=line.indexOf(cls); 
				for(i=i;i<line.length();i++)
				{
					strbuf.append(line.charAt(i)); 
				}
				System.out.println("Access Specifier: "+para+"\tClass Name: "+strbuf);
			}
		}
		methodJava(fin);
	}
	
	void methodJava(File fin) throws IOException
	{
		FileInputStream fis = new FileInputStream(fin); //Construct BufferedReader from InputStreamReader
		BufferedReader br= new BufferedReader(new InputStreamReader(fis)); 
		String line = null;
		int i=0;
		String para="";
		String str="a-z";
		//String brackets="()";
		String type="";
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
			else if(line.contains("void"))
			{
					para="void";
			}
			
			if(line.contains("String"))
			{
				type="String";
			}
			else if(line.contains("void"))
			{
				type="void";
			}
			if(line.contains(str))
			{
				System.out.println(str);
				i=line.indexOf(para);
				System.out.println("i="+i);
				int x=i+para.length();
				StringBuffer strbuf =new StringBuffer(""); 
				for(i=i;i<line.length();i++)
				{
					strbuf.append(line.charAt(i)); 
				}
					if(line.contains("()"))
					{
						System.out.println("Access Specifier: "+para);
						System.out.println("Return Type: "+type);
						System.out.println("Method Name:  "+strbuf);
					}
					else if(line.contains(";"))
					{
					System.out.println("Access Specifier: "+para);
					System.out.println("Return Type: "+type);
					System.out.println(" Function Name:  "+strbuf);
					}
			}
		}
	}
}

