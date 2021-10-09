package lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String s, Context context) {
        return s;
    }
}
