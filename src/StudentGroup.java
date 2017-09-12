import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
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
	public StudentGroup(int length) 
	{
		this.students = new Student[length];
	}

	//@Override
	public Student[] getStudents() 
	{
		return students;
	}

	//@Override
	public void setStudents(Student[] students) 
	{
		this.students=students;
	}

	//@Override
	public Student getStudent(int index) 
	{
		
		return students[index];
	}

	//@Override
	public void setStudent(Student student, int index) 
	{
		students[index]=student;
	}

	//@Override
	public void addFirst(Student student) 
	{
		this.students = new Student[this.students.length+1];
		for( int i=this.students.length;i>0;i--)
		{
			students[i]=students[i-1];
		}
		students[0]=student;		
		
	}

	//@Override
	public void addLast(Student student) 
	{
		this.students = new Student[this.students.length+1];
		
		students[this.students.length-1]=student;
	}

	//@Override
	public void add(Student student, int index) 
	{
		this.students = new Student[this.students.length+1];
		for( int i=this.students.length;i>index;i--)
		{
			students[i]=students[i-1];
		}
		students[index-1]=student;		
		
	}

	//@Override
	public void remove(int index) 
	{
		students[index]=null;
		for( int i=index;i<this.students.length;i++)
		{
			students[i]=students[i+1];
		}
		students[this.students.length-1]=null;
		
		
	}

	//@Override
	public void remove(Student student)
	{
		for( int i=0;i<this.students.length;i++)
		{
			if(students[i].getFullName()==student.getFullName())
			{
				students[i]=null;
				
				for( int j=i;j<this.students.length;j++)
				{
					students[j]=students[j+1];
					
				}
				students[this.students.length]=null;
				students[this.students.length+1]=null;
				return;
				
			}
		}
	}

	//@Override
	public void removeFromIndex(int index) 
	{
		students[index]=null;
		for( int i=index;i<this.students.length;i++)
		{
			students[i]=students[i+1];
		}
		students[this.students.length-1]=null;
		
	}

	//@Override
	public void removeFromElement(Student student) 
	{
		for( int i=0;i<this.students.length;i++)
		{
			if(students[i].getFullName()==student.getFullName())
			{
				students[i]=null;
				
				for( int j=i;j<this.students.length;j++)
				{
					students[j]=students[j+1];
					
				}
				students[this.students.length]=null;
				students[this.students.length+1]=null;
				return;
				
			}
		}
	}

	//@Override
	public void removeToIndex(int index) 
	{
		students[index]=null;
		for( int i=index;i<this.students.length;i++)
		{
			students[i]=students[i+1];
		}
		students[this.students.length-1]=null;
	}

	//@Override
	public void removeToElement(Student student)
	
	{
		for( int i=0;i<this.students.length;i++)
		{
			if(students[i].getFullName()==student.getFullName())
			{
				students[i]=null;
				
				for( int j=i;j<this.students.length;j++)
				{
					students[j]=students[j+1];
					
				}
				students[this.students.length]=null;
				students[this.students.length+1]=null;
				return;
				
			}
		}
	}

	//@Override
	public void bubbleSort() 
	{
		// Add your implementation here
	}

	//@Override
	public Student[] getByBirthDate(Date date) 
	{
		int i=0,j=0;
		
		Student[] stud=null;
		
		for( ;i<students.length;i++)
		{
			if(students[i].getBirthDate().equals(date))
			{
				stud[j++]= students[i];
			}
			
			
		}	
		
		return stud;
	}

	//@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) 
	{
		int i=0,j=0;
		
		Student[] stud=null;
		
		
		
		Date date1=null;
		
		
		for( ;i<students.length;i++)
		{
			Date s1=students[i].getBirthDate();
			
			if(s1.getYear()>firstDate.getYear() && s1.getYear()<lastDate.getYear())
			{
				stud[j++]= students[i];
			}
			
			
		}	
		
		return stud;
	}

	//@Override
	public Student[] getNearBirthDate(Date date, int days) 
	
	{
		
		
		
		return null;
	}

	//@Override
	public int getCurrentAgeByDate(int indexOfStudent) 
	{
		Student stu = students[indexOfStudent];
		LocalDate today = LocalDate.now();
		Date sdate = stu.getBirthDate();
		
		LocalDate birthday = LocalDate.of(sdate.getYear(), sdate.getMonth(), sdate.getDay());
		Period p = Period.between(birthday, today);
		return p.getYears();
	}

	//@Override
	public Student[] getStudentsByAge(int age) 
	
	{
		// Add your implementation here
		return null;
	}

	//@Override
	public Student[] getStudentsWithMaxAvgMark()
	{
		
		
		
		
		
		

		
		return null;
	}

	//@Override
	public Student getNextStudent(Student student)
	{
		
		int i=0;
		
		for(;i<students.length;i++)
		{
			if(students[i].getFullName().equals(student.getFullName()) && students[i].getAvgMark()==student.getAvgMark() && students[i].getBirthDate()==student.getBirthDate() && students[i].getId()==student.getId())
			{
				return students[i+1];
			}
		}	
		
		return null;
	}
}
