public class EulerDriver {

	public static void main(String[] args) {

        //Variables
        int initialX = 1;
        int initialY = 2;
        double xValue = 2;
        double stepSize = 0;

        //Creating object
        EulerClass object = new EulerClass(stepSize, initialX, initialY, xValue);

        //Printing values
        System.out.println(object.EulerValue(0.01, initialX, initialY, xValue));
        System.out.println(object.EulerValue(0.005, initialX, initialY, xValue));
        System.out.println(object.function(xValue));

        //Printing percent error
        System.out.println("Percent error: " + object.percentError());

    }

}

