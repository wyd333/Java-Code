//定义一个电视机类，实现电视机的基本功能（换台，调整音量，开关），并测试其功能。

import java.util.Scanner;

public class Televison {
    int channel = 1;    //频道
    int volume = 1;     //音量
    boolean on_switch = false;  //开关为关
    public Televison(){

    }   //构造方法

    public void turnOn(){
        on_switch = true;
    }   //打开电视机开关

    public void turnOff(){
        on_switch = false;
    }   //关闭电视机开关

    public void setChannel(int newChannel) {
        if(newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
    }   //换台

    public void channelUp() {
        if(channel < 120){
            channel++;
        }
    }   //向上换频道

    public void channelDown() {
        if(channel > 0){
            channel--;
        }
    }   //向下换频道

    public int getChannel() {
        return channel;
    }   //返回频道值

    public void setVolume(int newVolume) {
        if(newVolume >= 1 && newVolume <= 100)
            volume = newVolume;
    }   //调节音量

    public void volumeUp() {
        if(channel < 7)
            volume++;    //给音量增加1
    }
    public void volumeDown() {
        if(channel > 0)
            volume--;    //给音量减小1
    }

    public int getVolume() {
        return volume;
    }   //返回音量值
}

