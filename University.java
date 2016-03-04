public class University{
	private Faculty[] faculties=new Faculty[0];
	
	
	
	public void addFaculty(String name){
		Faculty[] temp = new Faculty[faculties.length+1];
		for(int i=0;i<faculties.length+1;i++){
			temp[i]=faculties[i];
		}
		temp[temp.length]= new Faculty(name );
		faculties=temp;
	}
	public void deleteFaculty(String name){
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
	public void editFaculty(String name,String newName){
	
	for(int i =0;i<faculties.length;i++){
		if(faculties[i].getName().equals(name)){
			faculties[i].setName(newName);
			
		}
	}
}
//Знайти студента/викладача за ПІБ, курсом або групою.
	public void findStudentCourse(){
	
}
//Знайти студента/викладача за ПІБ, курсом або групою.
	public void findStudentName(){
	
}
//Знайти студента/викладача за ПІБ, курсом або групою.
	public void findStudentGroup(){
	
}
//Знайти студента/викладача за ПІБ, курсом або групою.
	public void findTeacher(){
	
}
//Вивести всіх студентів впорядкованих за курсами
	public String allStudentCourse(){
	String res="";
		for(int i=0;i<faculties.length;i++){
			for(int j=0;j<faculties[i].cathedras.length;j++){
				for(int f=0;f<faculties[i].cathedras[j].students.length;f++){
					System.out.println(faculties[i].cathedras[j].students[f]);
				}
				
				
				
			}
		}
		return res;
	}
}
