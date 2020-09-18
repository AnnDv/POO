package lab1;

public class main {
    public static void main(String[] args){
        Monitor(); // class call
    }

    public static void Monitor() {
        Monitor monitor1 = new Monitor("Acer", "Black", 1080, 18.3f); // I created new object1
        Monitor monitor2 = new Monitor("Dell", "White", 720, 16.9f);  // new object2

        monitor1.monitorCharacteristics();  // call the method monitorCharacteristics
        monitor2.monitorCharacteristics();

        if(monitor1.resolution > monitor2.resolution && monitor1.dimensions > monitor2.dimensions) {
            System.out.println(monitor1.name + " is better than " + monitor2.name);
        } else {
            System.out.println(monitor2.name + " is better than " + monitor1.name);
        }
    }
}
