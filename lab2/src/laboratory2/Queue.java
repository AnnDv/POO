package laboratory2;

import java.util.ArrayList;

public class Queue {
    private int maxSize;
    private ArrayList<Box> boxes;
    private boolean parameters;

    Queue(){
        boxes = new ArrayList<Box>();
        parameters = false;
    }
    Queue(int maxSize){
        boxes = new ArrayList<>();
        parameters = true;
        this.maxSize = maxSize;
    }

    public void push(Box value) {
        if (parameters) {
            if(boxes.size() < maxSize) {
                boxes.add(value);
            } else  {
                System.out.println("Out of space");
            }
        } else {
            boxes.add(value);
        }
    }
    public Box pop() {

        Box temporaryBox;

        if(boxes != null) {
            temporaryBox = boxes.get(0);
            boxes.remove(0);
            return temporaryBox;
        }
        return null;
    }

    public void isFull() {
        if(parameters) {
            System.out.println("Current size:"+ boxes.size() + " MaxSize:" + maxSize);
        } else {
            System.out.println("It is never full");
        }
    }
}
