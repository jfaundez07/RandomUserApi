import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode generatedUser = RandomUserApi.getRandomUser();
        User usuario = null;

        try {
            usuario = mapper.treeToValue(generatedUser, User.class);
        } catch (IOException e) {
            System.out.println("\n " + e.getMessage() + " \n");
        }

        try {
            System.out.println("\n Datos del usuario obtenidos de la clase Usuario: \n");
            System.out.println("Nombre: " + usuario.getName());
            System.out.println("Nombre de usuario: " + usuario.getUsername());
            System.out.println("Genero: " + usuario.getSex());
            System.out.println("Dirección: " + usuario.getAddress());
            System.out.println("Correo: " + usuario.getEmail());
            System.out.println("Cumpleaños: " + usuario.getBirthday());
        } catch (NullPointerException e) {
            System.out.println("\n " + e.getMessage() + " \n");
        }
    }

}
