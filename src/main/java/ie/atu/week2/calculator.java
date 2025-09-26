package ie.atu.week2;

public class calculator {
    private int multiply;
    private int add;
    private int subtract;
    private int divide;

    public calculator(int multiply, int add, int subtract, int divide) {
        this.multiply = multiply;
        this.add = add;
        this.subtract = subtract;
        this.divide = divide;
    }
    public int getMultiply() {
        return multiply;
    }
    public int setMultiply() {
        this.multiply = multiply;
    }
    public int getAdd() {
        return add;
    }
    public int setAdd() {
        this.add = add;
    }


}
