package lab3;

import java.util.regex.Pattern;

public class Main {
    /*
        1107
        C3 = 0 -> StringBuilder
        C17 = 0 ->  Знайти найбільшу кількість речень заданого тексту, в яких є однакові слова.
        */

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("The digital age is one of instant gratification. The situation may be familiar to you: you’re having coffee or " +
                "dinner with some friends when somebody asks a general knowledge question. Nobody knows the answer but at least one person gets their smartphone " +
                "out ready to find it. Where do we go for that info? Chances are it will be a random Google search or a check on Wikipedia. Triumphantly, they provide " +
                "you with the answer. It’s information which you don’t argue with and then instantly forget – it’s ephemeral. The internet seems to be the most popular " +
                "place to find information these days and it’s not hard to see why – it is all just a click away. But, couldn’t that also be why problems arise? After" +
                " all, how do we know that the information we read is correct? What is the original source of these facts? And do we really understand the difference " +
                "between opinion and fact? Many people argue that all this is a natural consequence of the digital age. It is a more democratic age: we can write and " +
                "upload our own content and share it happily with others. But generally, online writers dumb down the ideas they write about. All that information is " +
                "there at our fingertips, but it’s expressed in shorter, simpler ways and, worse, it’s possibly inaccurate. ");

        //Зберігаємо дані у потік | обрізаємо пробіли | переводимо в нижній регістр
        String text = s.toString().trim().toLowerCase();
        //замінюємо символи кінця речення в крапку | розділяємо текст на речення
        text = text.replace("?", ".").replace("!", ".").replace("...", ".");
        String[] sentences = text.split("\\.");
        //Видаляємо пунктуацію
        String withoutpuct = text.replaceAll("\\p{P}", "");
        //розбиваємо речення на підрядки(по словам)
        String[] wordsplitted = withoutpuct.split(" ");
        StringBuilder SetofWords = new StringBuilder();


        for (String value : wordsplitted) {
            if (!SetofWords.toString().contains(value)) {
                SetofWords.append(",").append(value);
            }
        }

        //розбили потік на список слів | створюємо змінну лічильника | його аналога для порівняння | рядок для словаString[] Words = SetofWords.toString().split(",");
        String[] Words = SetofWords.toString().split(",");
        int counter = 0;
        int MaxAmount = 0;
        String repetedword = new String();

        //Перебираємо слова в реченнях і збільшуємо лічильник, коли знаходимо слово, що співпало
        for (int j = 1; j < Words.length; ++j) {
            for (int k = 0; k < sentences.length; ++k) {
                Pattern pattern = Pattern.compile(Words[j] + "\\b");
                if (pattern.matcher(sentences[k]).find()) {
                    ++counter;
                }
            }
            //Шукаємо речення, в яких більше всього співпадінь
            if (counter > MaxAmount) {
                MaxAmount = counter;
                repetedword = Words[j];
            }

            counter = 0;
        }

        System.out.println("The largest number of sentences with the same words: " + MaxAmount);
        System.out.println("Repeated word: " + repetedword);
    }
}