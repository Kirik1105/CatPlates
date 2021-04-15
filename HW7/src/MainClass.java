public class MainClass {
    public static void main(String[] args) {
        
        Cat[] cat = new Cat[2];
        cat[0] = new Cat("Barsik", 5);
        cat[1] = new Cat("Sauron", 5);
        Plate plate = new Plate(5);
        for (int x = 0; x < 2; x++) {
            System.out.println("----" + cat[x].getName() + "----");
            plate.info();
            cat[x].eat(plate);
            plate.info();
            cat[x].Hungers();
        }
    }
}
