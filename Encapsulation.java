class Humans
{
    private int age;    // accessible in same class
    private String name;

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

class Encapsulation
{
    public static void main(String[] args) {
        Humans obj = new Humans();
        obj.setAge(11);
        obj.setName("Harsh");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}