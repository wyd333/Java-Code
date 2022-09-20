import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Televison tv = new Televison();     //创建一个TV对象
//        tv.turnOn();    //打开电视机
//        System.out.println("请输入音量：");
//        tv.setVolume(input.nextInt());     //调节电视机音量
//        System.out.println("请输入频道：");
//        tv.setChannel(input.nextInt());    //换台
//
//        System.out.println("电视机此时的音量和频道为：" + tv.getVolume() + "和" + tv.getChannel());
//        tv.channelUp();             //频道加1
//        tv.volumeDown();           //音量减1
//        System.out.println("调节后的音量和频道为：" + tv.getVolume() + "和" + tv.getChannel());
//        tv.turnOff();   //关闭电视机

//        Scanner input = new Scanner(System.in);
//        Fraction frac1 = new Fraction();
//        Fraction frac2 = new Fraction();
//
//        System.out.println("请输入第一个数的分子：");
//        frac1.setNum(input.nextInt());
//        System.out.println("请输入第一个数的分母：");
//        frac1.setDen(input.nextInt());
//
//        frac1.setFrac(frac1.getNum(), frac1.getDen());
//        System.out.println("第一个分数是："+frac1.getFrac());
//
//        System.out.println("请输入第二个数的分子：");
//        frac2.setNum(input.nextInt());
//        System.out.println("请输入第二个数的分母：");
//        frac2.setDen(input.nextInt());
//        frac2.setFrac(frac2.getNum(), frac2.getDen());
//        System.out.println("第二个分数是："+frac2.getFrac());
//
//        System.out.println("加法："+Calculator.add(frac1.getFrac(),frac2.getFrac()));
//        System.out.println("减法："+Calculator.sub(frac1.getFrac(),frac2.getFrac()));
//        System.out.println("乘法："+Calculator.mul(frac1.getFrac(),frac2.getFrac()));
//        System.out.println("除法："+Calculator.div(frac1.getFrac(),frac2.getFrac()));

        Scanner input = new Scanner(System.in);
        Phone phone = new Phone();

        phone.turnOn();
        System.out.println("手机已开机！");
        phone.sayHello();

        System.out.print("请设置手机新消息提醒方式：");
        phone.setMyBell(input.nextBoolean());
        String ret;
        if(phone.getMyBell()){
            ret = "响铃";
        }else{
            ret = "震动";
        }
        System.out.println("成功设置消息提醒方式为"+ret);

        phone.ringCall();

        System.out.println("设置备忘录！！");
        phone.setNote(input.nextLine());
        System.out.println("设置成功！"+phone.getNote());
    }
}
