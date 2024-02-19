package day80;

public class ReverseStringII {
    public static String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int n = str.length;
        for(int i = 0 ; i <= n-1; i += 2*k){
            if(i+k-1 <= n-1){
                reverseK(i,i+k-1,str);
            }else{
                reverseK(i,n-1,str);
            }
        }
        return new String(str);
    }

    public static void reverseK(int i, int j, char[] str){
        while(i < j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        String result = reverseStr("abcdefgh", 2);
        System.out.println(result);
    }
}
