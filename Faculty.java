public class Faculty {
	private Cathedra[] cahedras = new Cathedra[0];
public String name;
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
	
}
private void editCathedra(){

}
private void allStudentCourse(){
	
}
private void allStudentName(){
	
}
private void allTeacherName(){
	
}
}
