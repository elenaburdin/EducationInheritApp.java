public class EducationInheritApp {

	public static void main(String[] args) {
		
		Educated Weasley = new Educated("Ron Weasley", 16, 7.8, (byte) 12);
		Weasley.printInfo();
		
	    Pupil Potter = new Pupil("Harry Potter", 16, 8.9, (byte) 12, "Hogwarts");
	    Potter.printInfo();
	    
	    Student Granger = new Student("Hermione Granger", 20, 10.0, (byte) 1, "Oxford of Magic", "Department for the Regulation and Control of Magical Creatures");
	    Granger.printInfo();
	    
	    Master Draco = new Master("Draco Malfoy", 25, 10.0, (byte) 3, "Oxford of Magic Perfection", "Maestro of Magic");
	    Draco.printInfo();

	}

}


