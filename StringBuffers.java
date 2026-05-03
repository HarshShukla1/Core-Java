public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("harsh");
        System.out.println(sb.length());
        sb.append("Shukla");
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
    }
    
}
