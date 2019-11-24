package Core;

import java.lang.Math;
import java.util.Arrays;
import java.io.IOException;

public class TableauCode {
	GetPropertiesValues gNE = new GetPropertiesValues(); // Cr�e un objet gNE � partir de la classe GetPropertiesValues

	private String init = gNE.getPropertiesValues(); // Attribue � test les valeurs de getProp
	private String stringNombreEntree = gNE.getNombreEntree(); // Attribue � strNomEnt la valeur extraite par gNE
	private int nombreEntree = Integer.decode(stringNombreEntree); /*	Convertit strNomEnt de String � Integer pour
																	 	utilisation en tant que nombre d'input d'un
																	 	tableau */
	private int codeInt[] = new int[nombreEntree]; // declare tableau d'entiers
	private String code[] = new String[codeInt.length]; // declare un tableau String ayant les m�mes caract�ristiques que codeInt

	public TableauCode() throws IOException {
		double X;
		for (int i = 0; i < codeInt.length; i++) { // pour tout i = 0; i<longueur codeInt; ajouter 1 � i
			X = Math.round(-0.5 + Math.random() * 10); // X = un nombre arrondi � 0 d�cimale de la valeur al�atoire -0.05 � 0.95 multipli� par 10 
			codeInt[i] = (int) X;  // attribue � codeInt pour chaque it�ration i la valeur de X 
			code[i] = String.valueOf(codeInt[i]); // attribue � code pour chaque it�ration i la valeur sous format objet String de codeInt � la m�me it�ration i
		}

	}
	// ******************************* Getter *******************************

	public String getCode() {
		return Arrays.toString(code);
	}

}
