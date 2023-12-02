package lab5;

public class Main {

    public static void main(String[] args) {
        String txt = ("The digital age is one of instant gratification. The situation may be familiar to you: you’re having coffee or " +
                "dinner with some friends when somebody asks a general knowledge question. Nobody knows the answer but at least one person gets their smartphone " +
                "out ready to find it. Where do we go for that info? Chances are it will be a random Google search or a check on Wikipedia. Triumphantly, they provide " +
                "you with the answer. It’s information which you don’t argue with and then instantly forget – it’s ephemeral. The internet seems to be the most popular " +
                "place to find information these days and it’s not hard to see why – it is all just a click away. But, couldn’t that also be why problems arise? After" +
                " all, how do we know that the information we read is correct? What is the original source of these facts? And do we really understand the difference " +
                "between opinion and fact? Many people argue that all this is a natural consequence of the digital age. It is a more democratic age: we can write and " +
                "upload our own content and share it happily with others. But generally, online writers dumb down the ideas they write about. All that information is " +
                "there at our fingertips, but it’s expressed in shorter, simpler ways and, worse, it’s possibly inaccurate. ");
        Text text = new Text(txt);
        Text sent = new Text("it");
        Text.exercise(text, sent.getSentences()[0].getWord());
    }
}