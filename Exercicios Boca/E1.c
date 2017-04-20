#include <stdio.h>
#include <stdlib.h>


int max(int a, int b){ return (a > b) ? (a) : (b); }
int min(int a, int b){ return (b < a) ? (b) : (a); }

int main(){
	
	
	int quant,i,j,k;
	scanf("%d",&quant);
	
	int n,m,c;
	int silence,maior,menor,aux;
	int compare[20];
	
	for(i=0;i<quant;i++){
		silence=0;
		scanf("%d %d %d",&n,&m,&c);
		for(k=0;k<n;k++){
			scanf("%d",&compare[k]);
		}
		if(m>n){
			silence=0;
		}
		else{
			for(j=0;j<=n-m;j++){
				maior=-1e9;
				menor=1e9;
				for(k=0;k<m && k+j<n;k++){
					aux = k+j;
					maior = max(maior, compare[aux]);
					menor = min(menor, compare[aux]);
				}	
				if(maior-menor<=c){
					silence++;
				}		
			}
		}
	  printf("%d\n",silence);
	}

	return 0;
}
			
