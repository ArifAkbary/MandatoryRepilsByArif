package Mandatory;

public class mandatoryRepils226 {
    // reverse a sentence not word by word
    public static String reverse(String sentence){
        int z=sentence.indexOf(" ");
        if(z==-1)
            return sentence;
        return reverse(sentence.substring(z+1)) +" "+sentence.substring(0,z);
    }
    public static void main(String[] args) {
       String arif="I am a java Programmer";
        //String arif="Syntax is Great";
        String rev=reverse(arif);
        System.out.println("Reverse of the sentence:   " +rev);
    }
}
