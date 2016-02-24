public class Cathedra{
private Student[] students = new Student[0];
private Teacher[] teachers = new Teacher[0];
private String name;
public Cathedra(String name){
	this.name=name;
}
public Cathedra(){
	this("Cath");
}
private void addTeacher (String name){
	Teacher[] temp = new Teacher[students.length+1];
	for(int i=0;i<teachers.length+1;i++){
		temp[i]=teachers[i];
	}
	temp[temp.length]= new Teacher(name );
	teachers=temp;
}
private void deleteTeacher(){
	
}
private void editTeacher(){

}
//Max
private void addStudent (String name,String group,int course){
	Student[] temp = new Student[students.length+1];
	for(int i=0;i<students.length+1;i++){
		temp[i]=students[i];
	}
	temp[temp.length]= new Student(name,group,course);
	students=temp;
}
private void deleteStudent(){
	
}
private void editStudent(){

}
private String allStudentCourse( ){
	String res="";
	Student[] temp=new Student[students.length];
	for(int i=0;i<students.length;i++){
		temp[i]=students[i];
	}
	for(int i=0;i<temp.length;i++){
		//Tut bude sortuvannya
	}
	for(int i=0;i<students.length;i++){
		
		res+=students[i]+"/n";
	}
	return res;
}
private String allTeacher(){
	String res="";
	for(int i=0;i<teachers.length;i++){
		res+=teachers[i]+"/n";
	}
	return res;
}
private String allStudentName(){
	String res="";
	Student[] temp=new Student[students.length];
	for(int i=0;i<students.length;i++){
		temp[i]=students[i];
	}
	//Tut bude sortuvannya
	for(int i=0;i<students.length;i++){
		res+=students[i]+"/n";
	}
	return res;
}
private void allStudentCourseName(){
	
}
}
