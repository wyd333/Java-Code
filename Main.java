import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Televison tv = new Televison();     //����һ��TV����
//        tv.turnOn();    //�򿪵��ӻ�
//        System.out.println("������������");
//        tv.setVolume(input.nextInt());     //���ڵ��ӻ�����
//        System.out.println("������Ƶ����");
//        tv.setChannel(input.nextInt());    //��̨
//
//        System.out.println("���ӻ���ʱ��������Ƶ��Ϊ��" + tv.getVolume() + "��" + tv.getChannel());
//        tv.channelUp();             //Ƶ����1
//        tv.volumeDown();           //������1
//        System.out.println("���ں��������Ƶ��Ϊ��" + tv.getVolume() + "��" + tv.getChannel());
//        tv.turnOff();   //�رյ��ӻ�

//        Scanner input = new Scanner(System.in);
//        Fraction frac1 = new Fraction();
//        Fraction frac2 = new Fraction();
//
//        System.out.println("�������һ�����ķ��ӣ�");
//        frac1.setNum(input.nextInt());
//        System.out.println("�������һ�����ķ�ĸ��");
//        frac1.setDen(input.nextInt());
//
//        frac1.setFrac(frac1.getNum(), frac1.getDen());
//        System.out.println("��һ�������ǣ�"+frac1.getFrac());
//
//        System.out.println("������ڶ������ķ��ӣ�");
//        frac2.setNum(input.nextInt());
//        System.out.println("������ڶ������ķ�ĸ��");
//        frac2.setDen(input.nextInt());
//        frac2.setFrac(frac2.getNum(), frac2.getDen());
//        System.out.println("�ڶ��������ǣ�"+frac2.getFrac());
//
//        System.out.println("�ӷ���"+Calculator.add(frac1.getFrac(),frac2.getFrac()));
//        System.out.println("������"+Calculator.sub(frac1.getFrac(),frac2.getFrac()));
//        System.out.println("�˷���"+Calculator.mul(frac1.getFrac(),frac2.getFrac()));
//        System.out.println("������"+Calculator.div(frac1.getFrac(),frac2.getFrac()));

        Scanner input = new Scanner(System.in);
        Phone phone = new Phone();

        phone.turnOn();
        System.out.println("�ֻ��ѿ�����");
        phone.sayHello();

        System.out.print("�������ֻ�����Ϣ���ѷ�ʽ��");
        phone.setMyBell(input.nextBoolean());
        String ret;
        if(phone.getMyBell()){
            ret = "����";
        }else{
            ret = "��";
        }
        System.out.println("�ɹ�������Ϣ���ѷ�ʽΪ"+ret);

        phone.ringCall();

        System.out.println("���ñ���¼����");
        phone.setNote(input.nextLine());
        System.out.println("���óɹ���"+phone.getNote());
    }
}
