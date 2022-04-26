package com.learn;

public interface test {
    void square();

}
class Arithmetic implements test {
    public void square() {
        System.out.println("square of x=x*x ");
    }
}
class ToTestInit{
    public static void main(String[] args)
    {
        Arithmetic a = new Arithmetic();
        a.square();
    }
}