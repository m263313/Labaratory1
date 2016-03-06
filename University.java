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
			System.out.println("There is no such faculty");
			return;
		}
		 	
		faculties=temp;
		
		}
		//+Max
		public void editFaculty(String name,String newName){
		boolean r=false;
		for(int i =0;i<faculties.length;i++){
			if(faculties[i].getName().equals(name)){
				faculties[i].setName(newName);
				r=true;
			}
		}
		if(!r)
			System.out.println("There is no such faculty");
	}
	//+Max
	//Знайти студента/викладача за ПІБ, курсом або групою.
		public String findStudentCourse(int course){
			String res="";
			for(int i=0;i<faculties.length;i++){
				for(int j=0;j<faculties[i].cathedras.length;j++){
					for(int f=0;f<faculties[i].cathedras[j].students.length;f++){
						if(course==faculties[i].cathedras[j].students[f].getCourse())
							res+=faculties[i].cathedras[j].students[f]+"\n";
					}
				}
	
					}
			if(res.equals(""))
				res+="There are not such students";
			return res;
	}
	//+Max
	//Знайти студента/викладача за ПІБ, курсом або групою.
		public String findStudentName(String name){
			String res="";
			for(int i=0;i<faculties.length;i++){
				for(int j=0;j<faculties[i].cathedras.length;j++){
					for(int f=0;f<faculties[i].cathedras[j].students.length;f++){
						if(name.equals(faculties[i].cathedras[j].students[f].getName()))
							res+=faculties[i].cathedras[j].students[f]+"\n";
					}
				}
	
					}
			if(res.equals(""))
				res+="There are not such students";
			return res;
	}
	//+Max
	//Знайти студента/викладача за ПІБ, курсом або групою.
		public String findStudentGroup(String group){
			String res="";
			for(int i=0;i<faculties.length;i++){
				for(int j=0;j<faculties[i].cathedras.length;j++){
					for(int f=0;f<faculties[i].cathedras[j].students.length;f++){
						if(group.equals(faculties[i].cathedras[j].students[f].getGroup()))
							res+=faculties[i].cathedras[j].students[f]+"\n";
					}
				}
	
					}
			if(res.equals(""))
				res+="There are not such students";
			return res;
	}
	//Знайти студента/викладача за ПІБ, курсом або групою.
	//+Max
		public String findTeacher(String name){
			String res="";
			for(int i=0;i<faculties.length;i++){
				for(int j=0;j<faculties[i].cathedras.length;j++){
					for(int f=0;f<faculties[i].cathedras[j].teachers.length;f++){
						if(name.equals(faculties[i].cathedras[j].teachers[f].getName()))
							res+=faculties[i].cathedras[j].teachers[f]+"\n";
					}
				}
				if(res.equals(""))
					res+="There are not such teachers";
					}
			return res;
	}
	//Вивести всіх студентів впорядкованих за курсами
	//+Max
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
	if(res.equals(""))
		res+="There are no students";
			return res;
		}
	}
