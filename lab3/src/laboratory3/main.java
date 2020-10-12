package laboratory3;

public class main {
    public static void main(String[] args) {

        String str = "Once upon a time there was an old man, an old woman, and a little boy."+
                " One morning the old woman made some gingerbread in the shape of a man. " +
                "She added icing for his hair and clothes, and little blobs of dough for his nose and eyes. " +
                "When she put him in the oven to bake, she said to the little boy, " +
                "\"You watch the gingerbread man while your grandfather and I go out to work in the garden.\"\n" +
                "\n" +
                "So the old man and the old woman went out and began to dig potatoes, and left the little boy to tend the oven. " +
                "But he started to day dream, and did not watch it all of the time. ";

        TextManipulation textManipulation = new TextManipulation(str);
        textManipulation.showDataAboutText();
    }
}
