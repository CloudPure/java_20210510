
public class MemberPay {
	private int seq;
	private int group;
	private String name;
	private  int price;
	private boolean valid;
	private String status;
	private String sdate;
	private String edate;
	private String regdate;
	
	// seq(����Ʈ)�� setter �� seq�� ������ �� ���
	public void setSeq(int seq) {
		//this�� ����� ������ ���ú����� ��������� �����ϱ� ���ؼ� ���
		this.seq = seq; // ������ ��������� �������� ���ú���
	}
	//seq�� getter �� seq�� ������ ������ �� ���
	public int getSeq() {
		return seq; // return this.seq �̷��� �Ǿ��ִµ� ��� ������ ������ ��� this.seq�� �� ��
	}
	
	
	// group�� setter ����
	public void setGroup(int group) {
		this.group = group;
	}
	
	// group�� getter ���� - �Ű����� ��� () ���� �������
	public int getGroup() {
		return group;
	}
	
	// name�� setter ����
	public void setName(String name) {
		this.name = name; // �ɹ������� name �̰� ���ú����� name �ֱ�
	}
	
	// name�� getter ����
	public String getName() {
		return name;
	}
	
	// price�� getter ����
	public void setPrice(int price) {
		this.price = price;
	}
	
	// price�� getter ����
	public int getPirce() {
		return price;
	}
	// valid�� setter ����
	public void setValid(boolean vaild) {
		this.valid = valid;
	}
	
	// vaild�� getter ���� �� vaild �ڷ����� boolean�� ���� getXXX�� �ƴ϶� isXXX�� �����Ѵ�.
	public boolean isValid() {
		return valid;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getSdate() {
		return sdate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getEdate() {
		return edate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getRegdate() {
		return regdate;
	}
	
	
}












