import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode; // https://www.baeldung.com/jackson-json-node-tree-model
import com.fasterxml.jackson.databind.ObjectMapper; // https://www.baeldung.com/jackson-object-mapper-tutorial

public class RandomUserApi {

    public static JsonNode getRandomUser() {
        try {
            URL url = new URL("https://api.api-ninjas.com/v1/randomuser");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("accept", "application/json");
            connection.setRequestProperty("X-Api-Key", "5HujXVQdWlRizCmSbPt04g==KUGYbh6KktVwz1Uy");

            InputStream responseStream = connection.getInputStream();

            ObjectMapper mapper = new ObjectMapper();
            JsonNode generatedUser = mapper.readTree(responseStream);

            // Imprimir toda la respuesta JSON
            System.out.println("\n Full JSON Response: \n");
            System.out.println(generatedUser);
            System.out.println("\n Pretty JSON Response: \n");
            System.out.println(generatedUser.toPrettyString());

            return generatedUser;

        } catch (IOException e) {
            System.out.println("\n " + e.getMessage() + " \n");
            return null;
        }
    }
}
