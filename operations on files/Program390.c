#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

int main()
{
    char Fname[20];
    int fd = 0 , Length = 0;
    char Data[100];

    printf("Enter the file name that you want to open : \n");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR);
    if(fd == -1)
    {
        return -1;
    }

    // read(kuthun,kashat,kiti);
    Length = read(fd,Data,13);

    printf("Data from file is \n");
    write(1,Data,Length);

    close(fd);
    
    return 0;
}

// 0    Standard Input device       Keyboard
// 1    Standard output device      Console
// 2    Standard error device       Console