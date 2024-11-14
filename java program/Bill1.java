interface Bill{
double calculate();
}
class BillImplementation implements Bill{
double price,quantity;
BillImplementation(double price,double quantity){
this.price=price;
this.quantity=quantity;
}
public double calculate(){
return price*quantity;
}
}
public class Bill1{
public static void main(String args[])
{
BillImplementation bill=new BillImplementation(10,5,3);
System.out.println("Total Bill Amount:"+bill.calculate());
}
}