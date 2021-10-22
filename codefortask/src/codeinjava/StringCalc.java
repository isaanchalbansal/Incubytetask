package codeinjava;

public class StringCalc {
    public static int add(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        else if(numbers.contains(",")){
            String[] num = numbers.split(",");
            int sum = 0;
            for(String eachnum : num){
                sum += convertToInt(eachnum);
            }
            return sum;
        }
        else 
            return 1; 
    }
    private static int convertToInt(String nom){
        return Integer.parseInt(nom);
    }   
}
