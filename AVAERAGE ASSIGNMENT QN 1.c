#include<stdio.h>
double physics[4];
double chemistry[4];
double mathematics[4];
double result;
double average(double x[4]) {
    result=((x[0]+x[1]+x[2]+x[3])/4);
   return printf("AVERAGE =%.2lf\n",result);
}
int main(){
    printf("ENTER PHYSICS MARKS(ASSIGNMENT)\n");
    scanf("%lf", &physics[0]);
    printf("ENTER PHYSICS MARKS(COURSE WORK)\n");
    scanf("%lf", &physics[1]);
    printf("ENTER PHYSICS MARKS(MID TERM)\n");
    scanf("%lf", &physics[2]);
    printf("ENTER PHYSICS MARKS(EOT)\n");
    scanf("%lf", &physics[3]);

    printf("--------------------------------------\n");
    printf("ENTER CHEMISTRY MARKS(ASSIGNMENT)\n");
    scanf("%lf", &chemistry[0]);
    printf("ENTER CHEMISTRY MARKS(COURSE WORK)\n");
    scanf("%lf", &chemistry[1]);
    printf("ENTER CHEMISTRY MARKS(MID TERM)\n");
    scanf("%lf", &chemistry[2]);
    printf("ENTER CHEMISTRY MARKS(EOT)\n");
    scanf("%lf", &chemistry[3]);

    printf("--------------------------------------\n");
    printf("ENTER MATHEMATICS MARKS(ASSIGNMENT)\n");
    scanf("%lf", &mathematics[0]);
    printf("ENTER MATHEMATICS MARKS(COURSE WORK)\n");
    scanf("%lf", &mathematics[1]);
    printf("ENTER MATHEMATICS MARKS(MID TERM)\n");
    scanf("%lf", &mathematics[2]);
    printf("ENTER MATHEMATICS MARKS(EOT)\n");
    scanf("%lf", &mathematics[3]);

 printf("--------------------------------------\n");
 printf("BELOW IS THE AVERAGE MARK OBTAINED IN EACH SUBJECT\n");
 printf("\n---PHYSICS---\n");
 average(physics);
 printf("\n---CHEMISTRY---\n");
 average(chemistry);
 printf("\n---MATHEMATICS---\n");
 average(mathematics); 

 return 0;
}