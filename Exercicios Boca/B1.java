

import static java.lang.Float.parseFloat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alunoinf
 */
public class B1 {
 
    private static final Pattern PATTERN = Pattern.compile("(\\d+\\.\\d+)|(\\d+)");
    
    public static String encontrarNumero(String texto){
        Matcher matcher = PATTERN.matcher(texto);    
        if (matcher.find()){
            String codigo = matcher.group();
            
            return codigo;
        }
        else return null;
        }
    
    public static void main(String[] args) {
        ArrayList formula = new ArrayList();
        Scanner sc1 = new Scanner(System.in);
        int quant;
        float[] resultado;
        boolean enumero=true;
        
        
        
        quant = sc1.nextInt();
        resultado = new float[quant];
        DecimalFormat df = new DecimalFormat("0.00");
        
        for(int i = 0; i<quant;i++){
            
            formula.add(sc1.next());
           
            resultado[i]+=   parseFloat(encontrarNumero(formula.get(i).toString()));
            
           
    
            for(int j=0; j< formula.get(i).toString().length();j++){
                
                if(formula.get(i).toString().charAt(j) == '@'){
                    resultado[i]= resultado[i]*3;
                    
                   
                }
                else if(formula.get(i).toString().charAt(j) == '%'){
                    resultado[i]= resultado[i]+5;
                   
                }
                else if(formula.get(i).toString().charAt(j) == '#'){
                    resultado[i]= resultado[i]-7;
                    
                }
                
            }
           
        }
        
        for(int i = 0;i<quant;i++){
            System.out.println(df.format(resultado[i]));
        }
         
        
    }

    
}
