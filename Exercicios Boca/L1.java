

import java.util.Scanner;

/**
 *
 * @author vinilopes03
 */
public class L1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont1, cont0;
        String entrada;
        String result;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            cont1=0;
            cont0=0;
            entrada = scan.next();
            entrada = Integer.toBinaryString(Integer.parseInt(entrada));
            
            for(int j = 0; j<entrada.length();j++){
                
                if(entrada.charAt(j) == '0'){
                    cont0++;
                }
                else{
                    cont1++;
                }
            }
            if(cont0==cont1){
                result = "straight";
            }
            else if (cont0>cont1){
               result = "left";
            }
            else{
                result = "right";
            }
            System.out.println(result);
        }
               
    }
        
}
    

