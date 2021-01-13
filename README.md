# Korean
本工具类用于将韩语文字拆分为韩语字母或将韩语字母组装成为韩语文字
## 韩语文字拆分
    Korean.hangulToJamo("");
使用hangulToJamo方法将传入的字符串转换为韩语字母  
**例如**
```java
import com.yuzheng14.Tools.Korean;
public class Solution{
    public static void main(String[] args){
        System.out.println(Korean.hangulToJamo("계약금 천만 원을 입금하래."));
    }
}
```
## 韩语字母组装为韩语文字
    Korean.jamoToHangul("");
使用jamoToHangul方法将传入的字符串中的韩语字母转换为韩语文字，同时不改变原字符串中的其他部分
**例如**
```java
import com.yuzheng14.Tools.Korean;
public class Solution{
    public static void main(String[] args){
        System.out.println(Korean.jamoToHangul("ㄱㅖㅇㅑㄱㄱㅡㅁ ㅊㅓㄴㅁㅏㄴ ㅇㅝㄴㅇㅡㄹ ㅇㅣㅂㄱㅡㅁㅎㅏㄹㅐ."));  
    }
}
```