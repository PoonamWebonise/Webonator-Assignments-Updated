import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;



public class TraverseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AllList listObject=new AllList();
		System.out.println("Array List: ");
		listObject.arrayList();
		System.out.println("Hash Map List: ");
		listObject.arrayList();
	}

}

class AllList {
	
	void arrayList(){
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("collection");
		arraylist.add("list");
		arraylist.add("arraylist");
		arraylist.add("linklist");
		arraylist.add("queue");
		Iterator<String> iterator=arraylist.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	void hashList(){
		HashMap<Integer, String> hashmap=new HashMap<Integer, String>();
		hashmap.put(101, "java");
		hashmap.put(102, "ruby");
		hashmap.put(103, "php");
		hashmap.put(104, "html");
		hashmap.put(105, "javascript");
		
		for(Entry<Integer, String> m:hashmap.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}