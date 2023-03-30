public class Id {
    private static int id = 0;

    public static int next() {
        return ++id;
    }
}