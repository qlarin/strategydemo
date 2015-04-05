
public class PersonTest {

	public static void main(String[] args){
		
		Person tomasz = new Person("Tomasz", 24);
		Person karolina = new Person("Karolina", 20);
		
		PersonValidator newValid = new MalePersonValidator();
		
		Archive maleArchive = new Archive(newValid);
		maleArchive.addPerson(tomasz);
		maleArchive.addPerson(karolina);
		
		System.out.println("Mê¿czyŸni w archiwum: ");
		System.out.println(maleArchive);
	}
	
}
