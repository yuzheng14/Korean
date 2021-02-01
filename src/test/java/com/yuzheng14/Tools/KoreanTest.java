package com.yuzheng14.Tools;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static com.yuzheng14.Tools.Korean.*;
public class KoreanTest {

    @Test
    public void hangulToJamoTest(){
        System.out.println(Korean.hangulToJamo("계약금 천만 원을 입금하래."));
    }

    @Test
    public void jamoToHangulTest(){
        Assert.assertEquals("계약금 천만 원을 입금하래.",Korean.jamoToHangul("ㄱㅖㅇㅑㄱㄱㅡㅁ ㅊㅓㄴㅁㅏㄴ ㅇㅝㄴㅇㅡㄹ ㅇㅣㅂㄱㅡㅁㅎㅏㄹㅐ."));
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

    @Test
    public void toAspiratedTest(){
        Assert.assertEquals('ㅍ',toAspirated('ㅂ'));
        Assert.assertEquals('ㅊ',toAspirated('ㅈ'));
        Assert.assertEquals('ㅌ',toAspirated('ㄷ'));
        Assert.assertEquals('ㅋ',toAspirated('ㄱ'));
        Assert.assertEquals('ㅅ',toAspirated('ㅅ'));
        Assert.assertEquals('ㅁ',toAspirated('ㅁ'));
        Assert.assertEquals('ㄴ',toAspirated('ㄴ'));
        Assert.assertEquals('ㅇ',toAspirated('ㅇ'));
        Assert.assertEquals('ㄹ',toAspirated('ㄹ'));
        Assert.assertEquals('ㅎ',toAspirated('ㅎ'));
        Assert.assertEquals('ㅋ',toAspirated('ㅋ'));
        Assert.assertEquals('ㅌ',toAspirated('ㅌ'));
        Assert.assertEquals('ㅊ',toAspirated('ㅊ'));
    }

    @Test
    public void toNasalTest(){
        Assert.assertEquals('ㅇ',toNasal('ㄱ'));
        Assert.assertEquals('ㄴ',toNasal('ㄷ'));
        Assert.assertEquals('ㅁ',toNasal('ㅂ'));
        Assert.assertEquals('ㅇ',toNasal('ㅇ'));
        Assert.assertEquals('ㄴ',toNasal('ㄴ'));
    }

    @Test
    public void toFortisTest(){
        Assert.assertEquals('ㄲ',toFortis('ㄱ'));
        Assert.assertEquals('ㅃ',toFortis('ㅂ'));
        Assert.assertEquals('ㅆ',toFortis('ㅅ'));
        Assert.assertEquals('ㅇ',toFortis('ㅇ'));
        Assert.assertEquals('ㄴ',toFortis('ㄴ'));
    }

    @Test
    public void finalConsonantToDelegateConsonantTest(){
        Assert.assertEquals('ㄷ',finalConsonantToDelegateConsonant('ㅊ'));
        Assert.assertEquals('ㄱ',finalConsonantToDelegateConsonant('ㄺ'));
        Assert.assertEquals('ㅁ',finalConsonantToDelegateConsonant('ㄻ'));
        Assert.assertEquals('ㅁ',finalConsonantToDelegateConsonant('ㅁ'));
    }
    @Test
    public void isDoubleFinalConsonantTest(){
        Assert.assertTrue(isDoubleFinalConsonant('ㄻ'));
        Assert.assertTrue(isDoubleFinalConsonant('ㄵ'));
        Assert.assertFalse(isDoubleFinalConsonant('ㅁ'));
        Assert.assertFalse(isDoubleFinalConsonant('ㅎ'));
    }

    @Test
    public void splitDobleFinalConsonantTest(){
        Assert.assertEquals("ㄹㅁ",splitDoubleFinalConsonant('ㄻ'));
        Assert.assertEquals("ㄴㅈ",splitDoubleFinalConsonant('ㄵ'));
        Assert.assertEquals("ㅁ",splitDoubleFinalConsonant('ㅁ'));
        Assert.assertEquals("ㅌ",splitDoubleFinalConsonant('ㅌ'));
    }

    @Test
    public void charIsNullTest(){
        HashMap<Character,Character> map=new HashMap<>();
        map.put('c','1');
        char result =map.get('d');
        println(""+result);
    }
    @Test
    public void getMapTest(){
        HashMap<Character,Character> map=new HashMap<>();
        map.put('1','1');
//        char c =map.get('2');
        HashMap<Character,Integer> map1=new HashMap<>();
        map1.put('1',1);
//        int i =map1.get('2');
        HashMap<Character,String > map2=new HashMap<>();
        map2.put('1',"1");
        String s=map2.get('2');
    }

    @Test
    public void numberToHangulTest2(){
        Assert.assertEquals("이",numberToHangul(2));
    }
    @Test
    public void isHangulTest(){
        Assert.assertTrue(isHangul('중'));
    }

    @Test
    public void jamoToHangulTest2(){
        Assert.assertEquals("절대로 고개를 떨구지 말라",jamoToHangul(hangulToJamo("절대로 고개를 떨구지 말라")));
    }
}