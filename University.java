public class University{
	private Faculty[] faculties=new Faculty[0];
	
	
	
	private void addFaculty(String name){
		Faculty[] temp = new Faculty[faculties.length+1];
		for(int i=0;i<faculties.length+1;i++){
			temp[i]=faculties[i];
		}
		temp[temp.length]= new Faculty(name );
		faculties=temp;
	}
private void deleteFaculty(String name){
	Faculty[] temp;
	boolean r=false;
	for(int i=0;i<faculties.length;i++){
		if(faculties[i].getName().equals(name)){
			faculties[i]=null;
			r=true;
		}
		
	}
	if(r){
		  temp = new Faculty[faculties.length-1];
	for(int i=0;i<faculties.length-1;i++){
		if(faculties[i]!=null)
		temp[i]=faculties[i];
	}
	}
	else{
		return;
	}
	 	
	faculties=temp;
	
	}
private void editFaculty(){
	
}
private void findStudentCourse(){
	
}
private void findStudentName(){
	
}
private void findStudentGroup(){
	
}

private void findTeacher(){
	
}
private void allStudentCourse(){
		
	}
}
