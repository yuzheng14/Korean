# Korean
本工具类用于将韩语文字拆分为韩语字母或将韩语字母组装成为韩语文字
## 韩语文字拆分
    Korean.hangulToJamo("");
使用hangulToJamo方法将传入的字符串转换为韩语字母  
**例如:**
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
**例如:**
```java
import com.yuzheng14.Tools.Korean;
public class Solution{
    public static void main(String[] args){
        System.out.println(Korean.jamoToHangul("ㄱㅖㅇㅑㄱㄱㅡㅁ ㅊㅓㄴㅁㅏㄴ ㅇㅝㄴㅇㅡㄹ ㅇㅣㅂㄱㅡㅁㅎㅏㄹㅐ."));  
    }
}
```
## 其他方法
>|方法名称|说明|
>|:-----|:-----:|
>|isHangul|判断字符是否为韩语字符|
>|isVowel|判断字符是否为母音|
>|isJamo|判断是否为韩语字母|
>|numerToHangul|将传入的数字转换为韩语|
>|toAspirated|返回送气音|
>|toNasal|返回鼻音|
>|toFortis|返回紧音|
>|finalConsonantToDelegateConsonant|返回收音的代表音|
>|isDoubleFinalConsonant|判断是否为双收音|
>|splitDoubleFinalConsonant|将双收音拆分为两个子音|
****
目前正在申请上传至Maven仓库
# 更新说明
## 2021.1.30
修复numberToHangul返回字符串最后会有空格