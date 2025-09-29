package ie.atu.week2;

public class Calculator {
    private int multiply;
    private int add;
    private int subtract;
    private int divide;

    public Calculator(int multiply, int add, int subtract, int divide) {
        this.multiply = multiply;
        this.add = add;
        this.subtract = subtract;
        this.divide = divide;
    }
    public int getMultiply() {return multiply;}
    public void setMultiply(int multiply) {this.multiply = multiply;}

    public int getAdd() {return add;}
    public void setAdd(int add) {this.add = add;}

    public int getSubtract() {return subtract; }
    public void setSubtract(int subtract) {this.subtract = subtract; }

    public int getDivide() {return divide; }
    public void setDivide(int divide) {this.divide= divide; }


}
