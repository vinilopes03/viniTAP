

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author vinilopes03
 */
public class J1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quant,size,contador;
        double result,menor;
        String [] entrada;
        Scanner scan = new Scanner(System.in);
        HashMap map = new HashMap();
        
        DecimalFormat df = new DecimalFormat("###.00");
        df.setRoundingMode(RoundingMode.UP);
        
        quant = scan.nextInt();
        
        for(int i =0;i<quant;i++){
            menor = 10000000;
            contador=0;
            result =0;
            
            size= scan.nextInt();
            entrada = new String[size];
            
            for(int j = 0;j<size;j++){
                entrada[j] = scan.next();
            }
            for(int j = 0;j<size;j++){
                
                for(int k = 0;k<size;k++){
                    if(entrada[j].charAt(k)=='s'){
                        map.put("sx", j);
                        map.put("sy",k);
                    }
                    if(entrada[j].charAt(k)=='p'){
                        
                        map.put(contador+"x",j);
                        map.put(contador+"y",k);
                        contador++;
                    }
                }
            }
            
            for(int j =0;j<contador;j++){
                result = Math.sqrt(((int) Math.pow(((int)map.get("sx") - (int)map.get(j+"x")),2))+((int) Math.pow(((int)map.get("sy") - (int)map.get(j+"y")),2)));
                if(result<menor){
                    menor = result;
                    map.put("menorx", map.get(j+"x"));
                    map.put("menory", map.get(j+"y"));
                }
            }
            System.out.println("("+map.get("sx")+","+map.get("sy")+"):("+map.get("menorx")+","+map.get("menory")+"):"+df.format(menor));
          
        }
    }
    
}