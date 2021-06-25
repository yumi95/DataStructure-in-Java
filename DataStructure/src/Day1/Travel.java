package Day1;

public class Travel {
	private Node start; // ���� ��
	public Travel() { start = null; } // ���� ������
	public class Node {
		private char name; // ���̸�
		private Node left, right; // �� ������ �ٸ� ����
		public Node(char newIsland, Node lt, Node rt) { // ��������
			name = newIsland;
			left = lt;
			right = rt;
		}
	}
	public Node map() { // ���� �����
		Node n1 = new Node('H', null, null);
		Node n2 = new Node('F', null, null);
		Node n3 = new Node('S', null, null);
		Node n4 = new Node('U', null, null);
		Node n5 = new Node('E', null, null);
		Node n6 = new Node('Z', null, null);
		Node n7 = new Node('K', null, null);
		Node n8 = new Node('N', null, null);
		Node n9 = new Node('A', null, null);
		Node n10 = new Node('Y', null, null);
		Node n11 = new Node('T', null, null);
		n1.left = n2; n1.right = n3; // n1�� ���� �� -> n2, n1�� ������ �� -> n3
		n2.left = n4; n2.right = n5; // n2�� ���� �� -> n4, n2�� ������ �� -> n5
		n3.left = n6; n3.right = n7; // n3�� ���� �� -> n6, n3�� ������ �� -> n7
		n4.left = n8; n5.right = n9; // n4�� ���� �� -> n8, n5�� ������ �� -> n9
		n7.right = n10; n9.right = n11; // n7�� ������ �� -> n10, n9�� ������ �� -> n11
		return n1; // ���� �� ����
	}
	public void A_Course(Node n) { // A�ڽ�
		if (n != null) {
			System.out.print(n.name + "-> "); // �� n �湮
			A_Course(n.left); // n�� �������� ����
			A_Course(n.right); // n�� ���������� ����
		}
	}
	public void B_Course(Node n) { // B�ڽ�
		if (n != null) {
			B_Course(n.left); // n�� �������� ����
			System.out.print(n.name + "-> "); // �� n �湮
			B_Course(n.right); // n�� ���������� ����
		}
	}
	public void C_Course(Node n) { // C�ڽ�
		if (n != null) {
			C_Course(n.left); // n�� �������� ����
			C_Course(n.right); // n�� ���������� ����
			System.out.print(n.name + "-> "); // �� n �湮
		}
	}
	public static void main(String[] args) {
		Travel t = new Travel(); // ���� ��ü ����
		t.start = t.map();
		System.out.print("A�ڽ� : ");
		t.A_Course(t.start);
		System.out.println();
		System.out.print("B�ڽ� : ");
		t.B_Course(t.start);
		System.out.println();
		System.out.print("C�ڽ� : ");
		t.C_Course(t.start);
	}
}
