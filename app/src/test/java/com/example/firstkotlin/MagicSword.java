package com.example.firstkotlin;

// GoF 디자인 패턴 (자바, 파이썬, C#)
// 위임 (MVC 패턴)

public class MagicSword implements ISword {
    ISword iSword;

    public MagicSword(ISword iSword) {
        this.iSword = iSword;
    }

    public void playSound() {
        System.out.println("사운드 출력~");
    }

    @Override
    public void eqiup() {
        playSound(); // 추가된 기능
        iSword.eqiup(); //Sword 클래스 메소드 호출
    }
    // Decorator 패턴
}
