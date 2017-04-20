
import java.util.Scanner;

/**
 *
 * @author alunoinf
 */
public class G1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quant, indexCom,indexFim;
        Scanner scan = new Scanner(System.in);
        
        quant = scan.nextInt();
        String [] letras = new String [quant];
        String [] nova = new String [quant];
  
        for(int i =0; i<quant;i++){
            letras[i] = scan.next();
            nova[i] = "";
            
            for(int j = 0; j<letras[i].length();j++){
                
                if(j !=  (letras[i].length()-1) && letras[i].charAt(j) == letras[i].charAt(j+1)){
                    indexCom = j;
                    indexFim = j;
                    while(letras[i].charAt(indexCom) == letras[i].charAt(indexFim)){
                        indexFim++;
                        if(indexFim > letras[i].length()-1){
                            break;
                        }
                    }
                    nova[i] += letras[i].substring(indexCom,indexCom+1);
                    j = (indexFim-1);
                }
                else{
                    nova[i] += letras[i].substring(j,j+1);
                }
                    
            }
        }
        for(int i =0; i<quant;i++){
            System.out.println(nova[i]);
        }
                
       
       
        
    
        
    }
    
}
