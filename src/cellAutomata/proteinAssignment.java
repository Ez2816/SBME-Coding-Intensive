package cellAutomata;

public class proteinAssignment {

    private String dnaSeq;

    public proteinAssignment(String dnaSeq){
        this.dnaSeq = dnaSeq;
    }

    public boolean isProtein(){
        if (this.dnaSeq.contains("ATG")&&(this.dnaSeq.contains("UAA")||this.dnaSeq.contains("UAG")||this.dnaSeq.contains("UGA"))){
            if(this.dnaSeq.indexOf("ATG")==0){
                return true;

            }

        }

        return false;

    }

    private static String mutate (String dnaSeq, String codon, String mutation){
        return dnaSeq.replace(codon, mutation);

    }
}
