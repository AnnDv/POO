package laboratory5;

public class D extends C {

    protected static X x = new X("badminton");

    protected D(String name, X x) {
        super(name, x);
        System.out.println("from class D");
        System.out.println(D.x.getName());
    }
}
