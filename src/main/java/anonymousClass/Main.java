package anonymousClass;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Main {


    public interface ButtonT {
        void click();

//        void mouseOn();
    }

    public static void action() {
        ButtonT button = new ButtonT() {
            @Override
            public void click() {
                System.out.println("Przycisk klikniety");
            }

//            @Override
//            public void mouseOn() {
//                System.out.println("Mysz poruszona");
//            }
        };

        button.click();
//        button.mouseOn();
    }

    public static void main(String[] args) {
        ButtonT button = () ->
                System.out.println("Przycisk klikniety");
        button.click();

        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Jestem w nowym watku");
            }
        };

        Runnable r1 = () -> System.out.println("Jestem w kolejnym watku");
        r1.run();

        Button btn = new Button();

        btn.setText("Test");
        btn.setOnAction(event -> System.out.println("Przycisk zostal klikniety"));


    }
}
