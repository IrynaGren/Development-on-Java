package lab6;
public class Main {

    public static void main(String[] args) {
        Salat salat = new Salat();
        salat.add(new Pumpkins("Cucumber", 200.0, 26.0));
        salat.add(new Spicy("Dill", 18.0, 5.0));
        salat.add(new Spicy("Parsley", 20.0, 10.0));
        salat.add(new Onions("Onion", 50.0, 21.0));
        salat.add(new Roots("Radish", 200.0, 48.0));
        System.out.println("Unsorted list:\n\n" + salat + "===================================================\n");
        salat.sort();
        System.out.println("Sorted by weight list:\n\n" + salat + "===================================================\n");
        System.out.println("Vegetables with a calorie content of 25 to 50 kcal in a salad:\n");
        salat.caloricContentRange(25.0, 50.0);
        System.out.println("Calorie content of the salad" + salat.getCaloricContent() + " kcal");
    }
}