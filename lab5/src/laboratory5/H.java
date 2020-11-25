package laboratory5;

public class H extends G {

    private static X x = new X("Saturday");

    protected H(String name, X x) {
        super(name, x);
        System.out.println("from class H");
        System.out.println(H.x.getName());
    }
}
