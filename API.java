import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class API{

    public static void main(String[] args) {
        try {
            String apiUrl = "https://jsonplaceholder.typicode.com/users/1";

            URI uri = new URI(apiUrl);
            URL url = uri.toURL();

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream())
            );

            String line;
            System.out.println("User API Response:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
