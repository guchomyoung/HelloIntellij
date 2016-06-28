package com.company;

public class Main {

    public static void main(String[] args) {

        // abstract class
        Rectangle r = new Rectangle(); // 서브클래스 객체 생성
        Circle c = new Circle();  // 서브클래스 객체생성
        r.draw();
        c.draw();



        /*
        // interface class

        Television  tv = new Television();
        Refrigerator r = new Refrigerator();

        tv.turnOn();
        r.turnOn();

        tv.turnOff();
        r.turnOff();

	// write your code here
        System.out.println("Hello IntelliJ!!!!");
        
        // write my code here
        System.out.println("Hello World!!");

        System.out.println("Hello! Local repository");
        
        System.out.println("Hello! gitHub.");

        System.out.println("Hello! Local repository2");
        
        System.out.println("Hello! gitHub2.");
        
        // pull test!!
        System.out.println("Hello Pull!!");

        */
        
    }
}


abstract class Shape { //추상클래스 (슈퍼클래스
    private int x, y;
    public void move (int x, int y) {
        this.x=x;
        this.y=y;
    }
    public abstract void draw(); // 추상 메소드

 }

class Rectangle extends Shape { //서브클레스
    int width, height;
    public void draw() { //메소드 재정의
        System.out.println("사각형 그리기 메소드");
    }
}

class Circle extends Shape { // 서브클래스
    int radius;
    public void draw() { // 메소드 재정의
        System.out.println("원그리기 메소드");
    }
 }

// Interace Example

interface   RemoteControl {
    void turnOff(); //define method
    void turnOn();
}

class Television implements RemoteControl {
    public void turnOff() { System.out.println("TV를 끔니다");}
    public void turnOn() { System.out.println("TV를 켭니다");}
}

class Refrigerator implements RemoteControl {
    public void turnOff() { System.out.println("냉장고를 끔니다.");}
    public void turnOn() { System.out.println("냉장고를 켭니다");}
}