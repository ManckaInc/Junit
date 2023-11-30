package pl.jUnit.test;

public class MyMath {
    public static double divide(int numberOne, int numberTwo){
        if(numberTwo == 0)
            throw new ArithmeticException("Can't divide by zero!");

        return numberOne/numberTwo;
    }
}
