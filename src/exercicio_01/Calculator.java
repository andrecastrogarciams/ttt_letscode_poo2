package exercicio_01;

public class Calculator {
    private ICalculation iCalculation;

    public Calculator(ICalculation iCalculation){
        this.iCalculation = iCalculation;
    }

    public Double processCalculation (double numberOne, double numberTwo){
        return iCalculation.resultCalc(numberOne, numberTwo);
    }
}
