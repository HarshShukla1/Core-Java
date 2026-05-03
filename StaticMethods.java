class Smartphones
{
     String brand; //instance variable
    int price;
    static String name;   //making name variable common for both objects

    static
    {
        name = "Phone";      //static block
        System.out.println("In static block"); //to initialize stayic variables
    }



    public void show()
    {
        System.out.println(brand+" "+price+" "+name);
    }
    public Smartphones()
    {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }
     //non static variables can be accessed through the objs
     //inside a static method only static variables can be used   
}
public class StaticMethods {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Smartphones");    //loads the class it instantiate the class just execute the static block
         
       /*  Smartphones obj1 = new Smartphones();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Smartphones.name = "Smartphone";  
        
        Smartphones obj2 = new Smartphones(); */

        //static variables should be accessed with their class name
  //cant call non static method with classname but can call static method
    }
    
}
