//��1�����һ�������࣬�����ķ��Ӻͷ�ĸ��������������ʾ�����ж��巽���Է������мӡ������ˡ������㣻
//��2���ڲ������ж��������������㲢�����������

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
    //�Ӽ��˳�
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
