public class Test{
	public void main(String[] args){
		University NaUKMA =new University();
		int p=1;
		while(p==1){
System.out.println("What do you want?");
//A lot of switches with variants

		}
			NaUKMA.addFaculty("FI");
		NaUKMA.addFaculty("FEN");
		NaUKMA.deleteFaculty("FEN");
		NaUKMA.addFaculty("FEN");
		NaUKMA.editFaculty("FEN","LOL");
		NaUKMA.faculties[0].addCathedra("Math");
		NaUKMA.faculties[0].addCathedra("Web");
		NaUKMA.faculties[0].deleteCathedra("Web");
		NaUKMA.faculties[0].addCathedra("Web");
		NaUKMA.faculties[0].editCathedra("Web","Paint");
		NaUKMA.faculties[0].cathedras[0].addStudent("Ivanenko Ivan Ivanovich", "DF1", 1);
		NaUKMA.faculties[0].cathedras[0].addStudent("Ivanenko Ivan Ivanffovich", "DF1", 5);
		NaUKMA.faculties[0].cathedras[0].addStudent("Ivanenko Ivan Ivanovich", "DF1", 4);
		NaUKMA.faculties[0].cathedras[0].addTeacher("Russiev Andriy Petrovich");
		NaUKMA.faculties[0].cathedras[0].deleteTeacher("Russiev Andriy Petrovich");
		NaUKMA.faculties[0].cathedras[0].addTeacher("Aussiev Andriy Petrovich");
		NaUKMA.faculties[0].cathedras[0].addTeacher("Russiev Bsndriy Petrovich");
		NaUKMA.faculties[0].cathedras[0].editTeacher("Russiev Andriy Petrovich","Lolka");
		System.out.println(NaUKMA.faculties[0].cathedras[0].allStudentCourse());
		System.out.println(NaUKMA.faculties[0].cathedras[0].allTeacher());
}
}
