package Ch38.Domain;



public class LendDTO {
	private int Lid;
	private int bookcode;
	private String memId;
	private String startDate;
	private String endDate;
	
	
	
	
	@Override
	public String toString() {
		return "LendDTO [Lid=" + Lid + ", bookcode=" + bookcode + ", memId=" + memId + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public int getBookcode() {
		return bookcode;
	}
	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public LendDTO(int lid, int bookcode, String memId, String startDate, String endDate) {
		super();
		Lid = lid;
		this.bookcode = bookcode;
		this.memId = memId;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public LendDTO(){};
	//Getter and Setter
	//toString
	//기본 생성자 , 모든인자 생성자
	
	
}
