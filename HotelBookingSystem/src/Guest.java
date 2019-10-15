
public class Guest {
	private String name;
	private Address privateAdresse;
	private Address businessAdresse;
	public Guest(String name){
		this.name=name;
	}
	public void setPrivateAddresse(Address privateAdresse) {
		this.privateAdresse=privateAdresse;
	}
	@Override
	public String toString() {
		return "Guest [name=" + name + ", privateAdresse=" + privateAdresse + ", businessAdresse=" + businessAdresse
				+ "]";
	}

}
