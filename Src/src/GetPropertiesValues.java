import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.util.Properties;

public class GetPropertiesValues {
    private String modeDev;
    private String nombreEssais;
    private String nombreEntree;
    private InputStream inputstream;

    public String getPropertiesValues() throws IOException {
        String propFile = "config.properties";
        Properties prop = new Properties();

        inputstream = getClass().getClassLoader().getResourceAsStream(propFile);
        try {
            prop.load(inputstream);
            modeDev = prop.getProperty("modeDev");
            nombreEssais = prop.getProperty("nombreEssais");
            nombreEntree = prop.getProperty("nombreEntree");
            return modeDev + " " + nombreEssais + " " + nombreEntree;
        } finally {
            inputstream.close();
        }
    }
    // *******************Getter*****************

    public String getModeDev() {
        return modeDev;
    }

    public String getNombreEssais() {
        return nombreEssais;
    }

    public String getNombreEntree() {
        return nombreEntree;
    }}
