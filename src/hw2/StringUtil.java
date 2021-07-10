package hw2;

import java.util.Arrays;

public class StringUtil {
    private String A;
    private String B;

    public StringUtil(String A, String B){
        this.A=A;
        this.B=B;
    }

    public int sumOfLengths(){
        return this.A.length()+this.B.length();
    }

    public String larger(){
        if(this.A.compareTo(this.B)>0)
            return "Yes";
        return "No";
    }
    public void upperCase(){
        String temp1 = this.A.substring(0, 1).toUpperCase() + this.A.substring(1);
        String temp2 = this.B.substring(0, 1).toUpperCase() + this.B.substring(1);
        System.out.println(temp1+" "+temp2);

    }
    public String isAnagram(){
        if ( A.length() != B.length() )
            return "Not Anagrams";
        A=A.toLowerCase();
        B=B.toLowerCase();

        char[] Aarr = A.toCharArray();
        char[] Barr = B.toCharArray();

        Arrays.sort(Aarr);
        Arrays.sort(Barr);

        if (Arrays.equals(Aarr, Barr))
            return "Anagrams";
        return "Not Anagrams";
    }
}
