import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
		else
		    return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		else
		 return students[index];
	}

	@Override
	public void setStudent(Student student, int index)
	{
		if(student==null)
			throw new IllegalArgumentException();
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		// Add your implementation here
		students[index]=students[index];
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		else
		 students[0]=student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		students[students.length-1]=student;
	}

	@Override
	public void add(Student student, int index) {
		if(student==null)
			throw new IllegalArgumentException();
		else if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		else {	
			Student[] a=new Student[students.length+1];
		for(int i=0;i<index;i++)
			a[i]=students[i];
		a[index]=student;
		for(int i=index+1;i<students.length;i++)
			a[i]=students[i];
		students=new Student[a.length];
		students=a;
		}
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		else {
			Student[] a=new Student[students.length-1];
			for(int i=index;i<students.length;i++)
				students[i]=students[i+1];
			for(int i=0;i<a.length;i++)
			{
				a[i]=students[i];
			}
			students=new Student[a.length];
			students=a;
		}
			
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		if(student==null)
			throw new IllegalArgumentException();
		
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		if(students==null||index<0||index>=students.length)
			throw new IllegalArgumentException();
		
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		if(student==null)
			throw new IllegalArgumentException();
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		if(student==null)
			throw new IllegalArgumentException();
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		if(date==null)
			throw new IllegalArgumentException();
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if(firstDate==null)
			throw new IllegalArgumentException();
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		if(date==null)
			throw new IllegalArgumentException();
		
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		if(student==null)
			throw new IllegalArgumentException();
		else {
			int i,count=0;
			int ind=0;
			for(i=0;i<students.length;i++) {
				if(students[i]==student)
				{
					count++;
					ind=i;
				}
				if(count==0)
					return student;
			}
		
		// Add your implementation here
			return students[ind+1];
		}	
	}
	}

