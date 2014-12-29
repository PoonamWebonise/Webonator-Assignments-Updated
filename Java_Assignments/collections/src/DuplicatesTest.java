import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class DuplicatesTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string="I came I Saw I conqured I went";
		ArrayList<String> arraylist=new ArrayList<String>();
		System.out.println("All Words are: ");
		String[] allWords = string.split(" ");
		for(String eachWord:allWords)
		{
			arraylist.add(eachWord);
		}
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
		Set<String> treeSet=new TreeSet<String>();
		treeSet.addAll(arraylist);
		Iterator iterator=treeSet.iterator();
		System.out.println("Duplicates removed are: ");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		{
	}

}
	}
}