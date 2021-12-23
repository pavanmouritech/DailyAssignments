import java.util.Comparator;

public class RevStrComparator implements Comparator<String> {


		public int compare(String s1, String s2)
		{
		return - s1.compareTo(s2); // Note the negation operator
		}
		}
	


