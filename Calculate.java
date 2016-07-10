public class Calculate {
    public static void main(String[] args) {
            System.out.println("Enter two numbers and print the action which will occur above them");
            System.out.println("Actions: plus, minus, multiply, divide, degree");
	    calculator(args);	
    }

    public static boolean tryParseDouble(String s) {
        try {
            new Double(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void calculator(String[] args) {

        if(args.length == 3 && tryParseDouble(args[0]) && tryParseDouble(args[1])) {
            double firstNumber = Double.valueOf(args[0]);
            double secondNumber = Double.valueOf(args[1]);
            double result = 0;
            String action = args[2];
            switch (action) {
                case "plus":
                    result = plus (firstNumber, secondNumber);
                    break;
                case "minus":
                    result = minus (firstNumber, secondNumber);
                    break;
                case "multiply":
                    result = multiply (firstNumber, secondNumber);
                    break;
                case "divide":
                    result = divide (firstNumber, secondNumber);
                    break;
                case "degree":
                    result = degree (firstNumber, secondNumber);
                    break;
                default:
                    action = null;
                    System.out.println("Error. Not correct action");
            }
            if(action != null) {
                System.out.println("Calculate...");
                System.out.println(firstNumber + " " + action + " " + secondNumber + " = " + result);
            }
        } else {
            System.out.println("Error. Please enter two numbers and print the action");
        }
    }

    public static double plus(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double minus(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static double degree(double firstNumber, double secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }
}
