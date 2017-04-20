

import java.util.Scanner;

/**
 *
 * @author vinilopes03
 */
public class D1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String entrada;
        String[] subString = null;
        String chares="";
        int contador;
        String fullStr,reverse;
        boolean equal=false;
        Scanner scan = new Scanner(System.in);
        StringBuffer sb;
        
        while (scan.hasNext()){
            entrada = scan.next();
            subString = new String[entrada.length()];
            contador=0;
       
       
            for(int j = 1;j<=entrada.length();j++){
                for(int k = 0;k<entrada.length();k++){
                    equal=false;
                    chares="";
                    for(int l = 0;l<j;l++){
                        if(k+l<entrada.length())chares+=entrada.charAt(k+l);
                    }
                    if(contador==0){
                        subString[contador]=chares;
                        contador++;
                    }
                    else{
                        for(int m = 0; m<contador;m++){
                            if(subString[m].equals(chares)){
                                equal=true;
                                break;
                            }
                            else equal=false;
                        }
                        if(!equal){
                            sb = new StringBuffer(chares);
                            fullStr = sb.toString();
                            reverse = sb.reverse().toString();
                            if(fullStr.equals(reverse)){
                                subString[contador]=chares;
                                contador++;

                            }
                        }
                        
                    }
                }
            }
            
            System.out.printf("%d - ",contador);
            for(int m = 0;m<contador;m++){
                if(m==contador-1){
                 System.out.printf("\"%s\"\n",subString[m]);
                }
                else System.out.printf("\"%s\" ",subString[m]);
            }    
        }
    }
    
}
