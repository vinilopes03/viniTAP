

import java.util.Scanner;

/**
 *
 * @author vinilopes03
 */
public class F1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quant,proxMaior=0,aux=0,aux2=0,menor = 1000;
        String permute,subPermute;
        StringBuffer sb;
        //char comparador;
        
        Scanner scan = new Scanner(System.in);
       
        quant = scan.nextInt();
        
        for(int i = 0; i<quant;i++){
            permute = scan.next();
            sb = new StringBuffer(permute);
            
            for(int j = (permute.length()-1);j>0;j--){
                if(permute.charAt(j-1)<permute.charAt(j)){
                   aux=j-1;
                   aux2=j;
                   break;
                }
                if(j==1){
                    permute = "USELESS";
                }
            }
            if(!permute.equals("USELESS")){              
                for(int k = aux2; k < permute.length();k++){
                    if(permute.charAt(aux)<permute.charAt(k)){
                        if(k==aux2){
                            proxMaior=k;
                        }
                        else if(permute.charAt(k)<permute.charAt(proxMaior)){
                            proxMaior=k;
                        }
                    }
                }

                sb.setCharAt(aux, permute.charAt(proxMaior));
                sb.setCharAt(proxMaior, permute.charAt(aux));

                if(permute.charAt(aux2)>permute.charAt(permute.length()-1)){
                    sb.setCharAt(aux2, permute.charAt(permute.length()-1));
                    sb.setCharAt(permute.length()-1, permute.charAt(aux2));
                }
                permute = sb.toString();
            }
            
            System.out.println(permute);
            
            
          

        }
    }
    
}
