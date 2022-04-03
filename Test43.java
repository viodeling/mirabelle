public class Test43 {
    public static void main(String[] args) {
        MyTime t=new MyTime(20, 30,35);
        t.addSecond(85);
        t.addMinute(89);
        t.addHour(3);

        t.display();

    }
}

class MyTime{
    private int hour;
    private int minute;
    private int second;

    public MyTime(){

    }
    public MyTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void setHour(int hour){
        if(hour<0 || hour>24){
            System.out.println("Your hour is invalid");
        }else if(hour==24){
            hour=0;
        }else{
            this.hour=hour;
        }
    }
    public int getHour(){
        return hour;
    }
    public void setMinute(int minute){
        if(minute<0 || minute>60){
            System.out.println("Your minute is invalid");
            return;
        }
        this.minute=minute;
    }
    public int getMinute(){
        return minute;
    }
    public void setSecond(int second){
        if(second<0 || second>60){
            System.out.println("Your second is invalid");
            return;
        }
        this.second=second;
    }
    public int getSecond(){
        return second;
    }
    public void display(){
        System.out.println(hour+":"+minute+":"+second);
    }
    /*public void addSecond(int sec){
        if(sec<0 || sec>60){
            System.out.println("Your second is invalid");
            return;
        }
        int ret=second + sec;
        if(ret>=60){
            second=ret-60;
            minute+=1;
        }else{
            second+=sec;
        }
    }*/
    public void addSecond(int sec){
        if(sec<0){
            System.out.println("Your second is invalid");
            return;
        }
        int oldSec=this.getSecond();
        int newSec=oldSec+sec;
        if(newSec<60){
            this.setSecond(newSec);
        }else{
            this.setSecond(newSec%60);
            this.setMinute(this.getMinute()+newSec/60);
        }
    }
    public void addMinute(int min){
        if(min<0){
            System.out.println("Your minute is invalid");
            return;
        }
        int newMin=this.minute+min;
        if(newMin<60){
            this.setMinute(newMin);
        }else{
            this.setMinute(newMin%60);
            this.setHour(this.hour+(newMin/60));
        }
    }
    public void addHour(int hou){
        if(hou<0){
            System.out.println("Your hour is n=invalid");
            return;
        }
        int newHou=this.hour+hou;
        if(newHou<24){
            this.setHour(newHou);
        }else{
            this.setHour(newHou%24);
        }
    }


    public void subHour(int hou){
        this.hour-=hou;
    }
    public void subMinute(int min){
        this.minute-=min;
    }
    public void subSecond(int sec){
        this.second-=sec;
    }
}