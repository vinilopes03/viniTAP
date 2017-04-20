

import java.util.Scanner;

/**
 *
 * @author alunoinf
 */
public class N1 {

    
   
    public static void main(String[] args) {
        
        int quant;
        int linhaTo,colunaTo;
        int[][] matriz;
        int[][] subMatriz;
        
        Scanner scan = new Scanner(System.in);
        
        quant = scan.nextInt();
        
        for(int i=0;i<quant;i++){
            
            matriz = new int[linhaTo = scan.nextInt()][colunaTo = scan.nextInt()];
            subMatriz = new int[linhaTo][colunaTo];
            
            for(int j=0;j<linhaTo;j++){
                for(int k=0;k<colunaTo;k++){
                    matriz[j][k]= scan.nextInt();
                }
            }
            
            for(int j=0;j<colunaTo;j++){
                if(j==0) subMatriz[0][j]=matriz[0][j];
                else{
                    subMatriz[0][j]= subMatriz[0][j-1] + matriz[0][j];
                }
          
            }
            
            for(int j=0;j<linhaTo;j++){
                if(j==0) subMatriz[j][0]=matriz[j][0];
                else{
                    subMatriz[j][0]= subMatriz[j-1][0] + matriz[j][0];
                }
                
            }
            
            for(int j=1;j<linhaTo;j++){
                for(int k=1;k<colunaTo;k++){
                    if(subMatriz[j-1][k]>subMatriz[j][k-1]){
                        subMatriz[j][k] = matriz[j][k]+subMatriz[j-1][k];
                    }
                    else if(subMatriz[j][k-1]>subMatriz[j-1][k]){
                        subMatriz[j][k] = matriz[j][k]+subMatriz[j][k-1];
                    }
                    else{
                        subMatriz[j][k] = subMatriz[j][k-1]+matriz[j][k];
                    }
                   
                }
                
            }
            
           System.out.println(subMatriz[linhaTo-1][colunaTo-1]); 
        }
        
        
      
      
        
    }
    
}
