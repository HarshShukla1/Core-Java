class Mobile
{
    String brand; //instance variable
    int price;
    static String name;   //making name variable common for both objects

    public void show()
    {
        System.out.println(brand+" "+price+" "+name);
    }
}


public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";    //static variables should be accessed with their class name

        obj2.brand = "Samsung";
        obj2.price = 1300;
        Mobile.name = "Smartphone";

        Mobile.name = "Phone";   //since its static its change will effect both the objects

        obj1.show();
        obj2.show();
    }
    
}
