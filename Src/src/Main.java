import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        GetPropertiesValues values = new GetPropertiesValues();
        values.getPropertiesValues();
        System.out.println("Mode dev : " + values.getModeDev());
        System.out.println("Nombre entrée : " + values.getNombreEntree());
        System.out.println("Nombre d'essais : " + values.getNombreEssais());
    }


}
