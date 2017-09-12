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
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		int i=0;
		students[0]=student;
		int len =students.length;
		Student[] s= new Student[len+1];
		s[0]=student;
		for(i=1;i<=len;i++){
		s[i]=students[i];	
		}
		students=s;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		this.students = new Student[this.students.length+1];
		students[this.students.length-1]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		this.students = new Student[this.students.length+1];
		for(int i=this.students.length;i>index;i--){
			students[i]=students[i-1];
		}
		students[index-1]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		students[index]=null;
		for(int i=index;i<this.students.length;i++){
			students[i]=students[i+1];
		}
		students[this.students.length-1]=null;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
			for(int i=0;i<this.students.length;i++){
			if(students[i].getFullName()==student.getFullName())
			{
				students[i]=null;
				for(int j=i;j<this.students.length;j++){
					students[j]=students[j+1];
				}
				students[this.students.length]=null;
				students[this.students.length+1]=null;
				return;
			}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	students[index]=null;
		for(int i=index;i<this.students.length;i++){
			students[i]=students[i+1];
		}
		students[this.students.length-1]=null;
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
for(int i=0;i<this.students.length;i++){
			if(students[i].getFullName()==student.getFullName())
			{
				students[i]=null;
				for(int j=i;j<this.students.length;j++){
					students[j]=students[j+1];
				}
				students[this.students.length]=null;
				students[this.students.length+1]=null;
				return;
			}
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		

	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
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
		// Add your implementation here
		return null;
	}
}
