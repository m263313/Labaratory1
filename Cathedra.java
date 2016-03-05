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
		return;
	}
	 	
	teachers=temp;
}
public void editTeacher(String name,String newName){
	for(int i =0;i<teachers.length;i++){
		if(teachers[i].getName().equals(name)){
			teachers[i].setName(newName);
			
		}
	}
}
//+Max
//Додати/видалити/редагувати студента/викладача до кафедри.
public void addStudent (String name,String group,int course){
	Student[] temp = new Student[students.length+1];
	for(int i=0;i<students.length;i++){
		temp[i]=students[i];
	}
	temp[temp.length-1]= new Student(name,group,course);
	students=temp;
}
//Додати/видалити/редагувати студента/викладача до кафедри.
public void deleteStudent(String name,String group,int course){
	
}
//Додати/видалити/редагувати студента/викладача до кафедри.
public void editStudent(){

}
//Вивести всіх студентів кафедри вказаного курсу.
//+Max
public String studentCourse(int course){
	String res="";
	for(int i=0;i<students.length;i++){
		if(students[i].getCourse()==course)
			res+=students[i]+"\n";
	}
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
	return res;
}
//Вивести всіх студентів/викладачів кафедри впорядкованих за алфавітом.
//-
public String allStudentName(){
	String res="";
	String[] temp=new String[students.length];
	for(int i=0;i<students.length;i++){
		temp[i]=students[i].getName();
	}
	Arrays.sort(temp);
	for(int i=0;i<students.length;i++){
	for(int j=0;i<students.length;i++){
		if(students[i].getName().equals(temp[j])){
			
		}
		res+=students[i]+"\n";
	}
	}
	return res;
}
//Вивести всіх студентів кафедри вказаного курсу впорядкованих за алфавітом.
//-
public String allStudentCourseName(int course){
	String res="";
	
	
	return res;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
