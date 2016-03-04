public class Teacher{
protected String name;
public Teacher(String name ){
	 
	this.name=name;
	 
}

public Teacher(){
 this("Teach");
}
public String toString(){
	return "Name "+name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
