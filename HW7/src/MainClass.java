public class MainClass {
    public static void main(String[] args) {
        int catNum = 2;
        Cat[] cat = new Cat[catNum];
        cat[0] = new Cat("Barsik", 5);
        cat[1] = new Cat("Sauron", 5);
        Plate plate = new Plate(10);
        for (int x = 0; x < catNum; x++) {
            System.out.println("----" + cat[x].getName() + "----");
            plate.info();
            cat[x].eat(plate);
            plate.info();
            cat[x].Hungers();
        }
    }
}
