//（1）设计一个分数类，分数的分子和分母用两个整型数表示，类中定义方法对分数进行加、减、乘、除运算；
//（2）在测试类中定义分数类对象，运算并输出运算结果。

public class Fraction {
    int Num = 1;
    int Den = 1;

    public Fraction(){

    }

    public void setNum(int newNum){
        Num = newNum;
    }
    public int getNum(){
        return Num;
    }

    public void setDen(int newDen){
        if(newDen != 0){
            Den = newDen;
        }
    }
    public int getDen(){
        return Den;
    }

    double frac = 1;
    public void setFrac(int Num, int Den){
        frac = 1.0*Num/Den;
    }

    public double getFrac(){
        return frac;
    }
}

class Calculator{
    //加减乘除
    public static double add(double frac1, double frac2){
        return frac1+frac2;
    }
    public static double sub(double frac1, double frac2){
        return frac1-frac2;
    }
    public static double mul(double frac1, double frac2){
        return frac1*frac2;
    }
    public static double div(double frac1, double frac2){
        return frac1/frac2;
    }
}
