//����һ�����ӻ��࣬ʵ�ֵ��ӻ��Ļ������ܣ���̨���������������أ����������书�ܡ�

import java.util.Scanner;

public class Televison {
    int channel = 1;    //Ƶ��
    int volume = 1;     //����
    boolean on_switch = false;  //����Ϊ��
    public Televison(){

    }   //���췽��

    public void turnOn(){
        on_switch = true;
    }   //�򿪵��ӻ�����

    public void turnOff(){
        on_switch = false;
    }   //�رյ��ӻ�����

    public void setChannel(int newChannel) {
        if(newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
    }   //��̨

    public void channelUp() {
        if(channel < 120){
            channel++;
        }
    }   //���ϻ�Ƶ��

    public void channelDown() {
        if(channel > 0){
            channel--;
        }
    }   //���»�Ƶ��

    public int getChannel() {
        return channel;
    }   //����Ƶ��ֵ

    public void setVolume(int newVolume) {
        if(newVolume >= 1 && newVolume <= 100)
            volume = newVolume;
    }   //��������

    public void volumeUp() {
        if(channel < 7)
            volume++;    //����������1
    }
    public void volumeDown() {
        if(channel > 0)
            volume--;    //��������С1
    }

    public int getVolume() {
        return volume;
    }   //��������ֵ
}

