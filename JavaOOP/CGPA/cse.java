package PKG1;

public class cse {
	  public String name,id;
	  public double credit,cgpa;
	  
public cse(String name2,String id2 , double credit2 , double cgpa2) {
	   this.name=name2;
	   this.id=id2;
	   this.cgpa=cgpa2;
	   this.credit=credit2;
}
public void updateCgpa(double courseCredit, double courseGpa) {
	
	double currentPoints = this.cgpa * this.cgpa;
    
    double newPoints = courseGpa * courseCredit;
    
   
    this.cgpa += courseCredit;
    
  
    this.cgpa = (currentPoints + newPoints) / this.cgpa;
}
public void displayInfo() {
	System.out.println("Name: "+name+" id: "+id+" credit: "+credit+" cgpa: "+cgpa);
}
}
