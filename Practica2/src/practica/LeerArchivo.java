/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JuanPablo
 */
public class LeerArchivo {
      // lee registro del archivo
    public static void leerRegistros() {

        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("datos/datos.csv"));
            double promedio_goals;
            double promedio_height;
            double suma_goals = 0;
            double suma_height = 0;
            int contador = 0;
            while (entrada.hasNext()) {
                  String linea = entrada.nextLine();
                
                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split("\\|")));
                  suma_goals += Double.parseDouble(linea_partes.get(11));
                  suma_height += Double.parseDouble(linea_partes.get(9));
                  contador++;
            } // fin de while
            promedio_goals = suma_goals / contador;
            promedio_height = suma_height / contador;
            entrada.close();
            System.out.printf("El promedio de goals es: %.2f", promedio_goals);
            System.out.printf("El promedio de height es: %.2f", promedio_height);
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
}
