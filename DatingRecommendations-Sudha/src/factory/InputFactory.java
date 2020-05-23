package factory;

import model.InputType;
import service.FileInput;
import service.InputService;

/**
* Factory class to get the input.txt
 * @author admin
 */
public class InputFactory {

    public static InputService getInputFrom(InputType inputType) {
        switch (inputType) {
                //input Filefile path
               case FILE: return new FileInput(".\\DatingRecommendations-Sudha\\src\\input.txt");
               default: return new FileInput(".\\DatingRecommendations-Sudha\\src\\input.txt");
        }
    }
}
