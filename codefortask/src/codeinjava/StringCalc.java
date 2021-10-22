package codeinjava;

public class StringCalc {
    public static int add(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        else{
		    numbers.replaceAll("\n", ",");
			String numList[] = splitNumbers(numbers, ",");
			numList= splitNumbers(numbers, ",|\n");
			return sum(numList);
		}
    }
    private static String[] splitNumbers(String numbers, String delim){
	    return numbers.split(delim);
	}
        
    private static int sum(String[] num){
        int sum = 0;
        for(String eachnum : num){
            sum += convertToInt(eachnum);
        }
        return sum;
    }
    
    private static int convertToInt(String nom){
        return Integer.parseInt(nom);
    }   
}
