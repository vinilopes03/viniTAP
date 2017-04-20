#include <stdio.h>


int main(){
	
	char saida;
	int quant,i,j, aux,contador =0;
	
	scanf("%d",&quant);
	int entradaInt[quant]; char entradaChar[quant];
	
	for(i=0;i<quant;i++)
	{
		scanf("%d", &entradaInt[i]);
		if(entradaInt[i]>250 || entradaInt[i]<0){
			return 0;
		}
		scanf(" %c", &entradaChar[i]);
	}
	
	for (i=0;i<quant;i++){
		
		saida= entradaChar[i];
		
		for (j=1;j<=entradaInt[i];j++){
			
			while(contador!=j){
				printf("%c",saida);
				contador++;
			}
			if(saida=='Z'){
				aux = 65;
				saida = aux;
			}
			else {
				aux = saida;
				aux+=1;
				saida=aux;
			}
			contador=0;	
			printf("\n");	
		
		}
		if(i<(quant-1)) printf("\n");
	}
	
		
	
	return 0;
}
