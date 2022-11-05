package pojoClass;

public class ProjectLibrary {
	
	String address;
	String description;
	String name;
	String leader;
	int ranking;
	
	public ProjectLibrary() {
		
	}

	public ProjectLibrary(String address, String description, String name, String leader, int ranking) {
		super();
		this.address = address;
		this.description = description;
		this.name = name;
		this.leader = leader;
		this.ranking = ranking;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	
}
