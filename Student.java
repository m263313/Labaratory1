public class Student  implements Comparable{
	protected String name,group;
	protected int course;
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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGroup() {
	return group;
}
public void setGroup(String group) {
	this.group = group;
}
public int getCourse() {
	return course;
}
public void setCourse(int course) {
	this.course = course;
}
 		
public int compareTo(Object obj) {
	 
	  
	    Student tmp = (Student)obj;
	    return this.name.compareTo(tmp.name);
}

}
