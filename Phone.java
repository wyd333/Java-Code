//（1）定义一个手机类，定义若干属性，方法和构造方法；
//（2）定义测试类，其中定义多个手机类对象，并设置不同的初始值；
//（3）调用手机类的相关方法，测试该类的功能。

import java.util.Date;


//f:爆炸
//a:电量，音量，亮度，
public class Phone {
    int volume = 1;
    int power = 1;
    int light = 1;
    boolean on = false; //false:关机；true:开机
    boolean bell = true; //true:响铃；false:震动
    String note = "";

    public Phone(){

    }

    //开机关机
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }

    public void setVolume(int newVolume){
        volume = newVolume;
    }

    public void setLight(int newLight){
        light = newLight;
    }

    public void setPower(int newPower){
        power = newPower;
    }

    public int getVolume(){
        return volume;
    }

    public int getPower(){
        return power;
    }

    public int getLight(){
        return light;
    }

    //铃声设置
    public void setMyBell(boolean x){
        bell = x;
    }

    public boolean getMyBell(){
        return bell;
    }

    //来电提醒
    public void ringCall(){
        System.out.println("您有新消息！！");
        if(bell){
            System.out.println("滴滴滴滴滴滴滴滴滴滴滴滴滴滴~~~~~~~~~~~~~~~~~~~~~~~~");
        }else{
            System.out.println("滋滋滋滋滋滋滋滋滋滋滋滋滋滋————————————————————————");
        }
    }

    //问好
    public void sayHello(){
        Date date = new Date();
        System.out.println("Hello! Now it's"+date+"!");
        System.out.println("Nice to meet you!");
    }

    //设置备忘
    public void setNote(String newNote){
        note = newNote;
    }
    //获取备忘
    public String getNote(){
        return note;
    }
}
