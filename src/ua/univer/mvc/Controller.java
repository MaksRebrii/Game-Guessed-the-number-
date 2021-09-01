package ua.univer.mvc;

import java.util.Scanner;

public class Controller {
        private Model model;
        private View view;

    // Constants


    // REGEX

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        while (true){
            //setting new value
            model.setValue(inputIntValueWithScannerAndDiapason(sc));
            view.printMessage(View.OUR_INT + model.getValue());

            if(model.getValue() == model.GUESSEDNUMBER){
                view.printMessage(view.WIN);
                break;
            }

            view.printMessage(view.TRY_AGAIN);


            if(model.getValue() < model.GUESSEDNUMBER)
                model.setMinBarrier(model.getValue());
            else
                model.setMaxBarrier(model.getValue());
        }

    }

        // The Utilit y methods



    public int inputIntValueWithScannerAndDiapason(Scanner sc) {
        int res = 0;

        view.printMessage(String.format("Range {%d, %d}", model.getMinBarrier(), model.getMaxBarrier()));
        view.printMessage(view.ATTEMPTS + model.getHistory());
        view.printMessage(view.OUR_LAST_ATTEMPT + model.getValue());
        view.printMessage(view.INPUT_INT_DATA);

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(view.WRONG_INPUT_DATA
                        + view.INPUT_INT_DATA);
                sc.next();
            }

            // check value in diapason
            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.printMessage(view.WRONG_RANGE_DATA
                        + View.INPUT_INT_DATA);
                continue ;
            }
            break;
        }
        return res;
    }


}
