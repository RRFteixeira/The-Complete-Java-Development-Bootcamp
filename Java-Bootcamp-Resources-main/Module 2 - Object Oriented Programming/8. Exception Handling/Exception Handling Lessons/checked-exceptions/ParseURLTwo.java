import java.net.MalformedURLException;
import java.net.URL;

public class ParseURLTwo {
    public static void main(String[] args) {
        parseURL("https://www.google.com/images");
    }
    public static void parseURL(String link) {

        try{
            URL url = new URL(link);
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
        }catch (MalformedURLException e){

            System.out.println(e.getMessage());
        }

    }    
}
