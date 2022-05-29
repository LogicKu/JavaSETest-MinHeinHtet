public class Q21 implements One {
    public static void main(String[] args) {
        System.out.println(one+ Two.two);
    }
}
interface One {
    int one = 4;
}
interface Two extends One{
    int two = 5;
}