package exercicio_01;

public enum MathOperations {
    ADDITION("+"), SUBTRACION("-"), MULTIPLICATION("*"), DIVISION("/"), ABSENT("∅");

    private String symbol;

    MathOperations(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol(){
        return this.symbol;
    }
}
