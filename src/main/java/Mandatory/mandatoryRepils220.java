package Mandatory;


public class mandatoryRepils220 {

    /*
Format the String:
Write the logic to format the string in the below given format
xxx-xxx-xxx
after each 3 digits ther should be dash("-")
if there are any spaces in the input remove those
input ["00-44   48 555555"]
output ["004-448-555-555"]
input ["00-44   48 555"]
output["004-448-555"]
input ["00-44  #$% 48 55"]
output ["004-448-55"]
     */
    public static void main(String[] args) {
        String Str = new String("00-44   48 555555");
        System.out.println(Str.replaceAll(" ", "").replace("-",""));












    }

}




