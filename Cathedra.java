	import java.util.Arrays;
	
	public class Cathedra{
		protected Student[] students = new Student[0];
		protected Teacher[] teachers = new Teacher[0];
		protected String name;
	public Cathedra(String name){
		this.setName(name);
	}
	public Cathedra(){
		this("Cath");
	}
	//+Max
	public void addTeacher (String name){
		Teacher[] temp = new Teacher[teachers.length+1];
		for(int i=0;i<teachers.length;i++){
			temp[i]=teachers[i];
		}
		System.out.println("Successful addition of teacher");
		temp[temp.length-1]= new Teacher(name );
		teachers=temp;
	}
	//+Max
	public void deleteTeacher(String name){
		Teacher[] temp;
		boolean r=false;
		for(int i=0;i<teachers.length;i++){
			if(teachers[i].getName().equals(name)){
				teachers[i]=null;
				r=true;
			}
			
		}
		if(r){
			  temp = new Teacher[teachers.length-1];
		for(int i=0;i<teachers.length-1;i++){
			if(teachers[i]!=null)
			temp[i]=teachers[i];
		}
		}
		else{
			System.out.println("There is no such teacher");
			return;
		}
		 	
		teachers=temp;
	}
	//+Max
	public void editTeacher(String name,String newName){
		//boolean r=false;
		for(int i =0;i<teachers.length;i++){
			if(teachers[i].getName().equals(name)){
				teachers[i].setName(newName);
				 return;
			}
		}
	 
			System.out.println("There is no such teacher");
		
	}
	//+Max
	//Додати/видалити/редагувати студента/викладача до кафедри.
	public void addStudent (String name,String group,int course){
		Student[] temp = new Student[students.length+1];
		for(int i=0;i<students.length;i++){
			temp[i]=students[i];
		}
		System.out.println("Successful addition of student");
		temp[temp.length-1]= new Student(name,group,course);
		students=temp;
	}
	//Додати/видалити/редагувати студента/викладача до кафедри.
	//+Max
	public void deleteStudent(String name,String group,int course){
		boolean r=false;
		Student[] temp;
		for(int i=0;i<students.length;i++){
			if(students[i].getCourse()==course && students[i].getGroup().equals(group) && students[i].getName().equals(name)){
				students[i]=null;
				r=true;
			}
		}
		if(r){
			  temp = new Student[students.length-1];
		for(int i=0;i<students.length-1;i++){
			if(students[i]!=null)
			temp[i]=students[i];
		}
		}
		else{
			System.out.println("There is no such student");
			return;
		}
		 	
		students=temp;
	}
	//Додати/видалити/редагувати студента/викладача до кафедри.
	//+Max
	public void editStudentName(String name,String group,int course,String newName){
	//	boolean r=false;
	for(int i=0;i<students.length;i++){
		if(students[i].getCourse()==course && students[i].getGroup().equals(group) && students[i].getName().equals(name)){
			students[i].setName(newName);
			return;
		}
	}
	System.out.println("There is no such student");
	}
	//+Max
	public void editStudentCourse(String name,String group,int course,int newCourse ){
	//	boolean r=false;
		for(int i=0;i<students.length;i++){
			if(students[i].getCourse()==course && students[i].getGroup().equals(group) && students[i].getName().equals(name)){
				students[i].setCourse(newCourse);
				return;
			}
		}
		System.out.println("There is no such student");
	}
	//+Max
 
	public void editStudentGroup(String name,String group,int course,String newGroup){
	//	boolean r=false;
		for(int i=0;i<students.length;i++){
			if(students[i].getCourse()==course && students[i].getGroup().equals(group) && students[i].getName().equals(name)){
				students[i].setGroup(newGroup);
				return;
			}
		}
		System.out.println("There is no such student");
	}
	//Вивести всіх студентів кафедри вказаного курсу.
	//+Max
	public String studentCourse(int course){
		String res="";
		for(int i=0;i<students.length;i++){
			if(students[i].getCourse()==course)
				res+=students[i]+"\n";
		}
		if(res.equals(""))
			res+="There are not such students";
		return res;
	}
	//Вивести всіх студентів кафедри впорядкованих за курсами
	//+Max
	
	public String allStudentCourse( ){
		
		String res="";
		Student[] temp=new Student[students.length];
		for(int i=0;i<students.length;i++){
			temp[i]=students[i];
		}
		for(int i=0;i<temp.length-1;i++){
			for(int j =0;j<temp.length-i-1;j++){
			if(temp[j].getCourse()>temp[j+1].getCourse()){
				Student z=temp[j];
				temp[j]=temp[j+1]; 
				temp[j+1]=z;
				
			}
				
				
			}
		
		}
		for(int i=0;i<students.length;i++){
			
			res+=temp[i]+"\n";
		}
		if(res.equals(""))
			res+="There are not such students";
		return res;
	}
	//Вивести всіх студентів/викладачів кафедри впорядкованих за алфавітом.
	//+Max
	public String allTeacher(){
		String res="";
		String[] temp=new String[teachers.length];
		for(int i=0;i<teachers.length;i++){
			temp[i]=teachers[i].getName();
		
		}
		Arrays.sort(temp);
		for(int i=0;i<temp.length;i++){
			res+=temp[i]+"\n";
		}
		if(res.equals(""))
			res+="There are not such teachers";
		return res;
	}
	//Вивести всіх студентів/викладачів кафедри впорядкованих за алфавітом.
	//+Max
	public String allStudentName(){
		String res="";
/*		String[] temp=new String[students.length];
		for(int i=0;i<students.length;i++){
			temp[i]=students[i].getName();
		}
		*/
		Arrays.sort(students);
		for(int i=0;i<students.length;i++){
		 
			res+=students[i]+"\n";
		 
		}
		if(res.equals(""))
			res+="There are not such students";
		return res;
	}
	//Вивести всіх студентів кафедри вказаного курсу впорядкованих за алфавітом.
	//+Max
	public String allStudentCourseName(int course){
		String res="";
			int k=0,l=0;
		for(int i=0;i<students.length;i++){
			if(course==students[i].getCourse()){
				k++;
			}
		}
		Student[] temp= new Student[k];
		for(int i=0;i<students.length;i++){
			if(course==students[i].getCourse()){
				temp[l]=students[i];
				l++;
			}
		}
		Arrays.sort(temp);
		for(int i=0;i<k;i++){
			res+=temp[i]+"\n";
		}
		if(res.equals(""))
			res+="There are not such students";
		return res;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	}
