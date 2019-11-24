import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VerifCodeAuto {

    GetPropertiesValues nEC = new GetPropertiesValues(); // Cr�e l'objet nEC de la classe GetPropVal
    private String init = nEC.getPropertiesValues(); // Cr�e un str (init) prenant l'ensemble des valeurs de GetPropVal pour valeur
    private String nombreEntreeTab = nEC.getNombreEntree(); // Cr�e un str (nombEntTab) prenant pour valeur getNombEnt de GetPropVal

    GenerationCodeAleatoire cAC = new GenerationCodeAleatoire(); // Cr�e l'objet cAC de la classe TableauCode
    private String line = cAC.getCode();
    private String numbersLine = line.replaceAll("[^0-9]"," ");

    private String[] codeStr = numbersLine.split(" ");

    private int nombreEntree = Integer.decode(nombreEntreeTab); // Cr�e un int (nombEnt) prenant pour valeur la convertion de (nombEntTab) de str en int
    private int prop[] = new int[nombreEntree]; // Cr�e un tableau [int] (prop) de longueur (code)
    private String propStr[] = new String[prop.length]; // Cr�e un tableau [str] (propStr) de longueur (code) servant � retourner le r�ultat sous forme de getter





    public VerifCodeAuto() throws IOException {
        System.out.println(cAC.getCode() + " pour test. Voici le code initial");
        List<Integer> code = new ArrayList<>();
        for (String string : codeStr) { // Parcourt tout les membres du tableau codeStr. Le string est l'objet qui parcourt le tableau
            if (!string.equals("")) {
                System.out.println(string);
                code.add(Integer.parseInt(string));
            }
        }
        for (int i = 0; i < code.size(); i++) { // V�rifie les conditions d'�galit� entre Prop[i] et Code [i]
            int iMin = 0;
            int iMax = 10;
            prop[i] = (iMax - iMin) / 2 + iMin;
            System.out.println("Prop[" + i + "] : " + prop[i] + "    iMax = " + iMax + "    iMin = " + iMin);

            do {
                if (prop[i] < code.get(i)) {
                    iMin = prop[i]++;
                    prop[i] = (iMax - iMin) / 2 + iMin;
                    System.out.println(
                            "Prop[" + i + "] (P<C) : " + prop[i] + "    iMax = " + iMax + "    iMin = " + iMin);
                } else if (prop[i] > code.get(i)) {
                    iMax = prop[i]--;
                    prop[i] = (iMax - iMin) / 2 + iMin;
                    System.out.println(
                            "Prop[" + i + "] (P>C) : " + prop[i] + "    iMax = " + iMax + "    iMin = " + iMin);
                } else if (prop[i] == code.get(i)) {
                    System.out.println("Le code � l'it�ration " + i + " est : " + prop[i]);
                    break;
                }

            } while (true);
            propStr[i] = String.valueOf(prop[i]);
        }

        // System.out.println("\nLe code �tait : "); // affiche le code r�solu
        // for (int i = 0; i<code.length;i++) {
        // System.out.print(propStr[i] + " ");

    }

    public String getPropStr() {
        return Arrays.toString(propStr);
    }

}
