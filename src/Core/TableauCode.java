package Core;

import java.lang.Math;
import java.util.Arrays;
import java.io.IOException;

public class TableauCode {
	GetPropertiesValues gNE = new GetPropertiesValues(); // Crée un objet gNE à partir de la classe GetPropertiesValues

	private String init = gNE.getPropertiesValues(); // Attribue à test les valeurs de getProp
	private String stringNombreEntree = gNE.getNombreEntree(); // Attribue à strNomEnt la valeur extraite par gNE
	private int nombreEntree = Integer.decode(stringNombreEntree); /*	Convertit strNomEnt de String à Integer pour
																	 	utilisation en tant que nombre d'input d'un
																	 	tableau */
	private int codeInt[] = new int[nombreEntree]; // declare tableau d'entiers
	private String code[] = new String[codeInt.length]; // declare un tableau String ayant les mêmes caractéristiques que codeInt

	public TableauCode() throws IOException {
		double X;
		for (int i = 0; i < codeInt.length; i++) { // pour tout i = 0; i<longueur codeInt; ajouter 1 à i
			X = Math.round(-0.5 + Math.random() * 10); // X = un nombre arrondi à 0 décimale de la valeur aléatoire -0.05 à 0.95 multiplié par 10 
			codeInt[i] = (int) X;  // attribue à codeInt pour chaque itération i la valeur de X 
			code[i] = String.valueOf(codeInt[i]); // attribue à code pour chaque itération i la valeur sous format objet String de codeInt à la même itération i
		}

	}
	// ******************************* Getter *******************************

	public String getCode() {
		return Arrays.toString(code);
	}

}
