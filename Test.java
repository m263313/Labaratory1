public class Test{
	public static void main(String[] args){
		University NaUKMA =new University();
		int i=0;
		while(i!=11){
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
			System.out.println("To complete press 11");
			i=DataInput.getInt();
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
					boolean n=true;
					for(int k=0;k<name.length();k++)
						if(name.charAt(k)<='A'||name.charAt(k)>='z')
							n=false;
					if(n)
					NaUKMA.addFaculty(name);
					else
						System.out.println("Entered not allowed characters");
					break;
				case 2:
					System.out.println("Enter the name of the faculty: ");
					String dName=DataInput.getLine();
					NaUKMA.deleteFaculty(dName);
					break;
				case 3:	
					System.out.println("Enter the name of the faculty: ");
					String eName=DataInput.getLine();
					System.out.println("Enter the name of the faculty: ");
					String newEName=DataInput.getLine();
					boolean v=true;
					for(int k=0;k<newEName.length();k++)
						if(newEName.charAt(k)<='A'||newEName.charAt(k)>='z')
							v=false;
					if(v)
							NaUKMA.editFaculty(eName, newEName);
					else
						System.out.println("Entered not allowed characters");
					
					break;
				default:
					System.out.println("you entered is not defined number");
					break;
				}break;
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
					boolean n=true;
					for(int k=0;k<cathedra.length();k++)
						if(cathedra.charAt(k)<='A'||cathedra.charAt(k)>='z')
							n=false;
					if(n){
					for(int r=0;r<NaUKMA.faculties.length;r++)
						if(fac.equals(NaUKMA.faculties[r]))
							NaUKMA.faculties[r].addCathedra(cathedra);
						else
							System.out.println("This name exists");
					}else
						System.out.println("Entered not allowed characters");
					break;
					
				case 2:
					System.out.println("Enter the name of the faculty of the department: ");
					String dFac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String dCathedra=DataInput.getLine();
					for(int r=0;r<NaUKMA.faculties.length;r++)
						if(dFac.equals(NaUKMA.faculties[r]))
							NaUKMA.faculties[r].deleteCathedra(dCathedra);
						else
							System.out.println("This name exists");
					break;
					
				case 3:
					System.out.println("Enter the name of the faculty of the department: ");
					String eFac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String eCathedra=DataInput.getLine();
					System.out.println("Enter a new name of the department: ");
					String newECathedra=DataInput.getLine();
					boolean v=true;
					for(int k=0;k<newECathedra.length();k++)
						if(newECathedra.charAt(k)<='A'||newECathedra.charAt(k)>='z')
							v=false;
					if(v){
							for(int r=0;r<NaUKMA.faculties.length;r++)
								if(eFac.equals(NaUKMA.faculties[r]))
									NaUKMA.faculties[r].editCathedra(eCathedra,newECathedra);
					}else
							System.out.println("Entered not allowed characters");
					break;
					
				}break;
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
					boolean m=true;
					for(int k=0;k<name.length();k++)
						if(name.charAt(k)<='A'||name.charAt(k)>='z'||name.charAt(k)!=' ')
							m=false;
					if(m){
						System.out.println("Enter the group of the student: ");
						String group=DataInput.getLine();
						boolean n=true;
						for(int k=0;k<group.length();k++)
							if(group.charAt(k)<='A'||group.charAt(k)>='z')
								n=false;
						if(n){
							System.out.println("Enter the course of the student: ");
							int course=DataInput.getInt();
							if(course>=0||course<=7)
								for(int r=0;r<NaUKMA.faculties.length;r++)
									if(aFac.equals(NaUKMA.faculties[r]))
										for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
											if(aCathedra.equals(NaUKMA.faculties[r].cathedras[a]))
												NaUKMA.faculties[r].cathedras[a].addStudent(name, group, course);
							}else
								System.out.println("Entered not allowed characters");
					}else
						System.out.println("Entered not allowed characters");
							
							
					break;
					
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
					for(int r=0;r<NaUKMA.faculties.length;r++)
						if(dFac.equals(NaUKMA.faculties[r]))
							for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
								if(dCathedra.equals(NaUKMA.faculties[r].cathedras[a]))
									NaUKMA.faculties[r].cathedras[a].deleteStudent(dname, dgroup, dcourse);
								
							
					break;
						
					
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
					for(int r=0;r<NaUKMA.faculties.length;r++)
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
										boolean x=true;
										for(int k=0;k<newName.length();k++)
											if(newName.charAt(k)<='A'||newName.charAt(k)>='z')
												if(newName.charAt(k)!=' ')
												x=false;
										if(x)
											NaUKMA.faculties[r].cathedras[a].editStudentName(ename, egroup, ecourse, newName);
										else
											System.out.println("Entered not allowed characters");
										break;
									case 2:
										System.out.println("Enter a new course of the student: ");
										int newCourse=DataInput.getInt();
										if(newCourse>=0||newCourse<=7)
											NaUKMA.faculties[r].cathedras[a].editStudentCourse(ename, egroup, ecourse, newCourse);
										else 
											System.out.println("Entered not allowed characters");
										break;
									case 3:
										System.out.println("Enter a new group of the student: ");
										String newGroup=DataInput.getLine();
										boolean g=true;
										for(int k=0;k<newGroup.length();k++)
											if(newGroup.charAt(k)<='A'||newGroup.charAt(k)>='z')
												g=false;
										if(g)
											NaUKMA.faculties[r].cathedras[a].editStudentGroup(ename, egroup,ecourse,newGroup);
										else
											System.out.println("Entered not allowed characters");
										break;
									}	break;
								}
					break;
				case 4:
					System.out.println("Enter the name of the faculty of the department: ");
					String adFac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String adCathedra=DataInput.getLine();
					System.out.println("Enter the name of the teacher: ");
					String aname=DataInput.getLine();
					boolean p=true;
					for(int k=0;k<aname.length();k++)
						if(aname.charAt(k)<='A'||aname.charAt(k)>='z')
							if(aname.charAt(k)!=' ')
							p=false;
					if(p){
					for(int r=0;r<NaUKMA.faculties.length;r++)
						if(adFac.equals(NaUKMA.faculties[r]))
							for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
								if(adCathedra.equals(NaUKMA.faculties[r].cathedras[a]))
									NaUKMA.faculties[r].cathedras[a].addTeacher(aname);
					}else
						System.out.println("Entered not allowed characters");
					break;
							
						
					
				case 5:
					System.out.println("Enter the name of the faculty of the department: ");
					String deFac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String deCathedra=DataInput.getLine();
					System.out.println("Enter the name of the teacher: ");
					String dename=DataInput.getLine();
					for(int r=0;r<NaUKMA.faculties.length;r++)
						if(deFac.equals(NaUKMA.faculties[r]))
							for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
								if(deCathedra.equals(NaUKMA.faculties[r].cathedras[a]))
									NaUKMA.faculties[r].cathedras[a].deleteTeacher(dename);
								
							
							
					break;
					
				case 6:
					System.out.println("Enter the name of the faculty of the department: ");
					String edFac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String edCathedra=DataInput.getLine();
					System.out.println("Enter the name of the teacher: ");
					String edname=DataInput.getLine();
					for(int r=0;r<NaUKMA.faculties.length;r++)
						if(edFac.equals(NaUKMA.faculties[r]))
							for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
								if(edCathedra.equals(NaUKMA.faculties[r].cathedras[a])){
										System.out.println("Enter a new name of the teacher: ");
										String newName=DataInput.getLine();
										boolean u=true;
										for(int k=0;k<newName.length();k++)
											if(newName.charAt(k)<='A'||newName.charAt(k)>='z')
												if(newName.charAt(k)!=' ')
												u=false;
										if(u)
										NaUKMA.faculties[r].cathedras[a].editTeacher(edname,newName);
										else
											System.out.println("Entered not allowed characters");
								}
					break;
					default:
						System.out.println("you entered is not defined number");
						break;
				}break;
			case 4:
				System.out.println("If you want Find student by name press 1");
				System.out.println("If you want Find student by course press 2");
				System.out.println("If you want Find student by group press 3");
				System.out.println("If you want Find teacher by name press 4");
				int e=DataInput.getInt();
				switch(e){
				case 1:
					System.out.println("Enter the name of the student: ");
					String nameS=DataInput.getLine();
					System.out.println(NaUKMA.findStudentName(nameS));
					break;
				case 2:
					System.out.println("Enter the course of the student: ");
					int courseS=DataInput.getInt();
					System.out.println(NaUKMA.findStudentCourse(courseS));
					break;			
				case 3:
					System.out.println("Enter the groupe of the student: ");
					String groupS=DataInput.getLine();
					System.out.println(NaUKMA.findStudentGroup(groupS));
					break;
				case 4:
					System.out.println("Enter the name of the teacher: ");
					String nameT=DataInput.getLine();
					System.out.println(NaUKMA.findTeacher(nameT));
					break;
					default:
						System.out.println("you entered is not defined number");
						break;
				}break;
			case 5:
				System.out.println(NaUKMA.allStudentCourse());
				break;
			case 6:
				System.out.println("If you want Output of students Faculty alphabetically ordered press 1");
				System.out.println("If you want Output of teachers Faculty alphabetically ordered press 2");
				int y=DataInput.getInt();
				switch(y){
				case 1:
					System.out.println("Enter the name of the faculty: ");
					String nameF=DataInput.getLine();
					for(int r=0;r<NaUKMA.faculties.length;r++)
						if(nameF.equals(NaUKMA.faculties[r]))
							System.out.println(NaUKMA.faculties[r].allStudentName());
					break;
				case 2:
					System.out.println("Enter the name of the faculty: ");
					String nameFa=DataInput.getLine();
					for(int r=0;r<NaUKMA.faculties.length;r++)
						if(nameFa.equals(NaUKMA.faculties[r]))
							System.out.println(NaUKMA.faculties[r].allTeacherName());
					break;
					default:
						System.out.println("you entered is not defined number");
						break;
				}break;
			case 7:
				System.out.println("Enter the name of the faculty of the department: ");
				String eFac=DataInput.getLine();
				System.out.println("Enter the name of the department: ");
				String eCathedra=DataInput.getLine();
				for(int r=0;r<NaUKMA.faculties.length;r++)
					if(eFac.equals(NaUKMA.faculties[r]))
						for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
							if(eCathedra.equals(NaUKMA.faculties[r].cathedras[a])){
								System.out.println(NaUKMA.faculties[r].cathedras[a].allStudentCourse());
							}break;
			case 8:
				System.out.println("If you want Output of students of the department ordered alphabetically press 1");
				System.out.println("If you want Output of teachers of the department ordered alphabetically press 2");
				int u=DataInput.getInt();
				switch(u){
				case 1:
					System.out.println("Enter the name of the faculty of the department: ");
					String Fac=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String Cathedra=DataInput.getLine();
					for(int r=0;r<NaUKMA.faculties.length;r++)
						if(Fac.equals(NaUKMA.faculties[r]))
							for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
								if(Cathedra.equals(NaUKMA.faculties[r].cathedras[a]))
									System.out.println(NaUKMA.faculties[r].cathedras[a].allStudentName());
					break;
				case 2:
					System.out.println("Enter the name of the faculty of the department: ");
					String FacT=DataInput.getLine();
					System.out.println("Enter the name of the department: ");
					String CathedraT=DataInput.getLine();
					for(int r=0;r<NaUKMA.faculties.length;r++)
						if(FacT.equals(NaUKMA.faculties[r]))
							for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
								if(CathedraT.equals(NaUKMA.faculties[r].cathedras[a]))
									System.out.println(NaUKMA.faculties[r].cathedras[a].allTeacher());
					break;
				default:
					System.out.println("you entered is not defined number");
					break;
				}break;
			case 9:
				System.out.println("Enter the name of the faculty of the department: ");
				String FacT=DataInput.getLine();
				System.out.println("Enter the name of the department: ");
				String CathedraT=DataInput.getLine();
				for(int r=0;r<NaUKMA.faculties.length;r++)
					if(FacT.equals(NaUKMA.faculties[r]))
						for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
							if(CathedraT.equals(NaUKMA.faculties[r].cathedras[a])){
								System.out.println("Enter the course: ");
								int course=DataInput.getInt();
								System.out.println(NaUKMA.faculties[r].cathedras[a].studentCourse(course));
							}break;
			case 10:
				System.out.println("Enter the name of the faculty of the department: ");
				String Fac=DataInput.getLine();
				System.out.println("Enter the name of the department: ");
				String Cathedra=DataInput.getLine();
				for(int r=0;r<NaUKMA.faculties.length;r++)
					if(Fac.equals(NaUKMA.faculties[r]))
						for(int a=0;a<NaUKMA.faculties[r].cathedras.length;a++)
							if(Cathedra.equals(NaUKMA.faculties[r].cathedras[a])){
								System.out.println("Enter the course: ");
								int course=DataInput.getInt();
								System.out.println(NaUKMA.faculties[r].cathedras[a].allStudentCourseName(course));
							}break;
			default:
				if(i!=11)
				System.out.println("you entered is not defined number");
				break;
			}
		}System.out.println("you finished");
	}
}
