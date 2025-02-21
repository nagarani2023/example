class Main
{
public static void main(String args[])
{
 Demo d=new Demo();
 for(;num!=0;num=num/10)
 System.out.println(d.Armstrong(num,0));


}
}
  


class Demo
{
String Armstrong(int num,int count)
{
sum=0;power=1;temp=num;
{
int rem=num%10;
count++;
} 
System.out.println("count"  +count);
num=temp;
{
power=(int)Math.power(rem,count);
sum=sum+power;
}
 System.out.println("sum is" +sum);
if(temp==sum)
return "Armstrong";
else 
return "not a Armstrong";
}
}


  

