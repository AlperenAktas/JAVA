package odev2;

public class InstructorManager {
	public void makeHost(User user) {
		System.out.println("Instructor yap�ld� : " + user.getFirstName() + " " + user.getLastName());
		
	}
	public void blockStudent(Student student) {
		System.out.println("��renci engellendi : " + student.getFirstName() + " " + student.getLastName());
		student.setPoint(0);
	}
	
	public void studentsList(Student[] students) {
		int counter = 1;
		System.out.println("  ��RENC� L�STES� :");
		for(Student student : students) {
			System.out.println("----------- "+counter+" -----------");
			System.out.println("Ad Soyad : "+student.getFirstName()+" "+ student.getLastName());
			System.out.println("Id : "+ student.getId());
			System.out.println("Puan : " +student.getPoint());
			counter++;
		}
		
	}
	
}
