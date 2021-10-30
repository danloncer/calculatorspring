package pro.sky.calculatorspring;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public Integer findSum(int num1, int num2) {
        return (num1 + num2);
    }

    public Integer findDifference(int num1, int num2) {
        return (num1 - num2);
    }

    public Integer findMultiply(int num1, int num2) {
        return (num1 * num2);
    }

    public Integer findDivide(int num1, int num2) {
        return (num1/num2);
    }
}