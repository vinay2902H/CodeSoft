#include<stdio.h>
int main()
{
    int i,n,sum=0,j;
    printf("Enter num : ");
    scanf("%d",&n);
    for ( i = 1; i <=n; i++)
    {
        for ( j= 1; j<i; j++)
        {   
            if (n%j==0)
            {
                sum=sum+j;
            }
        }
        if (n==sum)
        {
            printf("%d",n);
        }
    }
        
}                                                     