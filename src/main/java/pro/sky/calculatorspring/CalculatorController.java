package pro.sky.calculatorspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorServiceImpl;

    public CalculatorController(CalculatorService calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping
    public String printHello() {
        return calculatorServiceImpl.printHello();
    }

    @GetMapping("/plus")
    public String findSum(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.findSum(num1, num2);
    }

    @GetMapping("/minus")
    public String findDifference(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.findDifference(num1, num2);
    }

    @GetMapping("/multiply")
    public String findMultiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.findMultiply(num1,num2);
    }

    @GetMapping("/divide")
    public String findDivide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.findDivide(num1, num2);
    }
}