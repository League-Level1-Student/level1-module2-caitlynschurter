
public class Candy {

	private String maker;
	private boolean isChocolatey;
	private double price;
	
	public Candy(String maker, boolean isChocolatey, double price) {
		this.maker = maker;
		this.isChocolatey = isChocolatey;
		setPrice(price);
		
	}
	
	public String getMaker() {
		return maker;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double Price) {
		if (price >= 0) {
			this.price = price;
		}
	}
	
	//public boolean getisChocolatey() {
		
	

	
}
