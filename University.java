public class University{
	protected Faculty[] faculties=new Faculty[0];
	
	
	//+Max
	public void addFaculty(String name){
		Faculty[] temp = new Faculty[faculties.length+1];
		for(int i=0;i<faculties.length;i++){
			temp[i]=faculties[i];
		}
		temp[temp.length-1]= new Faculty(name );
		faculties=temp;
	}
	//+Max
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
	//+Max
	public void editFaculty(String name,String newName){
	
	for(int i =0;i<faculties.length;i++){
		if(faculties[i].getName().equals(name)){
			faculties[i].setName(newName);
			
		}
	}
}
//Знайти студента/викладача за ПІБ, курсом або групою.
	public void findStudentCourse(int course){
	
}
//Знайти студента/викладача за ПІБ, курсом або групою.
	public void findStudentName(String name){
		
}
//Знайти студента/викладача за ПІБ, курсом або групою.
	public void findStudentGroup(String group){
		
}
//Знайти студента/викладача за ПІБ, курсом або групою.
	public void findTeacher(String name){
	
}
//Вивести всіх студентів впорядкованих за курсами
	//-
	public String allStudentCourse(){
	String res="";
	int k=0,l=0;
		for(int i=0;i<faculties.length;i++){
			for(int j=0;j<faculties[i].cathedras.length;j++){
				for(int f=0;f<faculties[i].cathedras[j].students.length;f++){
					 k++;
				}
			}
		}
		Student[] temp =new Student[k];
		
		for(int i=0;i<faculties.length;i++){
			for(int j=0;j<faculties[i].cathedras.length;j++){
				for(int f=0;f<faculties[i].cathedras[j].students.length;f++){
					
				
				temp[l]=faculties[i].cathedras[j].students[f];
				l++;
				}
			}
		}
		for(int i=0;i<k-1;i++){
			for(int j =0;j<k-i-1;j++){
			if(temp[j].getCourse()>temp[j+1].getCourse()){
				Student z=temp[j];
				temp[j]=temp[j+1]; 
				temp[j+1]=z;
				
			}
				
				
			}
		
		}
		
for(int i=0;i<k;i++){
			
			res+=temp[i]+"\n";
		}
		return res;
	}
}
