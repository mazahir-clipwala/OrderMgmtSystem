package learnings.by.ali;

import javax.xml.bind.annotation.XmlElement;

public class PurchaseOrder {
	String product;
	int price;
	
	@XmlElement (required = true)
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
