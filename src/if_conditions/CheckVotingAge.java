package if_conditions;

public class CheckVotingAge{
    public static void main(String[] args) {
        checkAge();
    }

   static void checkAge(){
        int age = 17;
        if (age >= 18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println(" Not Eligible for voting");
        }
    }
}