
public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n, Plate p) {

        if (food - n >= 0) {
            food -= n;
            return true;
        } else {
            System.out.println("Недостаточно еды на торелке");
            p.addFood(n);
            food -= n;
            return true;
        }

    }

    public void info() {
        System.out.println("На торелке осталось: " + food);
    }

    public void addFood(int add) {
        System.out.println("Вы добвили " + add + " еды.");
        food = +add;
    }
}

