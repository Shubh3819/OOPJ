class Apple {

    public void show() {
        System.out.println("This is the show() method of Apple class.");
    }
}


class Banana extends Apple {

    @Override
    public void show() {
        System.out.println("This is the show() method of Banana class.");
    }
}


class Cherry extends Apple {

    @Override
    public void show() {
        System.out.println("This is the show() method of Cherry class.");
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

        apple.show();
        banana.show();
        cherry.show();
    }
}
