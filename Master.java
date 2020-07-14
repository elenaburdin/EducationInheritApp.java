
class Master extends Student {

	public Master( String fullname, int age, double average_grade, byte level, String university_name, String speciality ) {
		super( fullname, age, average_grade, level, university_name, speciality );
		setLevel(level);
		setAge(age);
		
		
	}
	
	public void setLevel( byte level ) {
		if ( level >= 1 && level <= 3 )
			this.level =  level;
		else System.err.println( "Wrong level" );
	
	}
	public void setAge(int age) {
		if ( age >= 22 && age <= 33 )
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


