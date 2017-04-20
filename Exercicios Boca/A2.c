#include <stdio.h>
#include <string.h>
int main(){
	
	int mounth,day;
	char result[7];
	scanf("%d",&mounth);
	scanf("%d",&day);
	
	if(mounth<2){
		strcpy(result,"Before");
	}
	else if (mounth>2){
		strcpy(result,"After");
	}
	else{
		if(day>18){
			strcpy(result,"After");
		}
		else if(day<18){
			strcpy(result,"Before");
		}
		else strcpy(result,"Special");
		
	}

	printf("%s\n",result);
	
	return 0;
}
