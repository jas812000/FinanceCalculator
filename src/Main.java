public class Main {
    public static void main(String[] args) {

        // Get user inputs from the Introduction class
        int statusInput = Introduction.introduction();
        double grossSalary = Introduction.getGrossSalary();

        // Create an instance of the TaxTableCalculator
        TaxTableCalculator taxCalculator = new TaxTableCalculator(statusInput, grossSalary);

        // Calculate and print the tax rate based on the user's inputs
        taxCalculator.getTaxRate();

    } // End Main method
} // End Main class