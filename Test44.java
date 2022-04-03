public class Test44 {
    public static void main(String[] args) {
        Number n=new Number(50, 0);
        n.division();
    }
}

class Number{
    private int n1;
    private int n2;

    public Number(){
        this(10, 5);
    }
    public Number(int n1, int n2){
        this.n1=n1;
        this.n2=n2;
    }
    public void setN1(int n1){
        this.n1=n1;
    }
    public int getN1(){
        return n1;
    }
    public void setN2(int n2){
        this.n2=n2;
    }
    public int getN2(){
        return n2;
    }
    public void addition(){
        System.out.println(this.n1+"+"+this.n2+"="+(n1+n2));
    }
    public void subtraction(){
        System.out.println(this.n1+"-"+this.n2+"="+(n1-n2));
    }
    public void multiplication(){
        System.out.println(this.n1+"*"+this.n2+"="+(n1*n2));
    }
    public void division(){
        if(n2==0){
            System.out.println("Diviseur can not be 0");
        }else{
            System.out.println(this.n1+"/"+this.n2+"="+n1/n2);
        }
    }
}
