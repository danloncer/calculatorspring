package pro.sky.calculatorspring;

public interface CalculatorService {
    Integer findSum(int num1, int num2);
    Integer findDifference(int num1, int num2);
    Integer findMultiply(int num1, int num2);
    Integer findDivide(int num1, int num2);
}
