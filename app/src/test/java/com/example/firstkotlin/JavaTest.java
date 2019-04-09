package com.example.firstkotlin;

import org.junit.Assert;
import org.junit.Test;

public class JavaTest {
    @Test
    public void testGetterSetter() { /*
        PersonJava personJava = new PersonJava("박희정");
        personJava.setAge(100);
        Assert.assertEquals("박희정", personJava.getName());
        Assert.assertEquals(100, personJava.getAge());

        PersonKotlin personKotlin = new PersonKotlin("박희정");
        personKotlin.setAge(20);
        Assert.assertEquals("박희정", personKotlin.getName());
        Assert.assertEquals(20, personKotlin.getAge()); */
        // 프로퍼티 유ㅏ암 Delegtion MVC 패턴
        // 인터페이스에 프로퍼티 추가

    }

    @Test
    public void testMoveObject() {
        MoveObject moveObject = new MoveObject();
        int result = Calculator.calcAccuracy(moveObject,3);
        Assert.assertEquals(1, moveObject.getSpeed());

        MoveObject cantMoveObject = new CantMoveObject();

        result = Calculator.calcAccuracy(cantMoveObject, 3);
        Assert.assertEquals(1, cantMoveObject.getSpeed());
        // 개발자 입장 -> Calculator.calcAccuracy(mo)
        // 인터페이스를 사용하는 이유
        // 전사, 궁수, 마법사 -> Attack() -> 인터페이스
        // 개발자 (인터페이스 -> Attack()) -> 캡슐화
        // C++ 다중상속
    }

    @Test
    public void testSingleton() {
        // SingletonJava singletonJava = new SingletonJava();
        SingletonJava singletonJava = SingletonJava.getInstance();
        singletonJava.log("Test Singleton");
    }

    @Test
    public void testFruit() {
        /* FruitJava fruitJava = new FruitJava();
        fruitJava.fruitName = "Apple";
        fruitJava.description = "Apple is red";
        System.out.println(fruitJava); */

        FruitJava fruitJava1 = new FruitJava();
        FruitJava fruitJava2 = new FruitJava();

        fruitJava1.fruitName = "Banana";
        fruitJava2.fruitName = "Banana";
        fruitJava1.description = "Banana is long";
        fruitJava2.description = "Banana is long";

        // Assert.assertEquals(fruitJava1, fruitJava2);
        Assert.assertEquals(fruitJava1.hashCode(), fruitJava2.hashCode());
    }
}
