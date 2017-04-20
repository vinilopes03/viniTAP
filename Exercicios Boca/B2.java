

import java.util.Scanner;

/**
 *
 * @author vinilopes03
 */
public class B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String enter,result;
        int mood=0;
        boolean encontrado=false;
        Scanner scan = new Scanner(System.in);
        
        enter = scan.nextLine();
        
        for(int i = 0; i<enter.length();i++){

            if(enter.charAt(i)==':'){
                if(enter.charAt(i+1)=='-'){
                    if(enter.charAt(i+2)==')'){
                        encontrado=true;
                        mood++;
                    }
                    else if(enter.charAt(i+2)=='('){
                        encontrado=true;
                        mood--;
                    }
                }
            }
            else{
                
                //
            }
        }
        if(encontrado && mood>0) result = "happy";
        else if(encontrado && mood==0) result = "unsure";
        else if (encontrado && mood<0) result = "sad";
        else result = "none";
        
        System.out.println(result);
    }
    
}
