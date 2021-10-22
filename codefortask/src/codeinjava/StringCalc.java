package codeinjava;

public class StringCalc {
    public static int add(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        else if(numbers.contains(",")){
            String[] num = numbers.split(",");
            return convertToInt(num[0]) + convertToInt(num[1]);
        }
        else
            return 1;
    }
    private static int convertToInt(String number){
        return Integer.parseInt(number);
    }   
}
