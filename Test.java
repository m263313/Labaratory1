public class Test{
	public static void main(String[] args){
		University NaUKMA =new University();
		int p=1;
		while(p==1){
			System.out.println("What do you want?");
			System.out.println("If you want Create / Delete / Edit Department press 1");
			System.out.println("If you want Create / delete / edit department faculty press 2");
			System.out.println("If you want Add / remove / edit student / teacher to department press 3");
			System.out.println("If you want Find student / teacher by name, course or group press 4");
			System.out.println("If you want Output ordered all students on courses press 5");
			System.out.println("If you want Output of students / teachers Faculty alphabetically ordered press 6");
			System.out.println("If you want Output of all students of the courses ordered press 7");
			System.out.println("If you want Output of students / teachers of the department ordered alphabetically press 8");
			System.out.println("If you want Output of all students of this course press 9");
			System.out.println("If you want Output of all students of this course ordered alphabetically press 10");
			int i=DataInput.getInt();
			switch(i){
			case 1:
				System.out.println("If you want Create Department press 1");
				System.out.println("If you want Delete Department press 2");
				System.out.println("If you want Edit Department press 3");
				int b=DataInput.getInt();
				switch(b){
				case 1:
					System.out.println("Enter the name of the faculty: ");
					String name=DataInput.getLine();
					NaUKMA.addFaculty(name);
				case 2:
					System.out.println("Enter the name of the faculty: ");
					String dName=DataInput.getLine();
					NaUKMA.deleteFaculty(dName);
				case 3:	
					System.out.println("Enter the name of the faculty: ");
					String eName=DataInput.getLine();
					System.out.println("Enter the name of the faculty: ");
					String newEName=DataInput.getLine();
					NaUKMA.editFaculty(eName, newEName);
				}
			case 2:
				System.out.println("If you want Create department faculty press 1");
				System.out.println("If you want delete department faculty press 2");
				System.out.println("If you want edit department faculty press 3");
				int c=DataInput.getInt();
				switch(c){
				case 1:
					System.out.println("Enter the name of the faculty of the department: ");
					String fac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String cathedra=DataInput.getLine();
					for(int r=0;i<NaUKMA.faculties.length;i++)
						if(fac.equals(NaUKMA.faculties[r]))
							NaUKMA.faculties[r].addCathedra(cathedra);
						
					
				case 2:
					System.out.println("Enter the name of the faculty of the department: ");
					String dFac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String dCathedra=DataInput.getLine();
					for(int r=0;i<NaUKMA.faculties.length;i++)
						if(dFac.equals(NaUKMA.faculties[r]))
							NaUKMA.faculties[r].deleteCathedra(dCathedra);
						
					
				case 3:
					System.out.println("Enter the name of the faculty of the department: ");
					String eFac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String eCathedra=DataInput.getLine();
					System.out.println("Enter a new name of the department: ");
					String newECathedra=DataInput.getLine();
					for(int r=0;i<NaUKMA.faculties.length;i++)
						if(eFac.equals(NaUKMA.faculties[r]))
							NaUKMA.faculties[r].editCathedra(eCathedra,newECathedra);
						
					
				}
			case 3:
				System.out.println("If you want Add student to department press 1");
				System.out.println("If you want remove student from department press 2");
				System.out.println("If you want edit student at the department press 3");
				System.out.println("If you want Add  teacher to department press 4");
				System.out.println("If you want remove teacher from department press 5");
				System.out.println("If you want edit teacher at the department press 6");
				int q=DataInput.getInt();
				switch(q){
				case 1:
					System.out.println("Enter the name of the faculty of the department: ");
					String aFac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String aCathedra=DataInput.getLine();
					System.out.println("Enter the name of the student: ");
					String name=DataInput.getLine();
					System.out.println("Enter the group of the student: ");
					String group=DataInput.getLine();
					System.out.println("Enter the course of the student: ");
					int course=DataInput.getInt();
					for(int r=0;i<NaUKMA.faculties.length;i++)
						if(aFac.equals(NaUKMA.faculties[r]))
							for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
								if(aCathedra.equals(NaUKMA.faculties[r].cathedras[a]))
									NaUKMA.faculties[r].cathedras[a].addStudent(name, group, course);
								
							
							
						
					
				case 2:
					System.out.println("Enter the name of the faculty of the department: ");
					String dFac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String dCathedra=DataInput.getLine();
					System.out.println("Enter the name of the student: ");
					String dname=DataInput.getLine();
					System.out.println("Enter the group of the student: ");
					String dgroup=DataInput.getLine();
					System.out.println("Enter the course of the student: ");
					int dcourse=DataInput.getInt();
					for(int r=0;i<NaUKMA.faculties.length;i++)
						if(dFac.equals(NaUKMA.faculties[r]))
							for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
								if(dCathedra.equals(NaUKMA.faculties[r].cathedras[a]))
									NaUKMA.faculties[r].cathedras[a].deleteStudent(dname, dgroup, dcourse);
								
							
							
						
					
				case 3:
					System.out.println("Enter the name of the faculty of the department: ");
					String eFac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String eCathedra=DataInput.getLine();
					System.out.println("Enter the name of the student: ");
					String ename=DataInput.getLine();
					System.out.println("Enter the group of the student: ");
					String egroup=DataInput.getLine();
					System.out.println("Enter the course of the student: ");
					int ecourse=DataInput.getInt();
					for(int r=0;i<NaUKMA.faculties.length;i++)
						if(eFac.equals(NaUKMA.faculties[r]))
							for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
								if(eCathedra.equals(NaUKMA.faculties[r].cathedras[a])){
									System.out.println("If you want edit name press 1");
									System.out.println("If you want edit course press 2");
									System.out.println("If you want edit group press 3");
									int w=DataInput.getInt();
									switch(w){
									case 1:
										System.out.println("Enter a new name of the student: ");
										String newName=DataInput.getLine();
										NaUKMA.faculties[r].cathedras[a].editStudentName(ename, egroup, ecourse, newName);
									case 2:
										System.out.println("Enter a new course of the student: ");
										int newCourse=DataInput.getInt();
										NaUKMA.faculties[r].cathedras[a].editStudentCourse(ename, egroup, ecourse, newCourse);
									
									case 3:
										System.out.println("Enter a new group of the student: ");
										String newGroup=DataInput.getLine();
										NaUKMA.faculties[r].cathedras[a].editStudentGroup(ename, egroup,ecourse,newGroup);
									}	
								}
							
				case 4:
					System.out.println("Enter the name of the faculty of the department: ");
					String adFac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String adCathedra=DataInput.getLine();
					System.out.println("Enter the name of the teacher: ");
					String aname=DataInput.getLine();
					for(int r=0;i<NaUKMA.faculties.length;i++)
						if(adFac.equals(NaUKMA.faculties[r]))
							for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
								if(adCathedra.equals(NaUKMA.faculties[r].cathedras[a]))
									NaUKMA.faculties[r].cathedras[a].addTeacher(aname);
								
							
							
						
					
				case 5:
					System.out.println("Enter the name of the faculty of the department: ");
					String deFac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String deCathedra=DataInput.getLine();
					System.out.println("Enter the name of the teacher: ");
					String dename=DataInput.getLine();
					for(int r=0;i<NaUKMA.faculties.length;i++)
						if(deFac.equals(NaUKMA.faculties[r]))
							for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
								if(deCathedra.equals(NaUKMA.faculties[r].cathedras[a]))
									NaUKMA.faculties[r].cathedras[a].deleteTeacher(dename);
								
							
							
						
					
				case 6:
					System.out.println("Enter the name of the faculty of the department: ");
					String edFac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String edCathedra=DataInput.getLine();
					System.out.println("Enter the name of the teacher: ");
					String edname=DataInput.getLine();
					for(int r=0;i<NaUKMA.faculties.length;i++)
						if(edFac.equals(NaUKMA.faculties[r]))
							for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
								if(edCathedra.equals(NaUKMA.faculties[r].cathedras[a])){
										System.out.println("Enter a new name of the teacher: ");
										String newName=DataInput.getLine();
										NaUKMA.faculties[r].cathedras[a].editTeacher(edname,newName);
								
								}
				}
			}
		}
	}
}
