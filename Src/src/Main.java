import java.io.IOException;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) throws IOException {
     Game game = new Game();
        GetPropertiesValues values = new GetPropertiesValues();
        values.getPropertiesValues();
        System.out.println("Mode dev : "+ values.getModeDev());
    }


}
