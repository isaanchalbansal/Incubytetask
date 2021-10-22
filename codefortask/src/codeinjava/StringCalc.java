package codeinjava;

public class StringCalc {
    public static int add(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        else{
			String numList[] = splitNumbers(numbers, ",|\n");
			String delimiter = ",";
			if(numbers.matches("//(.*)\n(.*)")){
			    delimiter = Character.toString(numbers.charAt(2));
				numbers = numbers.substring(4);
			}

			numList = splitNumbers(numbers, delimiter + "|\n");
			return sum(numList);
		}
    }
    
    private static String[] splitNumbers(String numbers, String delim){
	    return numbers.split(delim);
	}

    private static int sum(String[] num){
        int sum = 0;
        String negative = "";

        for(String eachnum : num){
           if(convertToInt(eachnum) < 0){
               if(negative.equals(""))
                   negative = eachnum;
               else
                   negative += ("," + eachnum);
           }
           sum += convertToInt(eachnum);
       }
       if(!negative.equals("")){
           throw new IllegalArgumentException("Negatives not allowed: " + negative);
       }
       return sum;
   }

    private static int convertToInt(String nom){
        return Integer.parseInt(nom);
    }   
}
