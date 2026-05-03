class Humans
{
    private int age;    // accessible in same class
    private String name;

    public Humans()
    {
        age = 12;
        name="Harsh";
    }

    public int getAge(){
        return age;
    }
     public String getName(){
        return name;
    }
    public void setAge(int a){
        
        age = a;
    }
     public void setName(String n){
        name = n;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Humans obj = new Humans();
        
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
    
}
