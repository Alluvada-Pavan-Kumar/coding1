public class demo {
    void sumofDigits(int n)
    {
        int sum=0;
        while (n>0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println(sum);

    }
    void reverse(int n)
    {
        int rev=0;
        int temp=n;
        while (temp!=0)
        {
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        demo obj=new demo();
        obj.sumofDigits(101);
    }
}