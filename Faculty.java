public class Faculty {
	private Cathedra[] cahedras = new Cathedra[0];
	private String name;
public Faculty(String name){
	this.name=name;
}
public Faculty(){
	this("Fac");
}
private void addCathedra (){
	Cathedra[] temp = new Cathedra[cahedras.length+1];
	for(int i=0;i<cahedras.length+1;i++){
		temp[i]=cahedras[i];
	}
	temp[temp.length]= new Cathedra(name );
	cahedras=temp;
}
private void deleteCathedra(){
	Cathedra[] temp;
	boolean r=false;
	for(int i=0;i<cahedras.length;i++){
		if(cahedras[i].getName().equals(name)){
			cahedras[i]=null;
			r=true;
		}
		
	}
	if(r){
		  temp = new Cathedra[cahedras.length-1];
	for(int i=0;i<cahedras.length-1;i++){
		if(cahedras[i]!=null)
		temp[i]=cahedras[i];
	}
	}
	else{
		return;
	}
	 	
	cahedras=temp;
}
private void editCathedra(){

}
private void allStudentCourse(){
	
}
private void allStudentName(){
	
}
private void allTeacherName(){
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
