#include <stdio.h>

int main()
{

    int var,i,k,l;
    scanf("%d", &var);
    int j[var];
    
    for(i= 0;i<var;i++)
    {
		scanf("%d",&j[i]);
	}
	
	for(i=0; i<var; i++)
	{	
		if(i>0)
		printf("\n");
		
		for(k=0;k<j[i];k++){
			for(l =0;l<j[i];l++){
				if((j[i]%2!=0) && (k>0 && k<(j[i]-1)) && (l>0 && l<(j[i]-1))){
					printf("J");
				}
				else if((j[i]%2==0) && (k>0 && (k<(j[i])-1)) && (l>0 && (l<(j[i]-1)))){
					printf("J");
				}
				else{
					printf("#");
				}
				
			}
			printf("\n");
		}
		
		
		
	}
	
	return 0;
		
			

		

}
