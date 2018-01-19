public class FactorialCount {

    public static int multiply(int fact){
        if((fact) > 2){
            return fact * multiply(fact-1);
        }
        else return 2;
    }
    public static void main(String  [] args){
        int fact = 8;
        int result;
        if(fact > 1){
            result = multiply(fact);
        }
        else result = fact;
        System.out.println(result);
    }
}
