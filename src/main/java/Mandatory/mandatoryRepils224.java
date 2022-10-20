package Mandatory;

import java.util.LinkedHashSet;

public class mandatoryRepils224 {
    // remove duplicate words from String
    static void removeDuplicate(String arif){
        LinkedHashSet<Character>set=new LinkedHashSet<>();
        for(int i=0; i<arif.length(); i++){
            set.add(arif.charAt(i));
        }
        for(Character arif1:set){
            System.out.print(arif1+" ");
        }
    }
    public static void main(String[] args) {
        String arif="aabbcde";
       // String arif="aabbcc";
       // String arif="aabbcca";
       // String arif="aabbccaddda";
        removeDuplicate(arif);
    }
}
