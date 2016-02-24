public class Teacher{
public String name;
public Teacher(String name ){
	 
	this.name=name;
	 
}
public Teacher(){
 this("Teach");
}
public String toString(){
	return "Name "+name;
}
}
