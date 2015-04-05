
public class MalePersonValidator implements PersonValidator{

	public boolean validate(Person person){
		String name = person.getName();
		return name.charAt(name.length()-1)!='a';
	}
	
}
