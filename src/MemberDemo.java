
public class MemberDemo {
	public static void print(Member m) {
		// Member m = new Member();
		String name = m.getName();
		String email = m.getEmail();
		String Zipcode = m.getZipcode();
		String getAddr1 = m.getAddr1();
		String getAddr2 = m.getAddr2();
		int age = m.getAge();
		print(m);
		// print(name,email.zipcode,Addr1,Addr2,age) �̷� �����δ� ���� ��! ����������

		System.out.println(name);
		System.out.println(email);
		System.out.println(Zipcode);
		System.out.println(getAddr1);
		System.out.println(getAddr2);
		System.out.println(age);
	}



	// �̰Ŵ� ���� �� ���� �ڵ�!! �밡�� ���ϴ� ���̿�..�̷� �� ���Ÿ� Ŭ���� �ʿ䰡 ����

	/*
	 * public static void print(String name, String email, String zipcode, String
	 * addr1, String addr2, int age){ System.out.println(name);
	 * System.out.println(email); System.out.println(Zipcode);
	 * System.out.println(getAddr1); System.out.println(getAddr2);
	 * System.out.println(age); }
	 */

	// public static void print(Member m){} �̷� �ڵ尡 ��û ��������

	public static void main(String[] agrs) {
		Member m = new Member();
		
		// ctrl ������ setName ������ ��ġ�� ����ִ��� �˷���
		//m.name = "������"
		m.setName("������");
		m.setEmail("syh@hbilab.org");
		m.setZipcode("09876");
		m.setAddr1("���� ��걸 ���¿���");
		m.setAge(30);

		/*
		String name = m.getName();
		System.out.println(name);
		*/
		
	}

}
