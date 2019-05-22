import java.io.*;
import java.util.*;
class repeatstwi{
public static void main(String args[]){
String s1;
int i,j,temp=0;
Scanner s =new Scanner(System.in);
s1=s.nextLine();
String[]s2=s1.split(" ");
for(i=0;i<s2.length;i++){
int count=0;
for(j=0;j<s2.length;j++){
if(s2[i].equals(s2[j])){
count++;
temp=j;
}}
if(count==2){
System.out.println(s2[i]);
}
else
{
s2[temp]="";
}
s2[i]="";

}
}
}

