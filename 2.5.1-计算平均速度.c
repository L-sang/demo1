#include <stdio.h>
int main(int argc, char *argv[])
{
	float s;
	float t;
	float v;
	printf("请输入路程和时间：\n");
	scanf("%f%f",&s,&t);
	v=s/t;
	printf("速度为：%f\n",v); 
}