//import java.io.IOException;
import java.net.URI;
import java.util.ArrayList; // Added this in

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> str = new ArrayList<>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return "Current list: " + str;
        } 
        else if (url.getPath().contains("/add")) {
            String[] parameters = url.getQuery().split("=");
            str.add(parameters[1]);                    
            return "Current list: " + str;
        }
            return "404 Not Found!";
    }
}
