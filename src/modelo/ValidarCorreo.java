
package modelo;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class ValidarCorreo {
 
    public boolean ValidarEmail(String email){
    //Patron para validar email 
    Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    Matcher mather =pattern.matcher(email);
    return mather.find();
    }
}
