
class Educated {
	
	String fullname;        // info
    int   age;              // age
    double  average_grade;  // average mark
    byte level;             // grade





// Constructor


public Educated( String fullname, int age, double average_grade, byte level ) {
	setFullname(fullname);
	setAge(age);
	setAverage_grade(average_grade);
	setLevel(level);
	
}

// Setters and Getters

public String getFullname() {
	return fullname;

}

public void setFullname(String fullname) {
	this.fullname = fullname;

}


public int getAge() {
	return age;

}

public void setAge(int age) {
	this.age = age;

}


public double getAverage_grade() {
	return average_grade;

}
// mark status
public void setAverage_grade( double average_grade ) {
	if ( average_grade >= 1.0 && average_grade <= 10.0 )
		this.average_grade =  average_grade;
	else System.err.println( "Wrong average grade" );

}

public int getLevel() {
	return level;

}

public void setLevel( byte level ) {
	this.level = level;

}



// Information

public void printInfo() {
			System.out.println();
			System.out.println( "Fullname: " + fullname+ " ( "+ age + " years "+") ");
			System.out.println( "Class: " + level );
			System.out.println( "Grade: " + average_grade );

  }

}
