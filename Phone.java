//��1������һ���ֻ��࣬�����������ԣ������͹��췽����
//��2����������࣬���ж������ֻ�����󣬲����ò�ͬ�ĳ�ʼֵ��
//��3�������ֻ������ط��������Ը���Ĺ��ܡ�

import java.util.Date;


//f:��ը
//a:���������������ȣ�
public class Phone {
    int volume = 1;
    int power = 1;
    int light = 1;
    boolean on = false; //false:�ػ���true:����
    boolean bell = true; //true:���壻false:��
    String note = "";

    public Phone(){

    }

    //�����ػ�
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

    //��������
    public void setMyBell(boolean x){
        bell = x;
    }

    public boolean getMyBell(){
        return bell;
    }

    //��������
    public void ringCall(){
        System.out.println("��������Ϣ����");
        if(bell){
            System.out.println("�εεεεεεεεεεεεε�~~~~~~~~~~~~~~~~~~~~~~~~");
        }else{
            System.out.println("���������������������������̡�����������������������������������������������");
        }
    }

    //�ʺ�
    public void sayHello(){
        Date date = new Date();
        System.out.println("Hello! Now it's"+date+"!");
        System.out.println("Nice to meet you!");
    }

    //���ñ���
    public void setNote(String newNote){
        note = newNote;
    }
    //��ȡ����
    public String getNote(){
        return note;
    }
}
