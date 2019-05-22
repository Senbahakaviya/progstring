import java.io.*;
import java.util.*;
class reverse{
public static void main(String args[]){
String s1,s3="",temp="";
int k;
int i,j;
int[] len=new int[10];
Scanner s =new Scanner (System.in);
s1=s.nextLine();
k=s.nextInt();
String []s2=s1.split(" ");
for(i=0;i<s2.length;i++){
System.out.println(s2[i]);
len[k]=s2[k].length();
s3=" ";
for (j=len[k]-1;j>=0;j--){
s3=s3+s2[k].charAt(j);
}
}
//System.out.println(s3);
for(i=0;i<k;i++)
{
System.out.print(s2[i]+" ");
}
System.out.print(s3);
for(i=k+1;i<s2.length;i++)
{
System.out.print(" "+s2[i]);
}
}
}

