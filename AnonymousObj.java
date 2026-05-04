class a{
    public a()
    {
        System.out.println("object is created ");
    }
    public void show()
    {
        System.out.println("in A show");
    }
}


public class AnonymousObj {
    public static void main(String[] args) {
        new a().show();    //anonymous object but can be used once
    }
}
