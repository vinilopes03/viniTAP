
import java.util.Scanner;

/**
 *
 * @author vinilopes03
 */
public class C2 {

    private final int A = 97;
    private final int E = 101;
    private final int I = 105;
    private final int O = 111;
    private final int U = 117;
    
    int closeVogal(int search){
	
	int foundOne = 0,foundTwo = 0;
        for (int i=search; i<=122; i++) {
                if(i== A){
                    foundOne=i;
                    break;
                }
		else if(i== E){
                    foundOne=i;
                    break;
                }
		else if(i ==I){
                    foundOne=i;
                    break;
                }
		else if(i==O){
                    foundOne=i;
                    break;
                }
		else if(i == U){
                    foundOne=i;
                    break;
                }
                else foundOne=1000;
            
        }
        for(int i = search;i>=97;i--){
		if(i== A){
                    foundTwo=i;
                    break;
                }
		else if(i== E){
                    foundTwo=i;
                    break;
                }
		else if(i ==I){
                    foundTwo=i;
                    break;
                }
		else if(i==O){
                    foundTwo=i;
                    break;
                }
		else if(i == U){
                    foundTwo=i;
                    break;
                }
                else foundTwo = 1000;

	}

	if(((search-foundOne)*(-1))<(search-foundTwo)){
		return foundOne;
	}
	else if (search-foundTwo<((search-foundOne)*(-1))){
		return foundTwo;
	}
        else return foundTwo;
    }
    
    int nextConsoant(int conso){
        if(conso==122){
            return conso;
        }
        else{
            for (int i = conso;i<=122;i++){
                if (i==conso){
                    //
                }
                else if(i!= A && i!=101 && i != I && i!=O && i != U){
		return i;
                }
            }
        }
        return 0;
    }
    
    boolean isConsant(int conso){
	
	if(conso== A || conso== E|| conso ==I || conso==O || conso == U){
		return false;
	}
	else return true;
    }
    
    public static void main(String[] args) {
        String entrada,saida="";
        Scanner scan = new Scanner(System.in);
        C2 c2 = new C2();
        
        entrada = scan.next();
      
        
        for(int i = 0; i<entrada.length();i++){
            if(c2.isConsant((int)entrada.charAt(i))){
                 saida+=entrada.charAt(i);
                 saida+= (char)c2.closeVogal((int)entrada.charAt(i));
                 saida+= (char)c2.nextConsoant((int)entrada.charAt(i));
            }
            else saida+=entrada.charAt(i);
           
        }
 
        System.out.println(saida);
        
        
    }
    
}
