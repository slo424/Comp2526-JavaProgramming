package examples.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * This program demonstrates the use of a map with key type String and value type Employee.
 */
public class MapTest {

	public static void main(String[] args) {
		Map<String, Employee> staff = new LinkedHashMap<String, Employee>(101, 0.75F, true);
		staff.put("144-25-5464", new Employee("Angela Hung"));
		staff.put("567-24-2546", new Employee("Harry Hacker"));
		staff.put("157-62-7935", new Employee("Gary Cooper"));
		staff.put("456-62-5527", new Employee("Francesca Cruz"));

		// print all entries
		System.out.println(staff);

		// remove an entry
		staff.remove("567-24-2546");

		// replace an entry
		staff.put("456-62-5527", new Employee("Francesca Miller"));

		// look up a value
		System.out.println(staff.get("157-62-7935"));

		// iterate through all entries
		Set entries = staff.entrySet();
		Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println("key=" + key + ", value=" + value);
		}
	}
}