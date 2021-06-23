package Day1;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		Student[] a = {
				new Student(14069,"��**","����", 3), new Student(12051,"Ȳ**","�濵", 4),
				new Student(15002,"��**","������", 2), new Student(12481,"��**","����", 4),
				new Student(15505,"��**","����", 2), new Student(16962,"��**","����", 1),
				new Student(15376,"��**","��ǻ��", 2), new Student(16420,"��**","����", 2),
				new Student(11293,"��**","��ǻ��", 2), new Student(10184,"��**","�濵", 3),
				new Student(16104,"��**","��ǻ��", 1), new Student(10390,"��**","�濵", 4),
				new Student(14758,"��**","��ǻ��", 2)
		};
		Arrays.sort(a); // �й����� ����
		print(a, "ID");
		// �а��̸����� ���� Comparator WITH_DEPT
		Arrays.sort(a, Student.WITH_DEPT);
		print(a, "�а�");
		// �л��̸����� ���� Comparator WITH_NAME
		Arrays.sort(a, Student.WITH_NAME);
		print(a, "�̸�");
		// �г����� ���� Comparator WITH_GRADE
		Arrays.sort(a, Student.WITH_GRADE);
		print(a, "�г�");
	}
	
	public static void print(Student[] a, String key) {
		System.out.println();
		System.out.println("       " + key + "(��)�� ����");
		System.out.println("-------------------------");
		for(Student temp : a) {	
			System.out.print(temp.getID() + "  " + temp.getName() + "  " 
					+ temp.getDept() + " \t" + temp.getGrade() + "\n");
		}	
	}
}
