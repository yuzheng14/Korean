package com.yuzheng14.Tools;

import org.junit.Test;

public class KoreanTest {

    @Test
    public void hangulToJamoTest(){
        System.out.println(Korean.hangulToJamo("계약금 천만 원을 입금하래."));
    }

    @Test
    public void jamoToHangulTest(){
        System.out.println(Korean.jamoToHangul("ㄱㅖㅇㅑㄱㄱㅡㅁ ㅊㅓㄴㅁㅏㄴ ㅇㅝㄴㅇㅡㄹ ㅇㅣㅂㄱㅡㅁㅎㅏㄹㅐ."));
    }
}