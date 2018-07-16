import java.util.*;

class DnDcharacter implements Comparable<DnDcharacter> {
	
	String name; // stores the name of the character
	Integer skill; // stores the skill that we sort the characters by
	
	public int compareTo(DnDcharacter c) {
		return (skill - c.skill);
	}
	
	public DnDcharacter(String _name, Integer _skill) {
		name = _name;
		skill = _skill;
	}
	
	public String toString() {
		return (name + " (" + skill + ")");
	}
}

public class DnDSample {

	public static void main(String[] args) {
		
		HashMap<String, HashMap<String, Integer>> hm = new HashMap<String, HashMap<String, Integer>>();
		
		hm.put("Ant man - Barbossa", new HashMap<String, Integer>());
		hm.get("Ant man - Barbossa").put("strength", 25);
		hm.get("Ant man - Barbossa").put("wisdom", 15);
		hm.get("Ant man - Barbossa").put("intelligence", 30);
		hm.get("Ant man - Barbossa").put("charisma", 555);
		hm.get("Ant man - Barbossa").put("constitution", 728723648);
		
		hm.put("Mani Kent - Cucumber", new HashMap<String, Integer>());
		hm.get("Mani Kent - Cucumber").put("strength", 17);
		hm.get("Mani Kent - Cucumber").put("wisdom", 22);
		hm.get("Mani Kent - Cucumber").put("intelligence", 9);
		hm.get("Mani Kent - Cucumber").put("charisma", 5);
		hm.get("Mani Kent - Cucumber").put("constitution", 728);
		
		hm.put("Pickle Rick - Pickle", new HashMap<String, Integer>());
		hm.get("Pickle Rick - Pickle").put("strength", 4);
		hm.get("Pickle Rick - Pickle").put("wisdom", 3454);
		hm.get("Pickle Rick - Pickle").put("intelligence", 93453);
		hm.get("Pickle Rick - Pickle").put("charisma", 523);
		hm.get("Pickle Rick - Pickle").put("constitution", 4);
		
		PriorityQueue<DnDcharacter> pq = new PriorityQueue<DnDcharacter>();
		Scanner s = new Scanner(System.in);
		String skill = s.nextLine().toLowerCase();
		Set<String> set = hm.keySet();
		for(String name : set)
			pq.add(new DnDcharacter(name, hm.get(name).get(skill)));
		while (pq.size() > 0)
			System.out.println(pq.poll());
	}

}













