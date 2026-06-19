public class FinancialForecast {

    // Recursive Method
    static double futureValueRecursive(double currentValue, double growthRate, int years) {

        if (years == 0)
            return currentValue;

        return futureValueRecursive(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Iterative Method
    static double futureValueIterative(double currentValue, double growthRate, int years) {

        for (int i = 0; i < years; i++) {
            currentValue = currentValue * (1 + growthRate);
        }

        return currentValue;
    }

    public static void main(String[] args) {

        double currentValue = 1000;
        double growthRate = 0.10;
        int years = 5;

        double recursiveResult = futureValueRecursive(currentValue, growthRate, years);
        double iterativeResult = futureValueIterative(currentValue, growthRate, years);

        System.out.printf("Recursive Result after %d years: %.2f\n", years, recursiveResult);
        System.out.printf("Iterative Result after %d years: %.2f\n", years, iterativeResult);
    }
}