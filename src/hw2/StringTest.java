package hw2;

public class StringTest {
    public static void main(String[] args) {
        String s1="tree";
        String s2="fire";
        StringUtil su=new StringUtil(s1,s2);
        System.out.println(su.sumOfLengths());
        System.out.println(su.larger());
        su.upperCase();
        System.out.println(su.isAnagram());
    }
}
