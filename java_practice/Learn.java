package java_practice;

public class Learn{
    public static void main(String[] args) {
        String s = "We are happy";
        // for(int i =0; i < s.length(); i++){
        //     if()
        // }
        StringBuffer res = new StringBuffer();
        for (char c : s.toCharArray()){
            if(c == ' '){
                res.append("%20");
                continue;
            }
            res.append(c);
        }
        res.toString();
        System.out.println(res);
        // System.out.println(s.replaceAll(" ", "%20"));
    }
}