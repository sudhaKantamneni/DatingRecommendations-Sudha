package factory;

import model.InputType;
import service.FileInput;
import service.InputService;

/*Factory class to get the input.txt
*/
public class InputFactory {

    public static InputService getInputFrom(InputType inputType) {
        switch (inputType) {
                //change the local file path
            case FILE: return new FileInput("C:\\Users\\admin\\git\\DatingRecommendations-Sudha\\DatingRecommendations-Sudha\\src\\input.txt");
            default: return new FileInput("C:\\Users\\admin\\git\\DatingRecommendations-Sudha\\DatingRecommendations-Sudha\\src\\input.txt");
        }
    }
}
