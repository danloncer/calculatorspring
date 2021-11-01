package pro.sky.calculatorspring;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public int findSum(int num1, int num2) {
        return (num1 + num2);
    }

    public int findDifference(int num1, int num2) {
        return (num1 - num2);
    }

    public int findMultiply(int num1, int num2) {
        return (num1 * num2);
    }

    public int findDivide(int num1, int num2) {
        return (num1/num2);
    }
}