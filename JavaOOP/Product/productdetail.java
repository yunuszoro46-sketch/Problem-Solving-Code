package PKG1;

public class  productdetail{
	public static void main(String[] args) {
		 uap product = new uap("strawberry","25101109",2500,7.5);
		 product.updatePrice(1000);
		 product.displayInfo();
		 product.setDiscountPercentage(20);
		 product.getDiscountedPrice();
	}
	

}
