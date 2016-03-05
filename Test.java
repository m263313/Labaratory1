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
		
			
			}

		}
	}
}
