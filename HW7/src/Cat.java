public class Cat {
    private String name;
    private boolean hunger = false;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        hunger = p.decreaseFood(appetite, p);
        System.out.println(name + " съел " + appetite + " еды.");

    }

    public void Hungers() {
        if (hunger) {
            System.out.println(name + " теперь сыт");
        } else {

            System.out.println(name + " всё ещё голоден");
        }
    }

    public String getName() {
        return name;
    }
}
