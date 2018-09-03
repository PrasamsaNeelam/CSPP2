/**
 * Class for student.
 */
class Student {
	String name;
	String rollNumber;
	float m1, m2, m3;
	/**
	 * Constructs the object.
	 *
	 * @param      name        The name
	 * @param      rollNumber  The roll number
	 * @param      m1          The m 1
	 * @param      m2          The m 2
	 * @param      m3          The m 3
	 */
	public Student(String name, String rollNumber, float m1, float m2, float m3) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	/**
	 * { function to return grade }.
	 *
	 * @return     { returns float type }
	 */
	float grade() {
		return (m1 + m2 + m3)/ 3;
	}
	/**
	 * { main function to get student details }.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Student obj1 = new Student("Sangay", "IT201985001", 7.5f, 7.0f, 8.0f);
		System.out.format("%.1f", obj1.grade());
		System.out.println();
		Student obj2 = new Student("Bidhya", "IT201985003", 8.5f, 6.0f, 7.5f);
		System.out.format("%.1f", obj2.grade());
		System.out.println();
		Student obj3 = new Student("Kelzang", "IT201985065", 7.5f, 8.0f, 9.0f);
		System.out.format("%.1f", obj3.grade());
	}
}