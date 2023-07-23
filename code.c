/*
i/p : Session
o/p : 5

i/p : Find
o/p : 4
*/




#include <stdio.h>
#include<string.h>
int main()
{
    char str[30];
    int len, count=0;
    scanf("%s",str);
    len=strlen(str);
     for (int i=0; i<len; i++) {
        str[i]=tolower(str[i]);
    }
    for(int i=0;i<len;i++){
        if(str[i]!=' '){
            count++;
        for(int j=i+1; j<len;j++){
            
           
            if(str[i]==str[j]){
                str[j]=' ';
            }
            }
        }
    }
    printf("%d",count);
    return 0;
}
