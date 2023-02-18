public class EulerClass {

private double stepSize;
private int initialX;
private int initialY;
private double xValue;

public EulerClass(double stepSize, int initialX, int initialY, double xValue){
    this.stepSize = stepSize;
    this.initialX = initialX;
    this.initialY = initialY;
    this.xValue = xValue;
}

public double EulerValue(double stepSize, double initialX, double initialY, double xValue){
    double yValue = initialY;
    while (initialX < xValue) {
        yValue = yValue + stepSize * diffEQ(initialX, yValue); 
        initialX = initialX + stepSize;
    }
    return yValue;
}

public double diffEQ(double xValue, double yValue){
    return 4-(3*yValue)/xValue; 
}

public double function(double xValue){
    return (Math.pow(xValue,4)+1)/(Math.pow(xValue,3));
}

public double percentError(){
    double actual = function(xValue);
    double estimated = EulerValue(0.005, initialX, initialY, xValue);
    double error = Math.abs(actual - estimated);
    return (error / actual) * 100.0;
}

//Getters

public double getStepSize(){
    return stepSize;
}

public int getInitialX() {
    return initialX;
}

public int getInitialY() {
    return initialY;
}

public double getxValue() {
    return xValue;
}

//Setters

public void setStepSize(double stepSize) {
    this.stepSize = stepSize;
}

public void setInitialX(int initialX) {
    this.initialX = initialX;
}

public void setInitialY(int initialY) {
    this.initialY = initialY;
}

public void setxValue(double xValue) {
    this.xValue = xValue;
}

}