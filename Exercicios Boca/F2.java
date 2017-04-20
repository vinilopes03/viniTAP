
import java.util.Scanner;

/**
 *
 * @author vinilopes03
 */
public class F2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size;
        int []entradas;
        int []found;
        int contador=0;
        int soma=0;
        
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        entradas = new int[size];
        found = new int[size];
        for(int i =0;i<size;i++){
            entradas[i]= scan.nextInt();
        }
        for(int j =0;j<size;j++){
            if(entradas[j]!=0){
                
                found[contador]=entradas[j];
                contador++;
            }
            else{
                contador--;
                found[contador]=0;
               
            }
        }
        
        for(int i =0;i<contador;i++){
            soma+=found[i];
        }
        System.out.println(soma);
      
            
    }
        
        
}
    
