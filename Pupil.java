
class Pupil extends Educated {
	 private String school_name;
	 
	// Constructor
	public Pupil( String fullname, int age, double average_grade, byte level, String school_name ) {
		super(fullname, age, average_grade, level);
		
		setSchool_name(school_name);
		setLevel(level);
		
	}

	// Setters and Getters
	
	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name( String school_name ) {
		this.school_name = school_name;
	}
	
	public void setLevel(byte level) {
		if ( level >= 1 && level <= 12 )
			this.level =  level;
		else System.err.println( "Wrong level" );
	
	}
	
	public void setAge(int age) {
		if ( age >= 6 && age <= 20 )
			this.age = age;
		else System.err.println( "Wrong age" );
	
	}
	public void printInfo() {
		System.out.println();
		System.out.println( "Fullname: " + fullname+ " ( "+ age + " years "+") ");
		System.out.println( "Class: " + level );
		System.out.println( "Grade: " + average_grade );
		System.out.println( "School name: " + school_name );
	}
}
