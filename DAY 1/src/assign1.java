import java.util.*;
class Average{
public static void main(String[] args){
System.out.println("enter the size of array ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double[] arr = new double[n];
double sum =0;
for(int i=0;i<n;i++){
    arr[i]=sc.nextDouble();
    sum=sum+arr[i];
}
double average=sum/n;
System.out.println(average);
}
}