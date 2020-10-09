package laboratory2;

public class main {
    public static void main (String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(4);
        Box box3 = new Box(2, 4, 6);

        Queue queue1 = new Queue();
        Queue queue2 = new Queue(4);


        queue1.push(box1);
        queue1.push(box2);
        queue1.pop();
        queue1.isFull();

        queue2.push(box1);
        queue2.push(box3);
        queue2.pop();
        queue2.push(box2);

        queue2.isFull();
    }
}
