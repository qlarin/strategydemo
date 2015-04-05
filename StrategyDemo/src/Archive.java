import java.util.ArrayList;
import java.util.List;


public class Archive {

	private List<Person> persons;
	private PersonValidator validator;
	
	public Archive(PersonValidator validator){
		this.validator = validator;
		persons = new ArrayList<Person>();
	}
	
	public void addPerson(Person person){
		if(validator.validate(person)){
			persons.add(person);
		}
	}
	
	public String toString(){
		String out = "";
		for(Person p : persons){
			out += p.getName() + "\n";
		}
		return out;
	}
	
}
