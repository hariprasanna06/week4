package assignment.may.week4.day2;

public class Students {
	public void getStudentInfo(String name) {
		System.out.println("Student Name: " +name);
	}
	public void getStudentInfo(int studentId) {
		System.out.println("Student ID: " +studentId);
	}
	public void getStudentInfo(int studentId, String name) {
		System.out.println("Student Id: "+studentId + " " + "Student Name: "+name);
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student Mail id: "+email + " " + "Student mobile number: "+phoneNumber);
	}
	public void getStudentInfo(long phoneNumber,String email) {
		System.out.println("Student mobile number: "+phoneNumber + " " + "Student Mail id: "+email);
	}
	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo("Hari Prasanna");
		std.getStudentInfo("027");
		std.getStudentInfo(027, "Hari Prasanna");
		std.getStudentInfo("hariprasa49@gmail.com", 7358277851l);
		std.getStudentInfo(7358277851l, "hariprasa49@gmail.com");
		
		
	}
}
