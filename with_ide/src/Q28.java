abstract class Q28{
    abstract void name (int a);
    }
class E{
    public E() {
        Q28 obj = new Q28() {
            @Override
            void name(int a) {
                 a=2;
            }

        };

    }
    public static void main(String[] args) {
        System.out.println(2);
    }
}
