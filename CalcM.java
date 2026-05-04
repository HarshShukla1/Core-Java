public class CalcM {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int c = obj.add(3,5);
        int d = obj.sub(5,2);
        int e = obj.mul(3,5);
        int f = obj.div(10,2);
        System.out.println(c+" "+d+" "+e+" "+f);
    }
}
