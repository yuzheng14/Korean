package com.yuzheng14.Tools;

import java.util.ArrayList;
import java.util.HashMap;

public class Korean {
    private static final char HANGUL_OFFSET = '가';
    private static final char HANGUL_OUTSET = '힣';
    private static final char[] leadSet = new char[]{'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ',
            'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};
    private static final char[] vowelSet = new char[]{'ㅏ', 'ㅐ', 'ㅑ', 'ㅒ', 'ㅓ', 'ㅔ', 'ㅕ', 'ㅖ', 'ㅗ', 'ㅘ', 'ㅙ', 'ㅚ', 'ㅛ',
            'ㅜ', 'ㅝ', 'ㅞ', 'ㅟ', 'ㅠ', 'ㅡ', 'ㅢ', 'ㅣ'};
    private static final char[] tailSet = new char[]{'\0', 'ㄱ', 'ㄲ', 'ㄳ', 'ㄴ', 'ㄵ', 'ㄶ', 'ㄷ', 'ㄹ', 'ㄺ', 'ㄻ', 'ㄼ', 'ㄽ',
            'ㄾ', 'ㄿ', 'ㅀ', 'ㅁ', 'ㅂ', 'ㅄ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};

    private static final HashMap<Character, Integer> leadMap = new HashMap<>();
    private static final HashMap<Character, Integer> vowelMap = new HashMap<>();
    private static final HashMap<Character, Integer> tailMap = new HashMap<>();
    private static final char[] numberal = {'\0', '십', '백', '천', '만', '십', '백', '천', '억', '십', '백', '천', '조', '십', '백', '천'};
    private static final char[] number = {'공', '일', '이', '삼', '사', '오', '육', '칠', '팔', '구'};

    private static final String doubleFinalConsonant="ㄺㄳㄵㄶㄼㄽㄾㅀㄻㄿㅄ";

    private static final HashMap<Character,char[]> consonantMap=new HashMap<>();
    private static final HashMap<Character,Character> delegateConsonantMap=new HashMap<>();
    private static final HashMap<Character,String> doubleFinalConsonantMap=new HashMap<>();

    static {
        leadMap.put('ㄱ', 0);
        leadMap.put('ㄲ', 1);
        leadMap.put('ㄴ', 2);
        leadMap.put('ㄷ', 3);
        leadMap.put('ㄸ', 4);
        leadMap.put('ㄹ', 5);
        leadMap.put('ㅁ', 6);
        leadMap.put('ㅂ', 7);
        leadMap.put('ㅃ', 8);
        leadMap.put('ㅅ', 9);
        leadMap.put('ㅆ', 10);
        leadMap.put('ㅇ', 11);
        leadMap.put('ㅈ', 12);
        leadMap.put('ㅉ', 13);
        leadMap.put('ㅊ', 14);
        leadMap.put('ㅋ', 15);
        leadMap.put('ㅌ', 16);
        leadMap.put('ㅍ', 17);
        leadMap.put('ㅎ', 18);
        vowelMap.put('ㅏ', 0);
        vowelMap.put('ㅐ', 1);
        vowelMap.put('ㅑ', 2);
        vowelMap.put('ㅒ', 3);
        vowelMap.put('ㅓ', 4);
        vowelMap.put('ㅔ', 5);
        vowelMap.put('ㅕ', 6);
        vowelMap.put('ㅖ', 7);
        vowelMap.put('ㅗ', 8);
        vowelMap.put('ㅘ', 9);
        vowelMap.put('ㅙ', 10);
        vowelMap.put('ㅚ', 11);
        vowelMap.put('ㅛ', 12);
        vowelMap.put('ㅜ', 13);
        vowelMap.put('ㅝ', 14);
        vowelMap.put('ㅞ', 15);
        vowelMap.put('ㅟ', 16);
        vowelMap.put('ㅠ', 17);
        vowelMap.put('ㅡ', 18);
        vowelMap.put('ㅢ', 19);
        vowelMap.put('ㅣ', 20);
        tailMap.put('\0', 0);
        tailMap.put('ㄱ', 1);
        tailMap.put('ㄲ', 2);
        tailMap.put('ㄳ', 3);
        tailMap.put('ㄴ', 4);
        tailMap.put('ㄵ', 5);
        tailMap.put('ㄶ', 6);
        tailMap.put('ㄷ', 7);
        tailMap.put('ㄹ', 8);
        tailMap.put('ㄺ', 9);
        tailMap.put('ㄻ', 10);
        tailMap.put('ㄼ', 11);
        tailMap.put('ㄽ', 12);
        tailMap.put('ㄾ', 13);
        tailMap.put('ㄿ', 14);
        tailMap.put('ㅀ', 15);
        tailMap.put('ㅁ', 16);
        tailMap.put('ㅂ', 17);
        tailMap.put('ㅄ', 18);
        tailMap.put('ㅅ', 19);
        tailMap.put('ㅆ', 20);
        tailMap.put('ㅇ', 21);
        tailMap.put('ㅈ', 22);
        tailMap.put('ㅊ', 23);
        tailMap.put('ㅋ', 24);
        tailMap.put('ㅌ', 25);
        tailMap.put('ㅍ', 26);
        tailMap.put('ㅎ', 27);
        consonantMap.put('ㄱ', new char[]{'ㅋ', 'ㄲ', 'ㅇ', '\0'});
        consonantMap.put('ㄷ', new char[]{'ㅌ', 'ㄸ', 'ㄴ', 'ㄹ'});
        consonantMap.put('ㅂ', new char[]{'ㅍ', 'ㅃ', 'ㅁ', '\0'});
        consonantMap.put('ㅅ', new char[]{'1', 'ㅆ', '\0', '\0'});
        consonantMap.put('ㅈ', new char[]{'ㅊ', 'ㅉ', '\0', '\0'});
        consonantMap.put('ㅎ', new char[]{'\0', '\0', '\0', '\0'});
        delegateConsonantMap.put('ㅋ','ㄱ');
        delegateConsonantMap.put('ㄲ','ㄱ');
        delegateConsonantMap.put('ㄱ','ㄱ');
        delegateConsonantMap.put('ㄺ','ㄱ');
        delegateConsonantMap.put('ㄳ','ㄱ');
        delegateConsonantMap.put('ㅌ','ㄷ');
        delegateConsonantMap.put('ㅅ','ㄷ');
        delegateConsonantMap.put('ㅈ','ㄷ');
        delegateConsonantMap.put('ㅆ','ㄷ');
        delegateConsonantMap.put('ㄷ','ㄷ');
        delegateConsonantMap.put('ㅊ','ㄷ');
        delegateConsonantMap.put('ㅍ','ㅂ');
        delegateConsonantMap.put('ㄿ','ㅂ');
        delegateConsonantMap.put('ㅂ','ㅂ');
        delegateConsonantMap.put('ㅄ','ㅂ');
        delegateConsonantMap.put('ㄴ','ㄴ');
        delegateConsonantMap.put('ㄵ','ㄴ');
        delegateConsonantMap.put('ㄶ','ㄴ');
        delegateConsonantMap.put('ㄹ','ㄹ');
        delegateConsonantMap.put('ㄼ','ㄹ');
        delegateConsonantMap.put('ㄽ','ㄹ');
        delegateConsonantMap.put('ㄾ','ㄹ');
        delegateConsonantMap.put('ㅀ','ㄹ');
        delegateConsonantMap.put('ㅁ','ㅁ');
        delegateConsonantMap.put('ㄻ','ㅁ');
        delegateConsonantMap.put('ㅇ','ㅇ');
        delegateConsonantMap.put('ㅎ','\0');
        doubleFinalConsonantMap.put('ㄺ', "ㄹㄱ");
        doubleFinalConsonantMap.put('ㄳ', "ㄱㅅ");
        doubleFinalConsonantMap.put('ㄵ', "ㄴㅈ");
        doubleFinalConsonantMap.put('ㄶ', "ㄴㅎ");
        doubleFinalConsonantMap.put('ㄼ', "ㄹㅂ");
        doubleFinalConsonantMap.put('ㄽ', "ㄹㅅ");
        doubleFinalConsonantMap.put('ㄾ', "ㄹㅌ");
        doubleFinalConsonantMap.put('ㅀ', "ㄹㅎ");
        doubleFinalConsonantMap.put('ㄻ', "ㄹㅁ");
        doubleFinalConsonantMap.put('ㄿ', "ㄹㅍ");
        doubleFinalConsonantMap.put('ㅄ', "ㅂㅅ");
    }

    /**
     * 封装返回字符码点以提高可读性
     *
     * @param c
     * @return
     */
    private static int getCodePoint(char c) {
        return (int) c;
    }

    /**
     * 将韩字转换成字母
     *
     * @param originHangul
     * @return
     */
    public static String hangulToJamo(String originHangul) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] originHanguls = originHangul.toCharArray();
        for (char c : originHanguls) {
            if (isHangul(c)) {

                int codePoint = getCodePoint(c);
                codePoint -= HANGUL_OFFSET;

                int tail = (codePoint % 28);
                int vowel = (((codePoint - tail) % 588) / 28);
                int lead = (codePoint / 588);

                stringBuffer.append(leadSet[lead]);
                stringBuffer.append(vowelSet[vowel]);
                if (tail != 0) {
                    stringBuffer.append(tailSet[tail]);
                }
            } else {
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }

    /**
     * 判断是否为韩字
     *
     * @param c
     * @return
     */
    public static boolean isHangul(char c) {
        return (c >= HANGUL_OFFSET) && (c <= HANGUL_OUTSET);
    }

    /**
     * 将含有韩语字母的文字中的韩语字母合成为韩字
     *
     * @param jamo
     * @return
     */
    public static String jamoToHangul(String jamo) {
        boolean lastIsJamo = false;
        int current = 0;
        out:
        while (true) {
            lastIsJamo = false;
            current = 0;
            for (int i = 0; i < jamo.length(); i++) {
                if (i == 0) {
                    lastIsJamo = isJamo(jamo.charAt(i));
                } else if (lastIsJamo && !isJamo(jamo.charAt(i))) {
                    jamo = jamo.replace(jamo.substring(current, i), jamosToHangul(jamo.substring(current, i)));
                    continue out;
                } else if (!lastIsJamo && isJamo(jamo.charAt(i))) {
                    lastIsJamo = true;
                    current = i;
                }
            }
            break;
        }

        return jamo;
    }

    /**
     * 将字母合成为韩字 会去除传入字符串中非韩语字母的字符
     *
     * @param jamos
     * @return
     */
    private static String jamosToHangul(String jamos) {
        StringBuffer resultBuffer = new StringBuffer();
        int offset = 0;
        ArrayList<String> jamoList = new ArrayList<>();
        for (int i = 2; i < jamos.length(); i++) {
            if ((i == jamos.length() - 1) && (!isVowel(jamos.charAt(i)))) {
                jamoList.add(jamos.substring(offset, jamos.length()));
                continue;
            } else if (i == jamos.length() - 1) {
                jamoList.add(jamos.substring(offset, i - 1));
                jamoList.add(jamos.substring(i - 1, jamos.length()));
            } else if (isVowel(jamos.charAt(i))) {
                jamoList.add(jamos.substring(offset, i - 1));
                offset = i - 1;
            }
        }
        for (String string : jamoList) {
            char c;
            int i;
            if (string.length() == 2) {
                i = leadMap.get(string.charAt(0)) * 588 + vowelMap.get(string.charAt(1)) * 28 + 44032;
            } else {
                i = leadMap.get(string.charAt(0)) * 588 + vowelMap.get(string.charAt(1)) * 28
                        + tailMap.get(string.charAt(2)) + 44032;
            }
            c = (char) i;
            resultBuffer.append(c);
        }
        // return addOtherSymbol(resultBuffer.toString());
        return resultBuffer.toString();
    }

    /**
     * 判断是否为母音
     *
     * @param c
     * @return
     */
    public static boolean isVowel(char c) {
        return String.valueOf(vowelSet).contains("" + c);
    }

    /**
     * 判断是否为韩语字母
     *
     * @param c
     * @return
     */
    private static boolean isJamo(char c) {
        String jamo = "ㄱㄲㄳㄴㄵㄶㄷㄸㄹㄺㄻㄼㄽㄾㄿㅀㅁㅂㅃㅄㅅㅆㅇㅈㅉㅊㅋㅌㅍㅎㅏㅐㅑㅒㅓㅔㅕㅖㅗㅘㅙㅚㅛㅜㅝㅞㅟㅠㅡㅢㅣ";
        return jamo.contains("" + c);
    }

    /**
     * 将数字转换为韩语汉字数词
     * 输入格式只能为数字
     * 最大数值为Integer.MAX_VALUE(2147483647)
     * TODO 等以后学习NLP会语义分析后根据语义抓换汉字数词或者固有数词
     *
     * @param n
     * @return
     */
    public static String numberToHangul(int n) {
        if (n == 1) {
            return "일";
        }
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            int temp = n % 10;
            if (temp!=0){
                stringBuilder.append(numberal[i]);
                if (n!=1)
                    stringBuilder.append(number[temp]);
            }


            n /= 10;
            i++;
        }
        return stringBuilder.reverse().toString();
    }

    /**
     * 返回送气音
     * @param c
     * @return
     */
    public static char toAspirated(char c){
        try{
            char result=consonantMap.get(c)[0];
            return result=='\0'? c:result;
        }catch(NullPointerException e){
            return c;
        }
    }

    /**
     * 返回鼻音
     * @param c
     * @return
     */
    public static char toNasal(char c){
        try{
            char result=consonantMap.get(c)[2];
            return result=='\0'? c:result;
        }catch(NullPointerException e){
            return c;
        }
    }

    /**
     * 返回紧音
     * @param c
     * @return
     */
    public static char toFortis(char c){
        try{
            char result=consonantMap.get(c)[1];
            return result=='\0'? c:result;
        }catch(NullPointerException e){
            return c;
        }
    }

    /**
     * 返回收音的代表音
     * @param c
     * @return
     */
    public static char finalConsonantToDelegateConsonant(char c){
        try{
            return delegateConsonantMap.get(c);
        }catch (NullPointerException e){
            return c;
        }

    }

    /**
     * 判断是否为双收音
     * @param c
     * @return
     */
    public static boolean isDoubleFinalConsonant(char c){
        return doubleFinalConsonant.contains(""+c);
    }

    /**
     * 将双收音拆分为两个子音
     * @param c
     * @return
     */
    public static String splitDoubleFinalConsonant(char c){
        try{
            return doubleFinalConsonantMap.get(c);
        }catch (NullPointerException e){
            return ""+c+" ";
        }
    }



}
