public class Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("H");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        sb.append(" ");
        sb.append("s");
        sb.append("a");
        sb.append("c");
        sb.append("Z");
        sb.append("z");
        System.out.println(sb);
        System.out.println("Length : " + sb.length());
    }
}
