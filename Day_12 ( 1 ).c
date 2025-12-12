#include<stdio.h>
void swap(int a, int b){
	int temp;
	temp = a;
	a = b;
	b = temp;
	printf("a value is %d, b value is %d \n" , a , b);
}
int main(){
	int a = 5 , b = 7;
	swap(a , b );
	return 0;
}











