public class Calculator {

    private float inputNum1;
    private float inputNum2;

    public Calculator(float inputNum1, float inputNum2) {
        this.inputNum1 = inputNum1;
        this.inputNum2 = inputNum2;
    }

    public float getInputNum1() {
        return inputNum1;
    }

    public void setInputNum1(float inputNum1) {
        this.inputNum1 = inputNum1;
    }

    public float getInputNum2() {
        return inputNum2;
    }

    public void setInputNum2(float inputNum2) {
        this.inputNum2 = inputNum2;
    }

    public float sum (){
        return inputNum1+inputNum2;
    }

    public float subtraction (){
        return inputNum1-inputNum2;
    }

    public float multiplication (){
        return inputNum1*inputNum2;
    }

    public float division (){
        return inputNum1/inputNum2;
    }
}
