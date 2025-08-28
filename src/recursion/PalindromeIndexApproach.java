package recursion;


//this was done with help of ChatGPT

public class PalindromeIndexApproach {
    public static boolean checkPalidromicSeq(String fivePrimeToThreePrime, String threePrimeToFivePrime) {
        if (fivePrimeToThreePrime.length()!=threePrimeToFivePrime.length()) {
            return false;
        }

        return helper(fivePrimeToThreePrime,threePrimeToFivePrime,0,fivePrimeToThreePrime.length()-1);
    }
    public static boolean helper(String A, String B, int i, int j) {
        if (i >= A.length()){
            return true;
        }

        if (A.charAt(i)!=B.charAt(j)){
            return false;
        } else {
            return helper(A,B,i+1,j-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(checkPalidromicSeq("ATGC","GCAT"));
        System.out.println(checkPalidromicSeq("GAATTC","CTTAAG"));
        System.out.println(checkPalidromicSeq("GGATCC","CCTAGG"));
    }
}
