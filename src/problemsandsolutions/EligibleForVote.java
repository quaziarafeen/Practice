package problemsandsolutions;

public class EligibleForVote {

    //Write Java program to allow the user to input his/her age.
    // Then the program will show if the person is eligible to vote.
    // A person who is eligible to vote must be older than or equal to 18 years old.
    //
    //Enter your age: 18
    //
    //You are eligible to vote.

    public static void main(String[] args) {
        EligibleForVote.checkEligibility();
    }



    static void checkEligibility() {

        int age;
       // Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        age = 20;
        if (age >= 18)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("You are not eligible to vote.");


    }

}
