package dto;

public class Spending {
	private int sid;
	private String day;
	private int hid;
	private int iid;
	private int kubetu;
	private int money;
	private String memo;

	public Spending(String day,int hid,int iid,int money,String memo) {
		this.day = day;
		this.hid = hid;
		this.iid = iid;
		this.money = money;
		this.memo = memo;

	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public int getKubetu() {
		return kubetu;
	}
	public void setKubetu(int kubetu) {
		this.kubetu = kubetu;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

}
