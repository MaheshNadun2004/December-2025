#include<stdio.h>
int sumDigits(){
	int a = 123 , sum = 0;
	while(a > 0){
		int b = a%10;
		sum += b;
		a = a / 10
	}
return sum;
}
int main(){
	printf("Sum of Number is %d " , sumDigits())
	return 0;
}











