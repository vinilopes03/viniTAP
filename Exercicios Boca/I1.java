

import java.util.Scanner;

/**
 *
 * @author alunoinf
 */
public class I1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int quant, size,aux=0;
        boolean grace = true,beauty= true;
        String[][] matrizIni;
        String [] result;
        int [] [] matrizFim;
        Scanner scan = new Scanner(System.in);
        
        quant = scan.nextInt();
        result = new String [quant];
        
        for(int i = 0;i<quant;i++){
            
            size = scan.nextInt();
            matrizIni = new String[size][size];
            matrizFim = new int[size][size];
            
            for(int j = 0;j<size;j++){
                matrizIni[j][j]= scan.next();
                for(int k = 0;k<matrizIni[j][j].length();k++){
                    matrizFim[j][k]= Character.getNumericValue(matrizIni[j][j].charAt(k));
                }
            }
              
                for(int k = 0;k<size;k++){
                    aux= size-1;
                    for(int l = 0;l<size;l++){
                        if(l>=aux){
                            break;
                        }
                        else if(matrizFim[k][l]==matrizFim[k][aux]){
                            //still true
                        }
                        else{
                            grace = false;
                            break;
                        }
                        aux--;
                    }
                }
                
                for(int m = 0;m<size;m++){
                    aux= size-1;
                    for(int n = 0 ;n<size;n++){
                        if(n>=aux){
                            break;
                        }
                        else if(matrizFim[n][m]==matrizFim[aux][m]){
                            //still true
                        }
                        else{
                            beauty = false;
                            break;
                        }
                        aux--;
                    }     
                }
                 
            if(beauty && grace) result[i]= "Magnificent";
            else if (beauty) result[i] = "Beautiful";
            else if (grace) result[i] = "Graceful";
            else result[i] = "Useless";
            
            beauty= true;
            grace=true;
            
        }
        for(int i = 0;i<quant;i++){
            System.out.println(result[i]);
        }
    }
    
}
