import java.util.Arrays;

public class Faculty {
	protected Cathedra[] cathedras = new Cathedra[0];
	protected String name;
public Faculty(String name){
	this.name=name;
}
public Faculty(){	
	this("Fac");
}
//+Max
public void addCathedra (String name){
	Cathedra[] temp = new Cathedra[cathedras.length+1];
	for(int i=0;i<cathedras.length;i++){
		temp[i]=cathedras[i];
	}
	temp[temp.length-1]= new Cathedra(name );
	cathedras=temp;
}
//+Max
public void deleteCathedra(String name){
	Cathedra[] temp;
	boolean r=false;
	for(int i=0;i<cathedras.length;i++){
		if(cathedras[i].getName().equals(name)){
			cathedras[i]=null;
			r=true;
		}
		
	}
	if(r){
		  temp = new Cathedra[cathedras.length-1];
	for(int i=0;i<cathedras.length-1;i++){
		if(cathedras[i]!=null)
		temp[i]=cathedras[i];
	}
	}
	else{
		return;
	}
	 	
	cathedras=temp;
}
//+Max
public void editCathedra(String name,String newName){
	for(int i =0;i<cathedras.length;i++){
		if(cathedras[i].getName().equals(name)){
			cathedras[i].setName(newName);
			
		}
	}
}


//Вивести всіх студентів/викладачів факультета впорядкованих за алфавітом.
//+Max
public String allStudentName(){
	int k=0,l=0;
	String res="";
	for(int i=0;i<cathedras.length;i++){
		for(int j=0;j<cathedras[i].students.length;j++){
			k++; 	
		}
		
	}
	Student[] temp=new Student[k];
	for(int i=0;i<cathedras.length;i++){
		for(int j=0;j<cathedras[i].students.length;j++){
		temp[l]=cathedras[i].students[j];
		l++;
		}
	}
	Arrays.sort(temp);
		for(int i=0;i<k;i++){
			res+=temp[i]+"\n";
		}
		return res;
		}


//Вивести всіх студентів/викладачів факультета впорядкованих за алфавітом.
//+Max
public String allTeacherName(){
	int k=0,l=0;
	String res="";
	for(int i=0;i<cathedras.length;i++){
		for(int j=0;j<cathedras[i].teachers.length;j++){
			k++; 	
		}
		
	}
	String[] temp=new String[k];
	for(int i=0;i<cathedras.length;i++){
		for(int j=0;j<cathedras[i].teachers.length;j++){
		temp[l]=cathedras[i].teachers[j].getName();
		l++;
		}
	}
	Arrays.sort(temp);
		for(int i=0;i<k;i++){
			res+=temp[i]+"\n";
		}
		return res;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
