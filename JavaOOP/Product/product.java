package PKG1;

class uap {
    public String name,id;
    public double price;
    public double discountPercentage;
 public uap(String name2,String id2,double price2,double discountPercentage2 ) {
  this.name=name2;
  this.id=id2;
  this.price=price2;
  this.discountPercentage=discountPercentage2;
 }

 

 public void updatePrice(double newPrice) {
  this.price=price+newPrice;
 }
 public double getPrice() {
  return this.price;
 }
 public void setDiscountPercentage(double discPercentage) {
  this.discountPercentage=discPercentage;
 }
 public double getDiscountedPrice() {
  return price - (price * (discountPercentage / 100.0));
 }
 public void displayInfo() {
  System.out.println("Name of Product: "+name+" id of Prodcut: "+id+" Price of product: "+price+" discountPercentage of product : "+discountPercentage);
 }
 
 
}
