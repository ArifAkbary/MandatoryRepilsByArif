package Mandatory;

public class mandatoryRepils217 {

    public static void main(String[] args ){



        int numbers[]={12,12,13,45,78,7,7};
        String temp="";
        int count=0;
        // Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {

            boolean duplicate = false;
            for(int j = 0; j < numbers.length; j++) {
                if ((i != j) && numbers[i] == numbers[j]) {
                    duplicate = true;
                }
            }

            if (duplicate) {
                if(!temp.contains(""+numbers[i]))
                {
                    temp+=numbers[i]+", ";//adding a number if its duplicate
                    count++;//counting unique duplicate number
                }
                // System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("the numbers which are duplicate are "+count);

    }


}
