
public class MemberPayDemo {
	public static void main(String[] args) {
		MemberPay m = new MemberPay();
		m.setSeq(1); // �������� m.seq = 1; �̷��� �ߴµ� ������ �ȵǱ� ������ �̷��� �ڵ���!!
		m.setGroup(2);
		m.setName("�ڹ� �����ϸ��� �ϼ��ϱ�");
		m.setPrice(500_100);
		m.setStatus("1");
		m.setValid(true);
		m.setSdate("2021-05-10");
		m.setEdate("2021-12-31");
		m.setRegdate("2021-05-10");
		
		System.out.println(m.getSeq());
		System.out.println(m.getGroup());
		System.out.println(m.getName());
		System.out.println(m.getPirce());
		System.out.println(m.getStatus());
		System.out.println(m.isValid());
		System.out.println(m.getSdate());
		System.out.println(m.getEdate());
		System.out.println(m.getRegdate());
	}

}
