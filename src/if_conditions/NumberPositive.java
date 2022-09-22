package if_conditions;

public class NumberPositive {
public static void main(String[] args) {
    isPostiveNumber();
}

static void isPostiveNumber(){
    int num = -5;
    if (num > 0)
        System.out.println("Number is Postive");
    
    else if(num == 0)
   
      System.out.println("Number is Zero");

    else {
        System.out.println("Number is Negative");
    }  
   
    
}
}
