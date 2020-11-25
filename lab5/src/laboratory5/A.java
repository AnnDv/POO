package laboratory5;

public class A {
    protected String name;
    protected static X x = new X("blabla");

    protected A(String name, X x) {
        this.name = name;
        System.out.println("from class A");
        System.out.println(A.x.getName());
    }
}
