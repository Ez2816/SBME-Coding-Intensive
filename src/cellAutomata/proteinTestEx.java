package cellAutomata;

public class proteinTestEx {

    private String dnaSeq;

    public proteinTestEx(String dnaSeq){
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

    //main function to run
    public static void main (String[] args){
    }
}
