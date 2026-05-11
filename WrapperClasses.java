public class WrapperClasses {
    //for every primitive type we have a class . eg - int -> Integer
    public static void main(String[] args) {
        int num=7;
        Integer num1 =num;   //auto boxing
        
        int num2 = num1;
        System.out.println(num2);  //auto unboxing
    }

}
