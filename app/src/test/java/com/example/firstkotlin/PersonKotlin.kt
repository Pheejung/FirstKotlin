package com.example.myapplication

class PersonKotlin (val name:String){
    var age:Int = 0;
    var nickname:String="" //프로퍼터(속성 -> 필드 + 게세터) 필드(변수)/메소드
        set(value) {
            field = value.toLowerCase()
        }
    /* val name:String
    constructor(name:String) {
        this.name = name;
    } */

    val property1 = 0;
    val property2 = 1;
}

open class A() {
    // 인터페이스 위임
    // 상속 -> 인터페이스 -> (클래스 위임)
} // 부모 클래스

class B():A() {

}