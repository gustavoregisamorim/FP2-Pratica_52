
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica52 {
    public static void main(String[] args){
        
        try{
            Equacao2Grau<Integer> equacao1 = new Equacao2Grau<>(3,18,6);
              
            System.out.println(equacao1.getRaiz1());
            System.out.println(equacao1.getRaiz2());
        }
        catch(RuntimeException e){
            System.out.println(e);
        }
     }
}
