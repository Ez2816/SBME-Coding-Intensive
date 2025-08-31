package recursion;

//syntax for substring from stack overflow, basic brainstorming and logic clearance was done in collaboration with chatgpt but all programming and ideas are from me
public class Palindrome {

    public static boolean checkPalidromicSeq(String fivePrimeToThreePrime, String threePrimeToFivePrime) {
        // Your recursive code here

        if  (fivePrimeToThreePrime.length() != threePrimeToFivePrime.length()){
            return false;
        }

        if (fivePrimeToThreePrime.length() == 0){
            return true;
        } else if (fivePrimeToThreePrime.charAt(0) == threePrimeToFivePrime.charAt(threePrimeToFivePrime.length()-1)){
            return checkPalidromicSeq(fivePrimeToThreePrime.substring(1,fivePrimeToThreePrime.length()), threePrimeToFivePrime.substring(0,threePrimeToFivePrime.length()-1));
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        System.out.println(checkPalidromicSeq("ATGC","GCAT"));
        System.out.println(checkPalidromicSeq("GAATTC","CTTAAG"));
        System.out.println(checkPalidromicSeq("GGATCC","CCTAGG"));
    }
}
