package com.yuzheng14.Tools;
import org.junit.Test;
import static com.yuzheng14.Tools.Korean.*;
public class KoreanTest {

    @Test
    public void hangulToJamoTest(){
        System.out.println(Korean.hangulToJamo("계약금 천만 원을 입금하래."));
    }

    @Test
    public void jamoToHangulTest(){
        System.out.println(Korean.jamoToHangul("ㄱㅖㅇㅑㄱㄱㅡㅁ ㅊㅓㄴㅁㅏㄴ ㅇㅝㄴㅇㅡㄹ ㅇㅣㅂㄱㅡㅁㅎㅏㄹㅐ."));
    }

    @Test
    public void mathLogTest(){
        System.out.println(Math.log(1000));
        System.out.println(Math.log(10));
        System.out.println(Math.log(1000)/Math.log(10));
        System.out.println((int)(Math.log(1000)/Math.log(10)));
    }

    @Test
    public void numberToHangulTest(){
        println(numberToHangul(1));
        println(numberToHangul(2));
        println(numberToHangul(10));
        println(numberToHangul(11));
        println(numberToHangul(101));
        println(numberToHangul(1234));
        println(numberToHangul(10345));
        println(numberToHangul(123451));
        println(numberToHangul(1234567));
        println(numberToHangul(12345678));
        println(numberToHangul(123456789));
        println(numberToHangul(1234567890));
    }

    public void println(String s){
        System.out.println(s);
    }
}