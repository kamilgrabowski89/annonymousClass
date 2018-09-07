package anonymousClass;

public class Main {


    public interface Button {
        void click();

        void mouseOn();
    }

    public static void action() {
        Button button = new Button() {
            @Override
            public void click() {
                System.out.println("Przycisk klikniety");
            }

            @Override
            public void mouseOn() {
                System.out.println("Mysz poruszona");
            }
        };

        button.click();
        button.mouseOn();
    }

    public static void main(String[] args) {
action();

    }
}
