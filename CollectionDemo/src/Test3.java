import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create TreeSet
		Set<String> mySet = new TreeSet<String>();
		// Add Strings
		mySet.add("Alan");
		mySet.add("Carol");
		mySet.add("Bob");
		// Get Iterator
		Iterator it = mySet.iterator();
		while (it.hasNext())
		{
		System.out.println(it.next());
		}
		}
		}
	