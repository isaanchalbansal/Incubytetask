package codeinjava;

public class StringCalc {
    public static int add(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        else if(numbers.contains(",")){
            return sum(splitNumbers(numbers));
        }
        else
            return 1;
    }
        
    private static String[] splitNumbers(String num){
        return num.split(",");
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
