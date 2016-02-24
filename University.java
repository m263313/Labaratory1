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
private void deleteFaculty(){
		
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
