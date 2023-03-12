public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        if (firstNumber < 0 && secondNumber<0) {
            firstNumber *= -1;
            secondNumber *= -1;
        }
        if (Math.floor(firstNumber)!=Math.floor(secondNumber)){
            return false;
        }else{
            double firstNumberDecimals = firstNumber - Math.floor(firstNumber);
            double secondNumberDecimals = secondNumber - Math.floor(secondNumber);
            firstNumberDecimals = Math.round(firstNumberDecimals * 100000);
            secondNumberDecimals = Math.round(secondNumberDecimals * 100000);

            int firstNumberToInt = (int) firstNumberDecimals;
            int secondNumberToInt = (int) secondNumberDecimals;

            firstNumberToInt = firstNumberToInt / 100;
            secondNumberToInt = secondNumberToInt / 100;

            if (firstNumberToInt == secondNumberToInt) {
                return true;
            } else {
                return false;
            }
        }
    }
}