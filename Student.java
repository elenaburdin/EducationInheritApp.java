
public class Student extends Pupil {

	 protected String university_name;
	 protected String speciality;
	 
	// Constructor
	 public Student( String fullname, int age, double average_grade, byte level, String university_name, String speciality ) {
			super( fullname,age,average_grade,level, university_name );
			setUniversity_name(university_name);
			setSpeciality(speciality);
	}

	// Setters and Getters
	public String getUniversity_name() {
		return university_name;
	}

	public void setUniversity_name( String university_name ) {
		this.university_name = university_name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality( String speciality ) {
		this.speciality = speciality;
	}
	
	
	public void setLevel( byte level ) {
		if ( level >= 1 && level <= 7 )
			this.level =  level;
		else System.err.println( "Wrong level" );
	
	}
	public void setAge( int age ) {
		if ( age >= 19 && age <= 30 )
			this.age = age;
		else System.err.println( "Wrong age" );
	
	}
	public void printInfo() {
		System.out.println();
		System.out.println( "Fullname: " + fullname+ " ( "+ age + " years "+") ");
		System.out.println( "Class: " + level );
		System.out.println( "Grade: " + average_grade );
		System.out.println( "University name: " + university_name );
		System.out.println( "Speciality: " + speciality );
		
	}

}
