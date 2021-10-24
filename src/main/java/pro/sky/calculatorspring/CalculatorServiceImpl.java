package pro.sky.calculatorspring;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String printHello() {
        return "Добро пожаловать в калькулятор.";
    }

    public String findSum(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String findDifference(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String findMultiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String findDivide(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return "<b>ГлупАЙ человечишка, делить на нуль нельзя!</b>";
        }
        return num1 + " / " + num2 + " = " + (num1/num2);
    }
}