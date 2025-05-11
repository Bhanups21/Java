class LuckyNumber{
    private int x;
    public LuckyNumber(int x){
        this.x=x;
    }
    public boolean check(){
        int sum1=0,sum2=0;
        int temp=this.x;
        int count=0;
        boolean flag=true;
        while(temp>0){
            count++;
            if(flag){
                sum1+=(temp%10)*(temp%10);
                flag=false;
            }
            else{
                sum2+=(temp%10)*(temp%10);
                flag=true;
            }
            temp/=10;
        }
        if(count%2==0){
            return sum1%9==0;
        }
        else{
            return sum2%9==0;
        }
    }
    public static void main(String args[]){
        LuckyNumber a=new LuckyNumber(1623);
        LuckyNumber b=new LuckyNumber(13111);
        System.out.println("1623 is a lucky number: "+a.check());
        System.out.println("1111 is a lucky number: "+b.check());
    }
}