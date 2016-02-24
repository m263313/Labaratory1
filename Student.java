public class Student{
private String name,group;
private int course;
public Student(String name,String group,int course){
			this.course=course;
			this.name=name;
			this.group=group;
}
public Student(){
	this("St","Gr",1);
}
public String toString(){
	return "Name "+name+" course "+course+" group "+group;
}
}
