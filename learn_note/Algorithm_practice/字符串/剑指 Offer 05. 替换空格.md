# 题目

    请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

    示例 1：
    输入：s = "We are happy."
    输出："We%20are%20happy."

    限制：
    0 <= s 的长度 <= 10000

# 解答

方法1（maple）：

```java
s.replaceAll(" ", "%20");

# 用时以及内存的消耗都会很大
```

方法2:

```java
StringBuffer res = new StringBuffer();
for (char c : s.toCharArray()){
    if(c == ' '){
        res.append("%20");
        continue;
    }
    res.append(c);
}
res.toString();

# 用时很快，内存消耗超50%
```

