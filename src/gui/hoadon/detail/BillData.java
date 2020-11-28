package gui.hoadon.detail;

public class BillData {
	private int order;
	private String name;
	private int number;
	private int price;
	public BillData(int order, String name, int number, int price) {
		super();
		this.order = order;
		this.name = name;
		this.number = number;
		this.price = price;
	}
	
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
