import java.util.Scanner;

public class Introduction {

    // Method that displays and obtains the taxpayer's filing status
    public static int introduction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and welcome!");

        System.out.println("""
                Enter your filing status:\s
                1) Unmarried Individuals (Single)
                2) Heads of Households
                3) Married Individuals Filing Separate Returns
                4) Married Individuals Filing Joint Returns and Surviving Spouses
                5) Estates and Trusts
                """
        );
        return scanner.nextInt();
    } // End introduction method

    // Method that obtains the taxpayer's gross salary
    public static double getGrossSalary() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your total income: ");
        return scanner.nextDouble();

    } // End getGrossSalary

} // End Introduction class
