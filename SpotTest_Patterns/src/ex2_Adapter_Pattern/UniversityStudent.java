package ex2_Adapter_Pattern;

public class UniversityStudent implements Student {

	String FullName;
	String Age;
	String Contact;
	
	@Override
	public void getFullName() {
		// TODO Auto-generated method stub
		Person person = new Person();
		FullName = person.Fname.concat(" ").concat(person.Lname);
		System.out.println("Full Name Is: "+FullName);
		

	}

	@Override
	public void getAge() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getContactNumber() {
		// TODO Auto-generated method stub

	}

}
