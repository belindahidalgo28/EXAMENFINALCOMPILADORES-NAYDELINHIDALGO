/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
import Estructuras.Estructura;
import Estructuras.Funcion;
import Estructuras.Parametro;
import Estructuras.SemanticStack;
import Estructuras.SematicRegister.RS;
import Estructuras.TablaSimbolosScanner;
import Estructuras.TablaSimbolosSemantico;
import Estructuras.Token;
import Estructuras.Variable;
import java.io.File;
import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
      
    }
    
    public static void generar(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
